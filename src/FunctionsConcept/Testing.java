package FunctionsConcept;

public class Testing {

	// Static variable will go to the common memory allocation/metaspace
	// Static method concept:

	public void getMail() {
		System.out.println("Get mail...");
	}

	public static void sendMail() {
		System.out.println("send mail...");
	}

	public static void main(String[] args) {

		// How to call non static function : create the object:
		Testing t1 = new Testing();
		t1.getMail(); // nonstatic method

		// How to call static function:
		// 1. Using the className: Best Practice
		Testing.sendMail();

		// 2. Call it directly: not a good practice
		sendMail();

		// 3. Using the object ref name:
		t1.sendMail(); // warning: the static method sendMail() from the type of Testing should be
						// accessed in a static way

		Testing t2 = new Testing();
		t2.getMail();

	}

}
