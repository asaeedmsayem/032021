package Javapractice;

public class Lec3ifelsestatement {

	public static void main(String[] args) {
		// Conditional operators with IF ELSE Statement
		/*
		 * To join the video meeting, click this link: https://meet.google.com/wid-eqcv-ubp 
		 * Otherwise, to join by phone, dial +1 731-327-2036 and enter this PIN: 481 084 757#
		 * To view more phone numbers, click this link: https://tel.meet/wid-eqcv-ubp?hs=5
		 */
		/* 
		 * Conditions and If Statements
			* Less than: x < y
			* Less than or equal to: x <= y
			* Greater than: x > y
			* Greater than or equal to: x >= y
			* Equal to x == y
			* Not Equal to: x != y
		*/
		int X=10; // I declare data 10 which is an integer stored in a variable 'X'.
		double Y=5.5; // I declare data 5.5 which is an decimal number stored in a variable 'Y'.
		/*
		 * If Statement Syntex
		 * if (condition) {result/body}
		 */
			if (X>Y) {
				System.out.println("X is Grater than Y");
			}
			if (X<Y) {
				System.out.println("Y is Grater than X");
			}
			if (Y<X) {
				System.out.println("Y is Less than X");
			}
			if (Y>X) {
				System.out.println("X is Less than Y");
			} 
		
			// Class Assignment by Nayeem Bhai
			//Print A is Grater Than Equal To B
			//Print 20 is not equal to 10
			
			int A=20;
			int B=10;
			
			if (A >= B) {
				System.out.println("A is Greater Than Equal to B");
			}
			if (A != B) {
				System.out.println(A+" is Not Equal to "+B);
				//System.out.println("20 is Not Equal to 10");			
			}
	}
}