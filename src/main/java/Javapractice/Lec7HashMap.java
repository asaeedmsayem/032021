package Javapractice;

import java.util.HashMap;

public class Lec7HashMap {

	public static void main(String[] args) {
		
		/*
		 * Syntax For HashMap
		 * HashMap<(Key)DataType, (Values)DataType> VariableName = new HashMap<DataType, DataType>();
		 */

		// Declare a HashMap with the variable $nexttechITCStudents
	    HashMap<Integer, String> $nexttechITCStudents = new HashMap<Integer, String>();

	    // Add keys and values (StudentID, Names)
	    $nexttechITCStudents.put(3202101, "Afnan");
	    $nexttechITCStudents.put(3202102, "Aqsa");
	    $nexttechITCStudents.put(3202103, "Moumita");
	    System.out.println($nexttechITCStudents);
	    System.out.println($nexttechITCStudents.size());
	    
	    
		// Declare a HashMap with the variable $capitalCountry
	    HashMap<String, String> $cityState = new HashMap<String, String>();

	    // Add keys and values (Capital, Country)
	    $cityState.put("Ashburn", "Virginia");
	    $cityState.put("New York City", "New York");
	    $cityState.put("Schenectady", "New York");
	    $cityState.put("Annandale", "Virginia");
	    $cityState.put("Orlando", "Florida");
	    
	    //$cityState.clear();
	  //Print all data in HashMap
	    System.out.println($cityState);
	    
	    //Get size of HashMap
	    System.out.println($cityState.size());
	    
	    //Just getting access to the value of the key "Schenectady"
	    System.out.println("I'm from " + $cityState.get("Schenectady"));
	    //Removing data from HashMap
	    System.out.println($cityState.remove("New York City"));
	    System.out.println($cityState);
	    //Get size of HashMap
	    System.out.println($cityState.size());
	    
	    
	}
}
