package javasessions;

public class TimeComplexity {

	public static void main(String[] args) {

		// TC: O(n): Big Oh

		int i = 10;
		System.out.println(i);
		// O(1)

		for (int j = 1; j <= 10; j++) {
			System.out.println(j);
		}
		// O(10): loop will run 10 times
		// O(n): n could be any number
		// 1+n+n+n: 3n+1 (Linear Equation)

		for (int l = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				System.out.print(l + "" + j + " ");
			}
			System.out.println();
		}
		// (1+n+n+n)(1+n+n+n) = (1 + 3n) (1+3n) => 1+3n+3n+9n^2 => 9n^2+6n+1 (Quadratic
		// equation)
		// 9n^2+6n+1 ==> 9n^2+6n => 3n(3n+2) ==> 9n^2 ==> O(n^2)
		// when need to read data from excel files that time we need nested loops

		for (int l = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				for (int k = 0; k <= 10; k++)
					System.out.print(l + "" + j + " " + " " + k);
			}
			System.out.println();
		}

	}

}
