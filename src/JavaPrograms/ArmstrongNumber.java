package JavaPrograms;

public class ArmstrongNumber {
	//A number that is equals to the sum of cubes of its digits.
	// Ex: 153 = 1^3+5^3+3^3 = 1+125+27 = 153
	
	
	public static void armStrong(int num) {
		int cube =0;
		int  r;
		int t;
		
		t= num;
		while(num>0) {
			r= num % 10;
			num = num /10;
			cube = cube+(r*r*r);
			
		}
		
		if(t== cube) {
			System.out.println(t+" is Armstrong number");
		}else {
			System.out.println(t+" is not an Armstrong number");
		}
	}

	public static void main(String[] args) {
		armStrong(157);
	}

}
