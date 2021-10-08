package HouseofKasparMoon;

public class OtherImplementClass implements InterfaceClass, NewInterfaceClass {
	//Here I have implemented two different interface classes together by using (,) comma, first one is "InterfaceClass", and second one is "NewInterfaceClass".
	/*
	 * This is an Interface Class
	 * Interface is the another way to achieve abstraction in Java, is with interfaces.
	 * An interface is a completely "abstract class" that is used to group related methods with empty bodies.
	 * To access the interface methods, the interface must be "implemented" by another class with the implements keyword instead of extends. 
	 * The body of the interface method is provided by the "implement" class.
	 */
	
	public void myMethod(double $add1, double $add2) {
		// This is the body of myOtherMethod() Interface method from "NewInterfaceClass"
		double $resultHere = $add1 + $add2;
		System.out.println("Result is: " + $resultHere);
	}

	public void myOtherMethod(int $value1, int $value2) {
		// This is the body of myOtherMethod() Interface method from "NewInterfaceClass"
		if ($value1 >= $value2) {
			System.out.println($value1 + " is Greater Than or Equal " + $value2);
		}
		else if ($value1 <= $value2) {
			System.out.println($value1 + " is Less Than or Equal " + $value2);
		}
		else {
			System.out.println("Seems like, I don't know!");
		}
	}

	public void magick() {
		// This is the body of magick() Interface method from "InterfaceClass"
	    System.out.println("This is so real...");
	}

	public void sleep() {
		// This is the body of sleep() Interface method from "InterfaceClass"
		   System.out.println("When I Sleep, I feel like I'm Sleeping!");
	}

}
