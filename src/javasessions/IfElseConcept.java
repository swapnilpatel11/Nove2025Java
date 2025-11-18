package javasessions;

public class IfElseConcept {

	public static void main(String[] args) {

		System.out.println(10 == 10);

		int i = 0;
		System.out.println(i > 5);
		System.out.println(i < 90);
		System.out.println(i > 11);

		int p = 10;
		int m = 20;

		if (m > p) {
			System.out.println("Hiiii");
		} else {
			System.out.println("Byeee");
		}

		// Dead Code which goes to directly Else condition
		if (false) { // Dead Code
			System.out.println("I love Java");
		} else {
			System.out.println("Bye!!!!");
		}

		boolean flag = false;
		if (false) {
			System.out.println("Java");
		} else {
			System.out.println("Python");
		}

		int marks = 10;
		if (marks >= 90) {
			if (marks >= 95) {
				System.out.println("Grade A");
				if (marks == 100) {
					System.out.println("Grade A++");
				}
			}
		} else {
			if (marks <= 80) {
				System.out.println("Grade B");
			} else {
				System.out.println("Byeee!!!!");
			}
		}

		//

//		String browser = "chrome";
//		if (browser.equals("chrome")) {
//			System.out.println("Launch chrome");
//		}
//		if (browser.equals("firefox")) {
//			System.out.println("Launch firefox");
//		}
//		if (browser.equals("edge")) {
//			System.out.println("Launch edge");
//		}
//		if (browser.equals("safari")) {
//			System.out.println("Launch safari");
//		}
//		else {
//			System.out.println("Plz pass the right browser...");
//		}
//		
		String browser = "chrome";
		if (browser.equals("chrome")) {
			System.out.println("launch Chrome");
		} else if (browser.equals("firefox")) {
			System.out.println("Lannch Firefox");
		} else if (browser.equals("edge")) {
			System.out.println("Launch edge");
		} else if (browser.equals("safari")) {
			System.out.println("Launch safari");
		} else {
			System.out.println("plz pass the right browser...");
		}

		// AC: user is eligible for voting if the user age is greater than or equal to
		// 16:

		int age = 5;
		if (age >= 16) {
			System.out.println("Eligible for voting");
		} else {
			System.out.println("Not eligible for voting");
		}

	}

}
