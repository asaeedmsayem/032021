package Javapractice;

public class Lec5ForLoop {

	public static void main(String[] args) {
		/*
		 * Syntax
		 * for (Statement1; Statement2; Statement3) { Block of Codes to execute }
		 */
		// Increment by 1 
		for (int x = 0; x < 10; x++) {
			System.out.println(x + " ");
		}
		// Increment by 5
		for (int x = 0; x < 10; x = x +5) {
			System.out.println(x + " ");
		}
		//Print Even Numbers Only
		for (int A=1; A<=50; A++)   
		{  
		if (A%2==0)   
		{  
		System.out.println(A + " ");  
		}
		//2nd Style Print Even Numbers Only
		for (int D=0; D <= 50; D += 2) {
			System.out.println(D+" ");
			}
		//Print a String 5 Times
		for (int i = 0; i < 10; i++) {
            System.out.println("I am a Student of NextTech ITC ");
        }
		break;
	}
	
	}
	
}
