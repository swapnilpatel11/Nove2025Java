package FunctionsConcept;

public class Employee {

	// Function/Methods : same thing in Java
	// In JavaScript you can create function without class
	// Functions are always written independently : parallel to each other
	// cannot create a function inside a function
	// duplicate functions are not allowed => Method Overloading need to use it

	// Declaring methods:
	// 1. no input (parameter) and no return : no need to write return keyword to
	// return anything
	public void test() {
		System.out.println("test method");
	}

	public void clickLoginButton() {
		System.out.println("click on login button");
	}

	// 2. some input (parameter) and no return:
	public void add(int a, int b) {
		System.out.println("add method:");
		int c = a + b;
		System.out.println(c);
	}

	public void login(String username, String password) {
		System.out.println("enter username:" + username);
		System.out.println("enter password:" + password);
		System.out.println("click on login button");
	}

	// 3. some input (parameter) and some function:
	// return type of this function : int
	public int sum(int a, int b) {
		System.out.println("Sum of two numbers");
		int z = a + b;
		return z; // printing z of the functions is not equal to the return of function, so I can
					// use that value.
	}

	public boolean isUserActive(String username) {
		System.out.println("checking user is active or not....");
		if (username.equals("swapnil")) {
			return true;
		} else {
			return false;
		}
	}
	
	//4. No input (parameter) but some return 
	public String getTrainerName() {
		System.out.println("Getting trainer name");
		return "swapnil";
	}

	// Object will never hold static values like static methods and static variable
	// and we cannot declare object of static method
	public static void main(String[] args) {
		// call the method/function: have to create the object of the class:
		Employee e1 = new Employee();
		e1.test(); // calling the function
		e1.clickLoginButton();
		e1.add(10, 20);
		e1.login("admin@gmail.com", "test123");
		int s1 = e1.sum(10, 30);
		System.out.println(s1);
		System.out.println(s1 + 5 + 10); // reusing return value from function
		boolean flag = e1.isUserActive("swapnil");
		System.out.println(flag);
		if(flag) {
			System.out.println("Increase the salary");
		}
		
		String trainerName = e1.getTrainerName();
		System.out.println(trainerName);
	}

}
