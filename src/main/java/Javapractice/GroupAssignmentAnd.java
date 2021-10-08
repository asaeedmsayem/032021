package Javapractice;

public class GroupAssignmentAnd {

	public static void main(String[] args) {
		//Use of 'And' (&&) and 'Not' (!) Operators with 'if...else if...else' statement
		
		int $testScore = 90;
		
		char $grade;
		
		if ($testScore <= 30) {
			$grade = 'F';
        	System.out.println("Studnet Got Grade "+ $grade);
        }
        else if ($testScore !=30 && $testScore >= 90) {
        	$grade = 'A';
        	System.out.println("Studnet Got Grade "+ $grade);
        }
        else {
        	System.out.println("The student didn't attend the exam");
        }
		
		// Use of 'Not' (!) Operator. This operator reverse the actual condition or result.
		
		System.out.println("Reverse Result is " + !true);   // prints false 
		System.out.println("Reverse Result is " + !false);  // prints true 

	}
	
}
