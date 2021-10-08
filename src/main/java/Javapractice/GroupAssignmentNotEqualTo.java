package Javapractice;

public class GroupAssignmentNotEqualTo {

	public static void main(String[] args) {
		//Use of 'Not Equal To' (!=) Operator with 'if...else if...else' statement
		
		String $name ="Moon";
		
		if ($name=="Kaspar") {
			System.out.println("I am Good and Feeling well");
		}
		else if ($name!="Kaspar") {
			System.out.println("What you say!!! " + $name + "? What " + $name + "?");
		}
		
		else {
			System.out.println("Hell no!");
		}
	}

}
