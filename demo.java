/*4.Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its
length and breadth as parameters of its constructor and having a method named 'returnArea' which returns
the area of the rectangle. Length and breadth of rectangle are entered through keyboard.*/

import java.util.Scanner;
public class demo {
      public static void main(String args[])
      {
    	  int l,b,area;
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter the length of the rectangle: ");
    	  l=sc.nextInt();
    	  System.out.println("Enter the breadth of the rectangle: ");
    	  b=sc.nextInt();
    	  Area ob=new Area(l,b);
    	  area=ob.returnArea();
    	  System.out.println("Area of rectangle= "+area);
    	  
      }
      
}
class Area
{   int l,b;
	Area(int l,int b)
	{
		this.l=l;
		this.b=b;
		
	}
	int returnArea()
	{
		return l*b;
	}
}