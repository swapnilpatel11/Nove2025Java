package FunctionsConcept;

public class App {

	public static void t1() {
		System.out.println("t1 method");
		App.t2();
	}

	public static void t2() {
		System.out.println("t2 method");
		App.t3();
	}

	public static void t3() {
		System.out.println("t3 method");
	}

	public void m1() {
		System.out.println("m1 method");
		m2(); // Non static of same class can be called without object
	}

	public void m2() {
		System.out.println("m2 method");
		m3();
	}

	public void m3() {
		System.out.println("m3 method");
		// m1(); // its creating chain or loop so we will get stackoverflow error
		App.t1(); // Nonstatic method --> Static Method
	}

	public static void main(String[] args) {
		App a1 = new App();
		a1.m1(); // it will give stackoverflow error if we applied loop at m3 method by calling
					// m1(), otherwise it will not give stackoverflow error
		// App.t1();

		// how to call methods inside methods:
		// Static Method --> Static Method : use class name
		// NonStatic --> Nonstatic : Direct Calling
		// Nonstatic --> Static : Use class name
		// Static --> Nonstatic : Use class object reference name

	}

}
