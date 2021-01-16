/*1.Write a Java class having overloaded methods to calculate area of rectangle
and circle.*/

import java.io.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		DemoArea ob=new DemoArea();
		double r,l,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle: ");
		r=sc.nextDouble();
		ob.area(r);
		System.out.println("Enter the length of rectangle: ");
		l=sc.nextDouble();
		System.out.println("Enter the breadth of rectangle: ");
		b=sc.nextDouble();
		ob.area(l,b);

	}

}
class DemoArea
{   double a;
	void area(double r)
	 {
		a=3.14*r*r;
		System.out.println("Area of circle: "+a);
	 }
	void area(double l,double b)
	 {
		a=l*b;
		System.out.println("Area of rectangle: "+a);
	 }
}