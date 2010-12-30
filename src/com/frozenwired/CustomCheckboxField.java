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
import net.rim.device.api.ui.component.CheckboxField;

public class CustomCheckboxField extends CheckboxField {
	public CustomCheckboxField(String label, boolean checked, long style)
	{
		super(label, checked, style);
	}
	
	public CustomCheckboxField(String label, boolean checked)
	{
		super(label, checked);
	}
	
	public void drawFocus(Graphics g, boolean on)
	{
		
	}
	protected void layout(int width, int height) {		
		super.layout(width, height);
		setExtent(width, 21);
	}	
}