package Javapractice;

import java.util.ArrayList;

public class ArrayListPracticeR {

	public static void main(String[] args) {
		
		//Getting Even Numbers using "ArrayList"
        ArrayList<Integer> EvenVal = new ArrayList<Integer>();
        for (int i = 0; i <=10; i++) {
        	if (i % 2 == 0) {
        EvenVal.add(i);
        	   }
        }
        System.out.println(EvenVal);
		
		//Printing ArrayList using "For Loop"
        for (int i = 0; i < EvenVal.size(); i++) {
        System.out.println("Im getting a Value from index " + EvenVal.get(i));
        }

	}

}
