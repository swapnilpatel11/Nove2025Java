package javasessions;

public class LogicalOperators {

	public static void main(String[] args) {

		// & and OR operators

		int i = 10;
		int j = 20;

		if (i > 10 & j >= 20) {
			System.out.println("Hi");
		} else {
			System.out.println("Bye");
		}

		// & - single AND operator has performance issue like it checks each condition
		// even if first condition is false
		// so we use && operator
		// && -- short circuit operator
		if (i >= 10 && j >= 20 && i >= 30 && i <= 0) {
			System.out.println("hi");
		} else {
			System.out.println("bye");
		}

		if (true & true & true & true) {
			System.out.println("Hello");
		}

		// | || : OR operator , Any condition is true overall true

		int m = 10;
		int n = 20;

		if (m >= 10 | n >= 20) {
			System.out.println("Selenium");
		} else {
			System.out.println("Playwright");
		}

		// || : for performance
		if (m >= 10 || n <= 5 || n <= 2 || n < 1) {
			System.out.println("Selenium");
		} else {
			System.out.println("Playwright");
		}

		// Interview Question: to find put the highest number (Given 3 different
		// numbers):
		int a = 100;
		int b = 200;
		int c = 300;
		if (a > b && a > c) {
			System.out.println("a is greatest number");
		} else if (b > c) {
			System.out.println("b is greatest number");
		} else {
			System.out.println("c is greatest number");
		}

	}

}
