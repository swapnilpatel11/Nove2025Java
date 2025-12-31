package FunctionsConcept;

public class MainMethodConcept {

	String name;
	int age;
	static final int wheels = 4;

	public void get() {
		System.out.println("get method");
	}

	public static void set() {
		System.out.println("Set Method");
	}

	public static void main(String[] args) {

		MainMethodConcept m1 = new MainMethodConcept();
		m1.get();
		// business logic/app logic
		// its like a user -- calling method -- call other methods

	}

}
