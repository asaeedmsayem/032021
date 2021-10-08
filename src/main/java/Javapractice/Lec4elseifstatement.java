package Javapractice;

public class Lec4elseifstatement {

	public static void main(String[] args) {

		/*
		 * If, Else If, and Else Statement
		 * Practice condition
		 * Syntax Below...
		 * -----------------------------
		 * if (condition1) {
		 * block of code to be executed if condition1 is true
		 * } 
		 * else if (condition2) {
		 * block of code to be executed if the condition1 is false and condition2 is true
		 * } 
		 * else {
		 * block of code to be executed if the condition1 is false and condition2 is false
		 * }
		 * -----------------------------
		 */
		
		int time = 20;
		
		if (time!=30) {
			System.out.println("Hi");
		}
		else if (time==15) {
			System.out.println("Hello");
		}
		else if (50>time) {
			System.out.println("Sleep Time");
		}
		else {
			System.out.println("World");
		}

	}

}
