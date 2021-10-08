package HouseofKasparMoon;

public class KasparLibrary {
		
		//Method to print String
		public void myMethod () {
		System.out.println("I'm a student of NextTech ITC");
		}
		//Method with parameters for addition. Getting values from user through parameters.	
		public void kasparMethod (int $number1, int $number2) {
			int $addition = $number1 + $number2;
			System.out.println($addition);
		}
		//Same name Method without parameters for subtraction.	
		public void kasparMethod() {
			int $num1 = 10;
			int $num2 = 30;
			int $add = $num2 - $num1;
			System.out.println($add);
		}
		
		//Creating a Protected Method
		/*
		 * By using inheritance concept we can access 
		 * from any classes from same or different package.
		 */
		protected void kasprot () {
			System.out.println("Charming is a nice TV show that I like.");
		}
		
		//Creating a default method
		/*
		 * In a default method we can access from only the classes from same package.
		 * But we cannot access from the classes from other package.
		 */
		void kaspar () {
			System.out.println("I am watching 'Good Witch' now");
		}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

}
