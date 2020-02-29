package JavaPrograms;



public class PalindromeNumber {
	// A number that remains same when it's digits are reversed
	public static void palindrome(int num) {
		int r =0;
		int sum = 0;
		int t;
		
		t= num;
		while(num>0) {
			r = num%10; //get the reminder
			sum = (sum * 10) + r;
			num = num /10;	
		}
		
		if(t==sum) {
			System.out.println(t+" is a palindrom");
		}else {
			System.out.println(t+" is not palindrom");
		}
	}

	public static void main(String[] args) {
		
		palindrome(324543);
	}

}
