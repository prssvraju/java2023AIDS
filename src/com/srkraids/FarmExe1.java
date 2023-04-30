package com.srkraids;
import java.io.*;

class Farm {
	double length;
	double width;
	double area() {
		return length*width;
	}
}

public class FarmExe1
{	
  public static void main (String args [])
  {  
	  Farm myFarm = new Farm(); //defining object of Farm  
	  Farm myFarm2 = new Farm();
	  myFarm.width = 20.0;// accessing the variables  
	  myFarm.length = 40.0;  
	  System.out.println ("Area of myFarm = " +  myFarm.area()); 
	  myFarm2= myFarm;
	  System.out.println ("Area of myFarms2 = " + myFarm2.area()); 
	  myFarm2.width =25;
	  System.out.println (" myFarms2 Width = " + myFarm2.width);
	  System.out.println (" myFarms1 Width = " + myFarm.width);
	  
	  System.out.println ("Area of myFarm = " +  myFarm.area()); 

	  

	  

  }  
 } 
