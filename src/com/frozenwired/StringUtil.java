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

public class StringUtil {
	public static String double2str(double d, int noOfDecimalDigit)
	{
		String str = "";
		String ds = Double.toString(d);
		if (d == 0)
			ds = "0." + generateZeros(noOfDecimalDigit);
		if (ds.length() < noOfDecimalDigit+2)
			ds = ds + generateZeros(noOfDecimalDigit+2-ds.length()); 
		int delimiterIndex = ds.indexOf(".");
		int decLen = ds.substring(delimiterIndex, ds.length()).length()-1; 
		if (decLen < noOfDecimalDigit+2)
			ds = ds + generateZeros(noOfDecimalDigit+2-decLen);
		str = ds.substring(0, delimiterIndex) + ds.substring(delimiterIndex, delimiterIndex+noOfDecimalDigit+1);
		return str;
	}
	public static String generateZeros(int n)
	{
		String res = "";
		for (int i=0;i<n;i++)
		{
			res = res + "0";
		}
		return res;
	}
}
