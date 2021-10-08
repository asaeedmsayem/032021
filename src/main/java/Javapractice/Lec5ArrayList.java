package Javapractice;

public class Lec5ArrayList {

	public static void main(String[] args) {
		/*
		 * Array Syntax
		 * DataType[] VariableName = {value1, value2, ..., valueN};
		 */
		//Array
		String[] States = {"New York", "Ohio", "Pennsylvania", "Virginia", "Maryland", "District of Columbia", "Tennessee", "Mississippi", "Arkansas", "Missouri", "Nevada", "Arizona", "California", "Colorado"};
		// for (variableType NameofVariable : ArrayVariable) { block of code to execute} 
		/*for (String i : States) {
			System.out.println(i);
		}*/
		int [] Numbers = {10, 40, 29, 58, 47, 50};
			for (int y : Numbers) {
				System.out.println(y);
			}		
		//String[] Statess = {"New York", "Ohio", "Pennsylvania", "Virginia", "Maryland", "District of Columbia", "Tennessee", "Mississippi", "Arkansas", "Missouri", "Nevada", "Arizona", "California", "Colorado"};
		 //System.out.println(Statess [3]);
		// Array Length
		//System.out.println(States.length);
	}
}