package JavaPrograms;

public class MainMethodOverloading {

	public static void main(String[] args) {
		System.out.println("main method with exact signature");
		main("Testing");
		main(2);
		main(2,5);
	}
	public static void main(String args) {
		System.out.println("main method with only string as args");
	}
	public static void main(int a) {
		System.out.println("main method with one integer as argument");
	}
	public static void main(int a,int b) {
		System.out.println("main method with two integer as argument");
	}
	/**
	 * We can overload the main method, if we run the overloaded main method
	 * JVM will search for exact signature of main method with string[] args as parameter, 
	 * which is public static void 
	 * If we want to call overloaded main methods,
	 * since they are static we can call them directly inside the main method,
	 * which has “ string[] args ”as parameter. 
	 */
}
