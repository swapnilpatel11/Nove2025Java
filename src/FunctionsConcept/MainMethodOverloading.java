package FunctionsConcept;

public class MainMethodOverloading {

	
	// Can we overload static method? Yes
	public static void login() {

	}

	public static void login(int otp) {
		System.out.println(otp);
	}

	public static void login(String un, String password) {

	}

	// Can we overload main method? Yes
	public static void main(int a) {
		System.out.println("Main Method " + a);

	}

	public static void main(int a, int b) {
		System.out.println("Main Method " + (a + b));

	}

	// psvm String[] : Java always look for this pattern to run main method
	public static void main(String[] args) {
		System.out.println("Main Method");

		MainMethodOverloading.main(10);
		MainMethodOverloading.main(10, 20);
		MainMethodOverloading.login(1020);

	}

}
