package JavaPrograms;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		int a[] ={1,2,3,4,6};
		
		int sum =0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];	
		}
		System.out.println(sum);
		
		int sum1 =0 ;
		for (int j = 0; j <=6; j++) {
			sum1 = sum1 + j;
		}
		System.out.println(sum1);
		
		System.out.println("missing number is :: "+ (sum1-sum));
		/**
		 *  first declare an Array
		 *  declare a varilble with zero value
		 *  write a code by using for loop to add all the values of array and 
		 *  print outside the 'for' loop
		 *  
		 *  next Declare one more variable with zero value and
		 *  write a code by using for loop to add upto the value of last index
		 *  print the output ouside the 'for' loop
		 *  And finally pint the missing number by doin substarcation
		 */
	}
}
