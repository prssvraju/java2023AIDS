package com.srkrclass;

class SymConstants  
{  
	public static final double PI = 3.1415926535; 
	public static final int c = 299792458;  
}// value of constants defined  
public class ConstantsDemo
{// class containing main method  
	public static void main (String Str[])
	{  
		Double r = 25.0, perimeter;// declaring the variables  
		perimeter = SymConstants.PI*2*r;  
		System.out.println("radius=" + r);  
		System.out.println("Perimeter of circle=" + perimeter);  
	}
}

