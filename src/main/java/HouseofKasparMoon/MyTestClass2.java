package HouseofKasparMoon;

import Javapractice.Lec10Inheritance; // Used this code to import "Lec10Inheritance" class from "Javapractice" package.
// Syntax to import any class: import PackageName.ClassName;

public class MyTestClass2 extends Lec10Inheritance {
	/*
	 * Here I have extended my "MyTestClass2" class with "Lec10Inheritance" so that we can use that class's methods in this class.
	 * Syntax of Creating an Object:
	 * ClassName ObjectName = new ClassName();
	 */
	
	public static void main(String[] args) {
		ArithmeticClass myObject1 = new ArithmeticClass(); // This object I have created to call "ArithmeticClass" from the same package as this class.
		MyTestClass2 myObject2 = new MyTestClass2(); // This Object I have created to use methods from "Lec10Inheritance" class which is belongs to another class.
		/*
		 * Syntax to use a object: 
		 * ObjectName.Method(); // for method without parameters.
		 * ObjectName.Method(parameter1, parameter2.... as needed); // for method with parameters.
		 */
		myObject1.add(10, 30); // This method 'add' I am calling from "ArithmeticClass" class with parameters.
		myObject2.kasprot(); // This is a protected method from "Lec10Inheritance" class.
		myObject2.kasparMethod(); // This is a public method from "Lec10Inheritance" class
		myObject2.myMethod(); // This is a public method from "Lec10Inheritance" class
		myObject2.kasparMethod(40, 50); // This is a public method from "Lec10Inheritance" class with parameters. 
	}

}
