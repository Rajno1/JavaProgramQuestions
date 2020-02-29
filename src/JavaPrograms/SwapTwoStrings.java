package JavaPrograms;

public class SwapTwoStrings {

	public static void main(String[] args) {
		 String a = "Hello";
		 String b = "World";
		 
		 System.out.println("a value before Swaping: "+a);
		 System.out.println("b value before Swaping: "+b);
		 //we can do string swap in 3 stpes 
		 //1. append a and b
		 a = a+b;
		 //2. Store intial string a in string b
		 b= a.substring(0, a.length()-b.length());
		 //3. store intial string b in strin a
		 a = a.substring(b.length());
		 
		 System.out.println("**************");
		 System.out.println("a value after Swaping: "+a);
		 System.out.println("b value after Swaping: "+b);	
	}

}
