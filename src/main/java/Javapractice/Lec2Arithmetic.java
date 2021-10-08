package Javapractice;

public class Lec2Arithmetic {

	public static void main(String[] args) {
		// Arithmetic Operator
		
		//Addition
		int num1=10;
		double num2=2.5;
		double addition=num1+num2;
		System.out.println("Result is $" +addition);
		
		//Subtract
		int sub1=10;
		double sub2=2.5;
		double sub=sub1-sub2;
		System.out.println("Result is "+"$" +sub);
		
		//Multiply
		int divi1=12;
		double divi2=5;
		double divi = divi1 * divi2;
		System.out.println("Result is "+"$"+divi);
		
		//Division
		int mul1=10;
		double mul2=2.5;
		double mul=mul1/mul2;
		System.out.println("Result is "+"$" +mul);
		
		//Modulus
		int mod1=3;
		double mod2=2;
		double mod = mod1 % mod2;
		System.out.println("Result is "+"$" +mod);
		
		//Increment by 1
		int inc=10;
		//inc++;
		//inc += 1;
		inc = inc +1;
	
		System.out.println("Result is "+"$" +inc);
		
		//Increment by 45
		int numm=100;
		//numm += 45;
		numm = numm + 45;
		
		System.out.println("Result is "+"$" +numm);
		
		//Decrement by 1
		int dec=10;
		dec--;
		//dec -= 1;
		//dec = dec - 1;
		System.out.println("Result is "+"$" +dec);
		
		//Decrement by 22
		int dic=100;
		dic -= 22;
		System.out.println("Result is "+"$" +dic);
	}
}