package JavaPrograms;

import java.util.Arrays;

public class LargetsAndSmalletsNumber {

	public static void main(String[] args) {
		int a[] = {-10,-25,24,5,50,67};
		
		int largest = a[0];
		int smallest = a[0];
		
		for (int i = 1; i < a.length; i++) {
			if(a[i]>largest) {
				largest = a[i];
			}else if(a[i]<smallest) {
				smallest = a[i];
			}
		}
	 
		System.out.println("Given Array :: "+ Arrays.toString(a));
		System.out.println("Largest number is ::"+ largest);
		System.out.println("Smallest number is ::" + smallest);
	}

}
/**
 * Declare an Array
 * by taking '0' index as reference store 'largest & smallest' value in it
 * write a for loop with a condition to print greate number and small number 
*/
	