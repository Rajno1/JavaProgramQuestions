package JavaPrograms;

import java.util.Scanner;

public class FibonacciBasedonUserInput {

	public static void main(String[] args) {
		int a=0,b=1,c;
		
	    System.out.println("How many numbers you want in Fibonacci:");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        System.out.print("Fibonacci Series of "+count+" numbers:");
		
		for(int i=1;i<=count;i++) {
			c=a+b;
			System.out.print(a+" ");
			a=b;
			b=c;
			
		}
	}

}
