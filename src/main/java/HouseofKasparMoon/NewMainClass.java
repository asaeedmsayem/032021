package HouseofKasparMoon;

public class NewMainClass {

	public static void main(String[] args) {
		OtherImplementClass really = new OtherImplementClass(); // Create a real object
		really.magick(); // Using Interface method "magick()" from Interface Class "InterfaceClass"
		really.sleep(); // Using Interface method "sleep()" from Interface Class "InterfaceClass"
		really.myMethod(5.5, 2.2); // Using Interface method "myMethod()" with parameters from Interface Class "NewInterfaceClass"
		really.myOtherMethod(10, 9); // Using Interface method "myOtherMethod()" with parameters from Interface Class "NewInterfaceClass"
	}

}
