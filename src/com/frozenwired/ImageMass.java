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

import net.rim.device.api.system.EncodedImage;
import net.rim.device.api.ui.Color;
import net.rim.device.api.ui.Graphics;

public class ImageMass extends Mass {
	private EncodedImage image;
	public ImageMass(double mass, EncodedImage image) {
		super(mass);
		this.image = image;
		// TODO Auto-generated constructor stub
	}

	public void draw(Graphics g, CanvasCoordinate coordinateOrigin,
			boolean isFocus) {
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
		g.drawImage(coordinateOrigin.getX()-image.getWidth()/2, 
				coordinateOrigin.getY()+10, 
				image.getWidth(), image.getHeight(), 
				image, 0, 0, 0);
	}
}
