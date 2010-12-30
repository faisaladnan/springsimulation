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

import net.rim.device.api.ui.Color;
import net.rim.device.api.ui.Graphics;

public class RectMass extends Mass {
	private int width;
	private int height;
	public RectMass(double mass, int width, int height) {
		super(mass);
		this.setWidth(width);
		this.setHeight(height);
	}

	public void draw(Graphics g, CanvasCoordinate coordinateOrigin, boolean isFocus) {
		// draw initial line
		g.drawLine(coordinateOrigin.getX(), coordinateOrigin.getY(), 
				coordinateOrigin.getX(), coordinateOrigin.getY()+10);
		if (isFocus)
		{
			g.setColor(Color.BLUE);
		} else
		{
			g.setColor(Color.BLACK);
		}	
		g.drawRect(coordinateOrigin.getX()-getWidth()/2, 
				coordinateOrigin.getY()+10, 
				getWidth(), getHeight());		
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWidth() {
		return width;
	}
}
