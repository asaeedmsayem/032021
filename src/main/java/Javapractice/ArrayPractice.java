package Javapractice;

public class ArrayPractice {

	public static void main(String[] args) {
		/*
		 * Array Syntax
		 * VariableType varName[value1, value2, ..., valueN];
		 */
		//Create Array and Print Original Array  
		String[] States = {"New York", "Ohio", "Pennsylvania", "Virginia", "Colorado"};  
        System.out.print("Original array: ");
        /*
         * Here we get array length first so that we can get array index in the variable then printing that index value.
         * By following increment technique we are getting index value one by one.
         */
        for (int i = 0; i < States.length; i++) {  
            System.out.print(States[i] + ", ");  
        }  
        System.out.println();  // This line used to create a blank line before printing next line. Just used like 'Enter'.
        System.out.print("Array in reverse order: ");  
        //Loop through the array in reverse order
        /*
         * Here we get array length first so that we can get array index in the variable then printing that index value.
         * By following decrement technique we are getting index value one by one.
         */
        for (int i = States.length-1; i >= 0; i--) {  
            System.out.print(States[i] + ", ");  
        }
	}
}