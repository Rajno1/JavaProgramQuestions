package JavaPrograms;

public class ProgramFibonacci {

	public static void main(String[] args) {
		int a=0,b=1,c, count=10;
		for(int i=1;i<=count;i++) {
			c=a+b;
			System.out.print(" "+a);
			a=b;
			b=c;
		}
		
		
	}

}
