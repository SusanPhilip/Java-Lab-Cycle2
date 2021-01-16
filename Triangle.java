/*3.Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating
a class named 'Triangle' without any parameter in its constructor.*/

import java.lang.Math; 
public class Triangle {
      public static void main(String args[]) {
    	  Triangle ob=new Triangle();
      }	 
    	  
     
      Triangle()
      {   int x=3,y=4,z=5;
    	  int p;
    	  p=x+y+z;
    	  System.out.println("Perimeter of the triangle= "+p);
    	  double a;
    	  double s;
    	  s=(x+y+z)/2;
    	  a=Math.sqrt(s*(s-x)*(s-y)*(s-z));
    	  System.out.println("Area of the triangle= "+a);
      }
}
