package HouseofKasparMoon;

public class MyTestClass extends ArithmeticClass {
	/*
	 * In this class I have used two different classes together.
	 * First I have extended this class with "ArithmeticClass"
	 * Then Created two objects by using "ArithmeticClass" and "StringClass".
	 * Then just used their object name to use their methods as I needed.
	 * 
	 * Syntax of Creating an Object:
	 * ClassName ObjectName = new ClassName();
	 */
	
	public static void main(String[] args) {
		StringClass StringObject = new StringClass(); //Created this object for "StringClass" class
		MyTestClass AddObject = new MyTestClass(); //Created this object for "MyTestClass" class so that I can use "ArithmeticClass" class.
		//As "ArithmeticClass" has been extended with "MyTestClass" I have no need to call or use "ArithmeticClass" class name to create this object.
		
		StringObject.$myText();
		AddObject.add(10, 30);
	}

}
