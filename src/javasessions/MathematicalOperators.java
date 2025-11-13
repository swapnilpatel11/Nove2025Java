package javasessions;

public class MathematicalOperators {

	public static void main(String[] args) {

		System.out.println(10 + 20);
		System.out.println(10 - 20);
		System.out.println(10 * 20);
		System.out.println(20 / 10);

		System.out.println(9 / 2); // o/p is integer so no decimal value
		System.out.println(8 / 2);
		System.out.println(9.0 / 2); // 4.5
		System.out.println(9.0 / 2.0);

		System.out.println(0 / 9);
		// System.out.println(9/0); //Arithmetic exception
		System.out.println(9.0 / 0); // Infinity
		// System.out.println(0/0); // Arithmetic exception

		System.out.println(0 / 0.0); // NaN = not a number

		System.out.println(0.0 / 0); // NaN
		// System.out.println(100/0); // Arithmetic exception

		System.out.println(9.99 / 0); // Infinity

		// % = remainder of calculation will be o/p
		System.out.println(9 % 2);
		System.out.println(8 % 2);
		System.out.println(20 % 3);

	}

}
