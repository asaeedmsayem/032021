package HouseofKasparMoon;

public class PracticeSubClass extends AbstractPractice {
	/*
	 * This is a Class that extends my abstract class "AbstractPractice" to inherited abstract method "magick()"
	 * The abstract keyword is a non-access modifier, used for classes and methods.
	 * Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass by using inheritance.
	 */
	
	public void magick() {
	    // This is the body of magick() abstract method
	    System.out.println("It's real...");
	  }
}
