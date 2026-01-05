package ConstructorConcept;

public class Employee {

	String name;
	int age;
	double salary;
	boolean isActive;
	char gender;
	String dob;
	String city;

	// Constructor of the class
	// name will be same as class name
	// cannot return anything.. no void, no return
	// we never write the business/Application logic inside constructor
	// Constructor is used to initialized the class instance variables
	// it looks like a function but not a function
	// constructor will be called when we create the object of the class
	// Can we overload constructors? Yes (Java and C# we can)
//	public Employee() {
//		System.out.println("default constructor...");
//	}
//
//	public Employee(int a) {
//		System.out.println("1 para constructor..." + a);
//	}
//
//	public Employee(int a, int b) {
//		System.out.println("1 para constructor..." + a + b);
//	}

	// Acceptance Criteria: you have to create the employee registration via
	// registration form
	// Rules:
	// 1. Employee can be registered with name, age, city
	// 2. Employee can be registered with name, age,city, gender
	// 3. Employee can be registered with name, age, dob, city
	// 4. Employee can be registered with name,age,city,isActive,gender,city

	public Employee(String name, int age, String city) {
		// Global variable = local variable
		// name = name; // Local = Local
		this.name = name; // Global = local
		this.age = age;
		this.city = city;
	}

	public Employee(String name, int age, String city, char gender) {
		this.name = name; // Global = local
		this.age = age;
		this.city = city;
		this.gender = gender;
	}

	public Employee(String name, int age, boolean isActive, char gender, String dob, String city) {
		this.name = name;
		this.age = age;
		this.isActive = isActive;
		this.gender = gender;
		this.dob = dob;
		this.city = city;
	}

	public Employee(String name, int age, boolean isActive, char gender, String city) {
		this.name = name;
		this.age = age;
		this.isActive = isActive;
		this.gender = gender;
		this.city = city;
	}

	public static void main(String[] args) {

		// Employee e1 = new Employee(); // which constructor will be called? it depends
		// on parameter we are passing

		Employee e1 = new Employee("Tom", 20, "Pune"); // local variables
		System.out.println(e1.name);

		// Employee e2 = new Employee(); //Java will not call default constructor so it
		// restrict unnecessary objects

		Employee e2 = new Employee("Peter", 20, true, 'M', "Toronto");
		System.out.println(e2.name + e2.age + e2.isActive + e2.gender + e2.city);

	}

}
