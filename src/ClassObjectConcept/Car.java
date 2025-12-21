package ClassObjectConcept;

public class Car {

	String name;
	String licenseNumber;
	double price;
	String chasisNumber;
	String color;
	String model;
	static final int wheels = 4; // Final keyword is used to assigned constant value

	// if we do not put final keyword then we can manipulate this values at any line
	// and it will create bug so we put final keyword so it will not be assigned
	// again and values is constant

	// when the values are common for example wheels of car is common for every car
	// so we applied static
	// Object will hold only non static properties
	// Static properties stored in CMA (Common Memory Allocation)
	// Every class has Static and NonStatic properties

	public static void main(String[] args) {

		// We cannot defined static variable inside any method
		// we can create "final" constant inside method

		Car c1 = new Car();
		c1.name = "BMW";
		c1.licenseNumber = "BMW12121";
		c1.price = 50.55;
		c1.chasisNumber = "BMWCH12121";
		c1.color = "Black";
		c1.model = "X3";
		// c1.wheels = 4; // Warning - Static properties is not copied in object so we
		// cannot defined static properties, we have to use it in static way

		System.out.println(c1.name + " " + c1.licenseNumber);

		// How to access static properties/variables:
		// 1. Using the class name: good practice
		System.out.println(Car.wheels);

		// 2. Call directly: not a good practice
		System.out.println(wheels);

		// 3. Using object ref name: not a good practice
		System.out.println(c1.wheels); // the static field Car.wheels should be access in static way

		System.out.println(c1.name + " " + c1.licenseNumber + " " + c1.price + " " + c1.chasisNumber + " " + c1.color
				+ " " + c1.model + " " + Car.wheels);

		System.out.println("----------------");

		Car c2 = new Car();
		c2.name = "AUDI";
		c2.licenseNumber = "AUDI12121";
		c2.price = 52.55;
		c2.chasisNumber = "AUDICH12121";
		c2.color = "White";
		c2.model = "A6";
		// c2.wheels = 4;

		Car c3 = new Car();
		c3.name = "Honda";
		c3.licenseNumber = "Honda12121";
		c3.price = 15.55;
		c3.chasisNumber = "HONDACH12121";
		c3.color = "Red";
		c3.model = "City";
		// c3.wheels = 4;

	}

}
