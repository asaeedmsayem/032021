package HouseofKasparMoon;

public class MainAccess {
	/*
	 * This is my Main Class where I have created object of "PracticeSubClass" class 
	 * and used methods from "PracticeSubClass" and "AbstractPractice" classes.
	 */
	public static void main(String[] args) {
		PracticeSubClass real = new PracticeSubClass(); // Create a real object
		real.magick(); // Using abstract method "magick()" from abstract class "PracticeSubClass"
		real.sleep(); // Using regular method "sleep()" from abstract class "AbstractPractice"
	}

}
