package Javapractice;

public class GroupAssignmentOr {

	public static void main(String[] args) {
		//Use of 'Or' (||) Operator with 'if...else if...else' statement
		
				int $testScore = 50;
				
				String $grade;
				
				if ($testScore <= 30) {
					$grade = "Fail";
		        	System.out.println("Studnet Got '" + $grade + "' Grade");
		        }
		        else if ($testScore !=30 || $testScore >= 50) {
		        	$grade = "Pass";
		        	System.out.println("Studnet Got '" + $grade + "' Grade");
		        }
		        else {
		        	System.out.println("The student didn't attend the exam");
		        }

	}

}
