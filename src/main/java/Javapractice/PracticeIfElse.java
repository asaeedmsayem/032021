package Javapractice;

public class PracticeIfElse {

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
		
		int N = 15;
		int NN=10;
		
		if (N<NN) {
			System.out.println("You are wrong");
		}
		else if (N>NN) {
			System.out.println("Yes "+N+" is greater than "+NN);
		}
		else {
			System.out.println("Go Sleep");
		}
	
		//=====================================================

		String $name ="Kaspar";
				
		if ($name=="Kaspar") {
			System.out.println("I am Good and Feeling well");
		}
		else if ($name!="Kaspar") {
			System.out.println("I didn't get you!!!");
		}
		
		else {
			System.out.println("Hell no! Go sleep...");
		}
		
		//===========================================================
		
		// condition in string
				String Sun= "sunday";
				String Mon="monday";
				if (Sun!=Mon) {
					System.out.println("sunday come before monday");
				}
				else { 
					System.out.println("sunday ");
				}
				
			//  string value 
				   String v1= "Hello World";
				   String v2= "Good Day";
				   String v3= "Statement doesn't match";
					
				   if (v1 != "Hello World") {
					    System.out.println(v3);	
				      }
				   else if (v1 == "Hello World") {
					    System.out.println(v1+ " " +v2);
				      }
				
				   else {
					    System.out.println("error");
				  	   }

				   
				/*   int v1= 2;
				   int v2= 1;
				   int v3= 3;
					
				   if (v1 == 3) {
					    System.out.println(v3);	
				      }
				   else if (v1 != 2) {
					    System.out.println(v1+ " " +v2);
				      }
				
				   else {
					    System.out.println("error");
				  	   }*/
	}

}
