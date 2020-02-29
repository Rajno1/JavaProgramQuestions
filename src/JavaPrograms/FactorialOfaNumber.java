package JavaPrograms;

public class FactorialOfaNumber {
	
	//recursive means a function/method is calling itself
	//1.without recursive -- simple for loop
	
	public static int factorial(int num) {
		int fact=1;
		if(num==0)   //condition for 0!
			return 1;
		
		for (int i = num; i >=1; i--) { // conditoin for factorial 
			fact = fact * i;
		}
		return fact;	
		
	}
	
	//2.with recursive 

	public int fact(int num) {
		if(num == 0)
			return 1;
		else
			return  (num * fact(num-1)); // here we are calling fact() inside same method
	} 
	public static void main(String[] args) {
		System.out.println(factorial(4));  //--> calling factorial method without recursion
		FactorialOfaNumber ft = new FactorialOfaNumber();
		System.out.println(ft.fact(4)); //-> calling fact method with recursion
	}

}
