package Javapractice;

public class Lec9JavaOOPS {
	/*
	 * Method Syntax
	 * AccessModifier ReturnType MethodName () { Block of Codes}
	 */
	String $car = "BMW";
	int $number = 10;
	double $div = 10.5;
	
	public static void main(String[] args) {
		/*
		 * Syntax of Object
		 * ClassName ObjectName = new ClassName();
		 */
		Lec9JavaOOPS Obj = new Lec9JavaOOPS();
		System.out.println(Obj.$car);
		Obj.$div = Obj.$number + Obj.$div;
		System.out.println(Obj.$div);

	}

}
