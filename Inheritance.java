/*5.Create a class with a method that prints "This is parent class" and its subclass with another method that
prints "This is child class". Now, create an object for each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class*/

import java.io.*;
class Parent
{
	void method()
	{
		System.out.println("This is parent class");
	}
}
class Child extends Parent
{
	void method1()
	{
		System.out.println("This is child class");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Parent ob=new Parent();
		Child ob1=new Child();
		ob.method();      //Calling method by parent class object
		ob1.method1();    //Calling method1 by child class object
		ob1.method();     //Calling method by child class object

	}

}
