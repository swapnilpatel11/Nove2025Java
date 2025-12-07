package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {
		// 1 to 10:

		// while
		// 1 to 10 print:

		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
			// ++i;
			// i = i +1;
		}
		System.out.println("------------------");

		int j = 10;
		while (j >= 1) {
			System.out.println(j);
			j--;
		}

		System.out.println("-----------------------------");
		//
		int l = 1;
		while (l <= 10) {
			System.out.println("Hi");
			l++;
		}

		System.out.println("----------------------------");

		// Use case: Hover board to advertisement
		while (true) {
			System.out.println("Welcome to Hotel Taj");
			break;
		}

		System.out.println("----------------------------");

		int n = 1;
		while (n <= 10) {
			if (n % 2 == 0) {
				System.out.println(n + " is even number");

			}
			n++;

		}

		int m = 1;
		while (m <= 10) {
			if (m % 2 == 1) {
				System.out.println(m + " is odd number");

			}
			m++;

		}
		System.out.println("------------------");
		int total = 1;
		while (total <= 20) {
			System.out.println("Hello!!!!!");
			if (total == 10) {
				System.out.println("Byee!!!");
				break;
			}
			total++;
		}
		System.out.println("------------------");
		// 2. For Loop
		// 1 to 10
		for (int a = 1; a <= 10; a++) {
			System.out.println(a);
		}
		System.out.println("------------------");
		// Infinite loop : interview code
		for (;;) {
			System.out.println("hey!!!!");
			break;
		}
		System.out.println("------------------");
		for (int k = 1; k <= 50; k++) {
			if (k % 5 == 0) {
				System.out.println(k);
			}
		}
		System.out.println("------------------");
		// a-z
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
		System.out.println("------------------");
		//
		for (short b = 1; b <= 200; b++) {
			System.out.println(b);
		}

		System.out.println("------------------");

		for (float r = 00.1f; r <= 5.5; r++) {
			System.out.println(r);
		}

		System.out.println("------------------");

		// 10 to 1
		for (int t = 10; t >= 1; t--) {
			System.out.println(t);
		}

		// Use cases of while loop:
		// when number of iterations are not fixed... use while loop:
		// 1. wait for element: 1 4 9 15 seconds
		// 2. wait for page loading: 2 8 10 15 20 seconds
		// 3. Calendar handling: clicking on next or previous button
		// 4. Zomato/instagram/linkedin: infinite scrolling
		// 5. Carousel
		// 6. webtable with pagination
		// 7. database data:

		// Use cases of for loop:
		// when number of iterations are fixed.. use for loop:
		// arrays
		// month dropdown: jan to dec: 1 to 12
		// day : 1 to 31
		// category dropdown: 1 to 5
		System.out.println("-------do-while-------");

		// 3. do-while loop:

		int p = 1;
		do {
			System.out.println(p);
			p++;
		} while (p <= 10);

		System.out.println("--------------");

		do {
			System.out.println("Welcome to SP Academy");
			break;
		} while (true);

		// example with while and do while to see difference
		int r1 = 1;
		while (r1 >= 10) {
			System.out.println("Hello");
			r1++;
		}

		//

		int p1 = 1;
		do {
			System.out.println("Hello");
			p1++;
		} while (p1 >= 10);

		// Use case of do-while:
		// element is present on the page already..no need to wait for the element
		// if element is not present then only start the wait using loop:

	}

}
