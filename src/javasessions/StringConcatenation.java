package javasessions;

public class StringConcatenation {

	public static void main(String[] args) {

		// String - inbuilt class in JAVA
		// Non-primitive data types
		// Size: not fixed
		String s = "String DataType";
		System.out.println(s);

		int a = 100;
		int b = 200;
		String x = "Hello";
		String y = "Selenium";

		System.out.println(a + b);
		System.out.println(x + y);
		System.out.println(a + x);
		System.out.println(a + b + x + y);
		System.out.println(x + y + a + b);
		System.out.println(x + y + (a + b)); // Always start from left to right for calculation
		System.out.println(a + b + x + y + a + b);

		System.out.println("the value of  a: " + a);
		System.out.println("the sum is : " + (a + b));

		double d1 = 12.33;
		double d2 = 23.33;
		System.out.println(a + b + x + y + d1 + d2);
		System.out.println(a + b + x + y + (d1 + d2));

		char ch1 = 'a';
		String s1 = "Testing";
		System.out.println(ch1 + s1);

		boolean flag = true;
		String name = "Swapnil";
		System.out.println(flag + name);

		System.out.println('a' % 2);

	}

}
