/*	
 	This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program; if not, write to the Free Software
    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA 
 
 	Author : Faisal Adnan
 	Email  : faisal.adnan@gmail.com
 	
 */

package com.frozenwired;

import net.rim.device.api.ui.Field;
import net.rim.device.api.ui.Manager;
import net.rim.device.api.ui.TouchEvent;

public class CustomGridFieldManager extends Manager {
	private int numColumns;

	public CustomGridFieldManager(int numColumns, long style) {
		super(style);
		this.numColumns = numColumns;
	}

	protected void sublayout(int width, int height) {
		int[] columnWidths = new int[numColumns];
		int availableWidth = width;
		int availableHeight = height;
		
		// For each column size all the fields and get the maximum width
		for(int column = 0; column < numColumns; column++) {		
			for(int fieldIndex = column; fieldIndex < getFieldCount(); fieldIndex += numColumns) {
				Field field = getField(fieldIndex);
				layoutChild(field, availableWidth, availableHeight);
				if (field.getWidth() > columnWidths[column]) {
					columnWidths[column] = field.getWidth();
				}
				
			}
			
			availableWidth -= columnWidths[column];
		}
		
		int currentRow = 0;
		int currentRowHeight = 0;
		int rowYOffset = 0;
		
		// Set the position of each field
		for(int fieldIndex = 0; fieldIndex < getFieldCount(); fieldIndex++) {
			Field field = getField(fieldIndex);
			int fieldOffset = 0;
			if ((field.getStyle() & Field.FIELD_RIGHT) == Field.FIELD_RIGHT) {
				fieldOffset = columnWidths[fieldIndex % numColumns] - field.getWidth();
			}
			if (fieldIndex % numColumns == 0) {
				setPositionChild(field, 0 + fieldOffset, rowYOffset);
			}
			else {
				setPositionChild(field, columnWidths[(fieldIndex % numColumns) - 1] + fieldOffset, rowYOffset);
			}
			
			if (field.getHeight() > currentRowHeight) {
				currentRowHeight = field.getHeight();
			}
			
			if (fieldIndex % numColumns == numColumns - 1) {
				currentRow ++;
				rowYOffset += currentRowHeight;
				currentRowHeight = 0;
			}
		}
		
		int totalWidth = 0;
		for(int i = 0; i < numColumns; i++) {
			totalWidth += columnWidths[i];
		}
		setExtent(totalWidth, rowYOffset + currentRowHeight);
	}
	protected boolean touchEvent(TouchEvent message)
	{
		int touchX = message.getX(1);
		int touchY = message.getY(1);
		System.out.println("CustomGridFieldManager touchEvent touchX " + touchX + " touchY " + touchY);
		setFocus(touchX, touchY, 0);
		return super.touchEvent(message);
	}
}
