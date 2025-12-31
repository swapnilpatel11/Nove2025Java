package FunctionsConcept;

import java.util.Arrays;

public class Customer {

	// Acceptance criteria:
	// Write a function: to get the cart details with all the products
	// name: getCartDetails(String customerName)
	// return: String[] --> array of products

	public String[] getCartDetails(String customerName) {
		System.out.println("Getting the cart details for: " + customerName);

		if (customerName.equals("swap")) {
			// macbook pro, nike tshirt, tv, shoes
			String product[] = { "Macbook Pro", "Nike Tshirt", " Samsung TV", "iPad" };
			return product;
		} else if (customerName.equals("vijay")) {
			String product[] = { "Macbook Pro", "iPhone" };
			return product;
		} else if (customerName.equals("anu")) {
			String product[] = { "Macbook Pro", "iPhone 15 pro max" };
			return product;
		} else {
			System.out.println("Customer is not found " + customerName);
			return null;
		}

	}
	// create same logic with switch case: homework

	public static void main(String[] args) {

		Customer c1 = new Customer();
		String[] cart = c1.getCartDetails("swap");
		System.out.println(Arrays.toString(cart));
		System.out.println("Cart Size: " + cart.length);

	}

}
