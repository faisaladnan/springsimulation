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

public class SpringRungeKutta extends RungeKutta {
	public final static int SPRING_CONSTANT_CTX = 1;
	public final static int SPRING_DAMPING_CTX = 2;
	public final static int SPRING_MASS_CTX = 3;
	Spring spring;
	Mass mass;
	private final double GRAVITATIONAL_CONSTANT = 10;
	private boolean gravitationExist = true;
	public SpringRungeKutta(Spring spring, Mass mass)
	{
		this.spring = spring;
		this.mass = mass;
		this.setNumVars(2);
		init();
	}
	public double diffeq0(double t, double[] x)   // t = time, x = array of variables
	{
		return x[1];  // x' = v
	}

	public double diffeq1(double t, double[] x)   // t = time, x = array of variables
	{
		// v' = -(k/m)(x - R) - (b/m) v
		double r = -spring.getSpringConstant()*(x[0] - spring.getOrigin() - spring.getRestLen())
		- spring.getDamping()*x[1];
		if (this.isGravitationExist())
			return (r+mass.getMass()*this.GRAVITATIONAL_CONSTANT)/mass.getMass();
		else
			return (r)/mass.getMass();
	}

	public double diffeq2(double t, double[] x)
	{ return 0; }
	public double diffeq3(double t, double[] x)
	{ return 0; }
	public double diffeq4(double t, double[] x)
	{ return 0; }
	public double diffeq5(double t, double[] x)
	{ return 0; }
	public double diffeq6(double t, double[] x)
	{ return 0; }
	public double diffeq7(double t, double[] x)
	{ return 0; }	
	
	public double getNextSpringLength()
	{
		return vars[0];
	}
	
	public double getNextSpringSpeed()
	{
		return vars[1];
	}
	public void init()
	{
		this.simulationTime = 0;
		this.vars[0] = spring.getInitialLen();
		this.vars[1] = 0;
	}
	public void setNumVars(int numVars) {
		this.numVars = numVars;
	}
	public void setGravitationExist(boolean gravitationExist) {
		this.gravitationExist = gravitationExist;
	}
	public boolean isGravitationExist() {
		return gravitationExist;
	}
}
