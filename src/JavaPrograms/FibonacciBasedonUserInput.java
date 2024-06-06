package JavaPrograms;

import java.util.Scanner;

public class FibonacciBasedonUserInput {

	public static void main(String[] args) {

		        // Fibonacci is a number series in which each number is the result of the sum of the previous two numbers
        // 0 1 1 2 3 5 8 13 21 34 55 ----

      //  int count = 10;

        int firstNum = 0;
        int secondNum = 1;

        System.out.print("Enter count value: ");


        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        System.out.print(firstNum + " ");

        for(int i=0; i<count; i++){

            System.out.print(secondNum + " ");

            int temp = firstNum;
            firstNum = secondNum;
            secondNum = temp + firstNum;
        }

		

	}

}
