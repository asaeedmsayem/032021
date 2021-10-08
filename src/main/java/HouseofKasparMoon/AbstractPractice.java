package HouseofKasparMoon;

abstract class AbstractPractice {
	//This an Abstract class
	/*
	 * The abstract keyword is a non-access modifier, used for classes and methods:
	 * Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
	 * Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass by using inheritance.
	 * An abstract class can have both abstract and regular methods.
	 * Syntax of abstract class: abstract class ClassName { Block of codes }
	 * Syntax of abstract method: AccessModifier abstract ReturnType MethodName();
	 */
	
	public abstract void magick(); // Abstract method does not have a body
	  
	// Regular method
	public void sleep() {
	   System.out.println("When I Sleep, I can't see anything!");
	}
}