package JavaPractice2;

import Javapractice.Lec10Inheritance;

public class Lec10Protected extends Lec10Inheritance {
	
	public static void main(String[] args) {
		//Creating an object to use protected method from another package’s class.
		Lec10Protected callwork = new Lec10Protected();
		callwork.kasprot();

	}

}
