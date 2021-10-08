package Javapractice;

import java.util.ArrayList;

public class Lec8JavaException {

	public static void main(String[] args) {
		
		/*
		 * Try...Catch Syntax Below:
		 * try {
			  //  Block of code to try
			}
			catch(Exception e) {
			  //  Block of code to handle errors
			}
		 */
		
		//Start try...catch block
		
		try {
			int[] $num = {1,2,3};
			System.out.println($num[7]);
		}
		catch(Exception e) {
			System.out.println("Something Went Wrong in line 22 or 23");
		}
		
		//End try...catch block
		
		//Start New try...catch block
		try {
			ArrayList<String> Names = new ArrayList<String>(); //ArrayList declaration

			//Start Code area for adding elements into the ArrayList
			// Here I have used add(Value) method to add elements in the ArrayList.
				Names.add("Anna");
				Names.add("Caitlyne");
				Names.add("Elizabeth");
				Names.add("Liza");
			//End Code area for adding elements into the ArrayList	
				//Names.remove(3);
				System.out.println(Names.get(2)); // Code line to print ArrayList
				//Names.get(2);
		}
		catch (Exception e) {
			System.out.println("You Have Deleted That Index!");
		}
		finally {
			//The finally statement let us execute code, after try...catch block, regardless of the result
			System.out.println("You messed up");
		}	
	}
}
