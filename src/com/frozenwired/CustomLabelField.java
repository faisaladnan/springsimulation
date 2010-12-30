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

import net.rim.device.api.ui.Graphics;
import net.rim.device.api.ui.component.LabelField;

public class CustomLabelField extends LabelField {
	String label;
	public CustomLabelField(Object text, long style)
	{
		super(text, style);
		if (text instanceof String)
			this.label = (String)text;
	}
	protected void paint(Graphics graphics)
	{
		graphics.drawText(label, 0, (getHeight()-getFont().getHeight())/2);
	}
	protected void layout(int width, int height) {
		setExtent(200, 21);
	}	
	public void setText(Object text)
	{
		if (text instanceof String)
			this.label = (String)text;
		invalidate();
	}
}
