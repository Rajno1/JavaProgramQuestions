package JavaPrograms;

import java.util.HashSet;
import java.util.Set;



public class DuplicateElementsInArray {

	public static void main(String[] args) {
		
		String str[] = {"Rajasekhar","Mahalakshmi","Vinuthna","Rajasekhar","Ram","Mahalakshmi"};
		// 1. comparing elements -> its a worst kind of approach 
		//because if the number of elements is more time cosuming will be more
		for (int i = 0; i < str.length; i++) { // i=0 represents first element
			for (int j = i+1; j < str.length; j++) {  // j= i+1 i.e 0+1=1 represents second elemtn in '1' index
				
				if (str[i].equals(str[j])) {
					System.out.println("duplicate values are  ::"+ str[i]);
				}
				
			}
			
		}
		
		//2. using HashSet :
		// Hash set is a part of java collections, it stores unique values 
		Set<String> value = new HashSet<String>();  //create set object because set obect can not store duplicate value
		for(String name : str) {
			if(value.add(name)== false) {
				System.out.println("Duplicate value is = "+ name);
			}
		}	
	
	}
/**
 * To find duplicate element in Array we use the follwing methods
 * 1. comparing the elements 
 * create a 'for' loop and inside the for loop with the help of 
 *'if' statement compare the elements.
 *
 * 2. Using Hashset
 * create 'set' object
 */
}
