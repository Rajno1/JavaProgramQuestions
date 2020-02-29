package JavaPrograms;

public class ReverseInteger {
	
	public static void main(String[] args) {
		//1 . By using proper alogarithm
		 int num = 342578;
		 int rev = 0;
		 
		 while(num !=0) {
			rev = rev * 10 + num % 10;
			num = num/10; 
		 }
		 System.out.println(rev);
	    //2. By using StingBuffer	 
		 int num1 =123456;
		 System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}
	/**
	 * declare int variable 
	 * declare rev variable to store reversed int value
	 * use 'while loop' with condition ,where int variable 'num' not equal to zero
	 * rev = rev * 10 + num % 10;-> rev =0 -> 0 * 10 + 12345 % 10 = 5 
	 * num = num/10; -> 12345/10 = 1234.5 so reminder 5 is already assigend to 'rev'
	 * so now num = 1234 whic is not equal to zero so while loop will continue the same
	 */
}
