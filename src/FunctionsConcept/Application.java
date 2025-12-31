package FunctionsConcept;

public class Application {

	// Method Overloading: within the same class, when we have multiple methods:
	// OOP -- Polymorphism : Many forms of same functions --> Compile time
	// polymorphism (Static Polymmorphism)
	// 1. with the same name
	// 2. with the different number of parameters
	// 3. with the different type of parameters
	// 4. with the different sequence of the parameters
	// 5. return type could be anything -- it does not matter

	public int test() {
		return 100;
	}

	public void test(int a) {

	}

	public void test(int a, int b) {

	}

	public void test(int a, String b) {

	}

	public void test(String a, int b) {

	}

	// Ecommerce Application:
	// Which method should be overload? --> Login
	public void login() {

	}

	public void login(String username, String password) {

	}

	public void login(String username, String password, String otp) {

	}

	public void login(String username, String password, String otp, String role) {

	}

	// search:
	public void search() {

	}

	public void search(String name) {

	}

	public void search(String name, int price) {

	}

	// payment:
	public void makePayment(String upi) {

	}

	public void makePayment(String cc, int cvv) {

	}

	public void makePayment(String paypal, String pwd) {

	}

	// Uber -- Booking feature
	public void bookingTaxi() {

	}

	public void bookingTaxi(String startPoint, String endPoint, String carType) {

	}

	public void bookingTaxi(String startPoint, String endPoint, String carType, int totalPssengers) {

	}
	
	// like a user -- calling method
	public static void main(String[] args) {
		Application a1 = new Application();
		a1.test();

		a1.login("admin", "admin");

		a1.bookingTaxi("anand", "airport", "suv", 4);

	}

}
