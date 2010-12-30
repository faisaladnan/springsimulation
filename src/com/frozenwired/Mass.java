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

public abstract class Mass implements GaugeListener {
	private double mass;
	public Mass(double mass)
	{
		this.mass = mass;
	}
	public void setMass(double mass) {
		this.mass = mass;
	}
	public double getMass() {
		return mass;
	}
	public abstract void draw(Graphics g, CanvasCoordinate coordinateOrigin, boolean isFocus);
	
	public void onValueChange(int oldValue, int newValue, int context) {
		this.mass = newValue;		
	}
	public void onValueChange(double oldValue, double newValue, int context) {
		this.mass = newValue;		
	}		
}
