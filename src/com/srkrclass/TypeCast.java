package com.srkrclass;

class TypeCast{ 
	public static void main (String Str[])
	{  int a = 4, b = 8,c = 9, d, e; //Declaration of variables  
	double x =3.0, y = 6.5, z, k; //Declaration of variables  
	d = c/a; //Operation division  
	k = a + y; //Operation plus  
	e = a + (int)y; //y is cast to int and added  
	z = (double)c/a;// c is cast to double before division  // the following are output statements  
	System.out.println ("k = " + k + ", e = " + e);  
	System.out.println ("d = " + d+ ", z = " + z);  
	}
}

