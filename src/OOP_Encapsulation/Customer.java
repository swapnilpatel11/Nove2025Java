package OOP_Encapsulation;

public class Customer {

	// Blueprint of customer class so no need to write main method
	// EcommerceApp class is calling class where main method is needed
	private String name;
	private int age;
	private int custId;
	private String city;

	// public constructor
	// Constructor is behaving like setters? Yes
	public Customer(String name, int age, int custId, String city) {
		this.name = name;
		this.age = age;
		this.custId = custId;
		this.city = city;
	}

	// public getters and setters
	// getters and setters are only for private variables, not required for private
	// methods
	// why setter is imp? Updating values then we do not need to create another
	// object
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
