package Javapractice;

public class Throwkeyword {
	
	static void checkAge(int age) {
		/*
		 * Throw Syntax
		 * throw new ExceptionName("Message");
		 */
		
	    if (age < 18) {
	      throw new ArithmeticException("Access denied");
	    }
	    else {
	      System.out.println("Access granted - You are old enough!");
	    }
	  }

	public static void main(String[] args) {
		
		checkAge(15); // Set age to 15 (which is below 18...)

	}

}
