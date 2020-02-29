package JavaPrograms;

public class SwappingIntegers {

	public static void main(String[] args) {
		 
		int x= 5;
		int y = 10;
		
		//swaping using third variable
		
		int t;
		t=x;
		x=y;
		y=t;
		
		/** without using 3rd variable we can swap integer in 3 ways
		 * 1. by using '+' operator
		 * 2. by using '*' operator
		 * 3. by using '^' XOR  binary operator
		 */
		
		x = x+y; //15
		y = x-y; //5
		x = x-y; //10
		
		x = x*y; //50
		y = x/y; //50/10 = 5
		x = x/y; //50/5 = 10
		
		x = x^y; // 0101 ^ 1010 = 1111 = 20 
		y = x^y; // 1111 ^ 1010 = 0101 = 5
		x = x^y; // 1111 ^ 0101 = 1010 = 10
		
		/**
		 * convertin decimal to binary divide 5 with 2 and reminders are binaray value 
		 * binary to decimal = 1111=2^4 +2^3 + 2^2+ 21
    								16+8+4+2 =20

		 */
		
		System.out.println("x value after swaping "+x);
		System.out.println("y value after swaping "+y); 
	}

}
