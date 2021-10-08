package Javapractice;

public class TestAssignmentifelseif {

	public static void main(String[] args) {
		
		double testscore1 = 95.5;
		double testscore2 = 80.2;
		double testscore3 = 75.3;
		double testscore4 = 67.25;
		double testscore5 = 55.11;
		double testscore6 = 34.1;
		
		int $gradeA=90;
		int $gradeB=80;
		int $gradeC=70;
		int $gradeD=60;
		int $gradeE=50;
		int $gradeF=40;
		
        //char grade;
        
        // Only if statement with simple 'Greater Than Equal To' and 'Less Than Equal To' Operators
        
        if (testscore1 >= $gradeA) {
        	System.out.print("Studnet Pass with Grade A. ");
        }
        
        if (testscore2 >= $gradeB) {
        	System.out.print("Studnet Pass with Grade B. ");
        }
        
        if (testscore3 >= $gradeC) {
        	System.out.println("Studnet Pass with Grade C.");
        }
        
        if (testscore4 >= $gradeD) {
        	System.out.println("Studnet Pass with Grade D.");
        }
        
        if (testscore5 >= $gradeE) {
        	System.out.println("Studnet Pass with Grade E.");
        }
        
        if (testscore6 <= $gradeF) {
        	System.out.println("Grade F means Fail.");
        }
        
        // if...else if statement with 'Greater Than' and 'And' operators.
        
        if (testscore1 == $gradeA ) {
        	System.out.println("Studnet Got "+testscore1);
        }
        else if (testscore1 > $gradeA && testscore1<100) {
        	System.out.println("Studnet Got Grade A with " + testscore1 + " Score.");
        }

       /* if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);*/

	}

}
