package OOP_Encapsulation;

public class Employee {

	private String name; //cannot be null
	private int age; // min age can be greater than 20 only
	private double salary; // min salary should be 10 LPA
	private char gender;
	private boolean isActive;

	// Public getter and setters
	// Each variable we have to create two methods
	// Data Security
	public void setName(String name) {
		// this.G = L;
		if (name != null) {
			this.name = name;
		} else {
			System.out.println("Name cannot be null");
		}
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>=20) {
		this.age = age;
		}else {
			System.out.println("Age must be grater than 20");
		}
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}
