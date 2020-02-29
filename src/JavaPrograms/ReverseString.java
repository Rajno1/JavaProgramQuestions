package JavaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// 1. By using for loop
		String s = "Mahalakshmi";  
		int len= s.length();
		String rev = "";
		for (int i = len-1; i >=0; i--) {
			rev = rev+s.charAt(i);
			
		}
		System.out.println(rev);
		
		//2. By using StringBuffer class
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
	}
	/**
	 * We can reverse a string by using two methods 1) for loop 2) StrinBuffer class.
	 * 
	 * in for loop, first declare sting variable you want to reverse
	 * get sting length by using '.length()'which returns an int and store int vlaue in one variable
	 * declare one string variable to store reversed string
	 * start for loop and by using '.charAt()' get characters of string based on index
	 * '.charAt()' takes string index as argument 
	 * 'rev = rev+s.charAt(i)'-> rev+ indicates empty vlaue of revesed string 
	 * print the 'rev' variable out side the for loop
	 * 
	 * in StringBuffer, first create an object for 'stringBuffer' class
	 * which takes sting variable as argument 
	 * by using '.reverse()' of stringBuffer class pirnt the reversed sting.
	 */
}
