package OOP_Encapsulation;

public class EcommerceApp {

	public static void main(String[] args) {

		// Registration page: API Post call for creating user first time
		Customer c1 = new Customer("Swap", 32, 101, "Toronto");

		// My profile page: Get call of API to retrieve the value
		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		System.out.println(c1.getCity());
		System.out.println(c1.getCustId());

		// Update the values: in this case we need setters to update values
		// Put/Patch value in API to update the value
		c1.setAge(33);
		c1.setCity("New York");

		System.out.println("------------");
		// go to my profile page: Get call in API to retrieve the values
		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		System.out.println(c1.getCity());
		System.out.println(c1.getCustId());

	}

}
