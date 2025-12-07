package javasessions;

import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {

		// ArrayLiterals: Static Array
		int i[] = { 10, 20, 30, 40, 50 }; // range: 0-4

		System.out.println(i.length);
		System.out.println(Arrays.toString(i));
		System.out.println(i[0]);

		// i[5] = 60; //AIOB - this is still static array we cannot go beyond its range
		i[0] = 5; // we can replace value of existing range index
		System.out.println(Arrays.toString(i));

		for (int m = 0; m <= i.length - 1; m++) {
			System.out.println(i[m]);
		}

		for (int e : i) {
			System.out.println(e);
		}

		String browser[] = { "chrome", "Firefox", "edge", "safari" };

		Object productInfo[] = { "Macbook Pro", 1000, true, 4.8, 'y' };

	}

}
