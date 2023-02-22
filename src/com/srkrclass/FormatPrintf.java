package com.srkrclass;

public class FormatPrintf 
{  
	public static void main(String[] args) 
	{  
		int n = 713;  
		float x = 45.86f;  
		double dbl= 56.754;  
		String str = "Delhi";  
		char ch= 'A';  
		System.out.printf("%d %f %f %C\t%s\n", n, x, dbl, ch, str);  // for conversion into hexadecimal number  
		System.out.printf("%X \n",17);  // for conversion into octal number  
		System.out.printf("%o\n", 163);  
	}
}

