package HouseofKasparMoon;

public class ImplementClass implements InterfaceClass {
	/*
	 * This is an Interface Class
	 * Interface is the another way to achieve abstraction in Java, is with interfaces.
	 * An interface is a completely "abstract class" that is used to group related methods with empty bodies.
	 * To access the interface methods, the interface must be "implemented" by another class with the implements keyword instead of extends. 
	 * The body of the interface method is provided by the "implement" class.
	 */
	
	public void magick() {
	    // This is the body of magick() Interface method from "InterfaceClass"
	    System.out.println("It's real...");
	  }
	public void sleep() {
		// This is the body of sleep() Interface method from "InterfaceClass"
		   System.out.println("When I Sleep, I can't see anything!");
		}
}
