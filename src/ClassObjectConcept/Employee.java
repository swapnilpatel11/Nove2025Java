package ClassObjectConcept;

public class Employee {

	// class fields - class variables - instance variables

	String name;
	int age;
	String empID;
	String deptName;
	char gender;
	boolean isPermanent;
	double salary;

	public static void main(String[] args) {

		// class: is a category for object or BluePrint -- fields/class/Instance vars
		// variables/instance vars
		// Object: Physical Entity
		// Non primitive - no fixed memory

		// create the Object: always create object in method : Using new keyword
		// RHS new Employee is the object, e1 is reference name, Employee class name
		Employee e1 = new Employee();

		// Assigning values to the object fields
		e1.name = "Swapnil";
		e1.age = 32;
		e1.empID = "101";
		e1.deptName = "QA";
		e1.gender = 'm';
		e1.isPermanent = true;
		e1.salary = 80000;

		System.out.println(e1.name);
		System.out.println(e1.empID);
		System.out.println(e1.salary);

		//
		Employee e2 = new Employee();
		e2.name = "Patel";

		System.out.println(e2.name);
		System.out.println(e2.isPermanent); // print default value

		// no reference name object - not a good practice.it create object every time
		new Employee().name = "Tom";
		new Employee().age = 40; // it will create another object

		// null reference Object:
		Employee e3 = new Employee();
		e3 = null;
		e3.name = "Niti";
		// System.out.println(e3.name); // nullpointer exception

		// System.gc(); // calling the garbage collector programmatically -- but there
		// is no gurantee that gc will be called...gc is dependent on JVM

	}

}
