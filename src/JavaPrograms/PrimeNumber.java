package JavaPrograms;

public class PrimeNumber {

	
	public static boolean primeNumber(int num) {
		/*
		 *  primeNumber- A number which can be divided by itself and '1' is known as prime number.
		 *  least prime number is '2'
		 *  so conditions are num<=1 are NOT prime numbers
		 *  num/2 reminder =0 are NOT prime numbers
		 */
		if(num <=1) {  
			
			return false;
		}
		for (int i = 2; i < num; i++) {
			if(num % i ==0) {
				 return false ;	 
			}
		}
		
		return true;
	}
	
	
	
	// new method created to get prime numbers up to given number 
	public static void primeNumbers(int num) {
		System.out.println("Upto "+num+ " Prime numbers are");
		for (int i = 2; i <=num; i++) {
			
			if(primeNumber(i)) {
				
				System.out.print(" " +i );
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		primeNumbers(20);
		
	}

}
