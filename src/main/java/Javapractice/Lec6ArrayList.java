package Javapractice;

import java.util.ArrayList; // import the ArrayList class

public class Lec6ArrayList {

	public static void main(String[] args) {
		/*
		 * Arraylist Syntax
		 * ArrayList <VariableType> VariableName = new ArrayList <VariableType>();
		 */
		
		ArrayList<String> Names = new ArrayList<String>(); //ArrayList declaration

		//Start Code area for adding elements into the ArrayList
		// Here I have used add(Value) method to add elements in the ArrayList.
		
			Names.add("Anna");
			Names.add("Caitlyne");
			Names.add("Elizabeth");
			Names.add("Liza");
		
		//End Code area for adding elements into the ArrayList	
			
			System.out.println(Names); // Code line to print ArrayList
			
			System.out.println("Number of elements in ArrayList: "+ Names.size()); //Code to get ArrayList size. I have used size() method.
				
			Names.remove(2); //Code for removing element from ArrayList. I have used remove(IndexNumber) method to remove element from index 2 of this ArrayList.
	    
	    	System.out.println(Names);	// Code line to print ArrayList
	    	
	    	System.out.println("Number of elements in ArrayList: "+ Names.size()); //Code to get ArrayList size. I have used size() method.
	    	
	    	Names.set(2, "Lucy"); // Code to change ArrayList element. I have used set(IndexNumber, Value) method to change a value in an ArrayList.
	    	
	    	System.out.println(Names);
	    	
	    	String element = Names.get(1); // Code to access into ArrayList. I have used get(IndexNumber) method to access in the ArrayList.
	    	  
	        System.out.println("The element at index 1 is " + element);
	        
	}
}