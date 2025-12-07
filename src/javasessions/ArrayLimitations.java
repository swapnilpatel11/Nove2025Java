package javasessions;

import java.util.Arrays;

public class ArrayLimitations {

	public static void main(String[] args) {

		// Limitations of Array:
		// 1. Size is fix: to overcome this, we need to use dynamic array (ArrayList)
		// 2. Similar type of data: to overcome this, we need to use Object static array
		// or ArrayList

		// emp info: name(String), age(int), salary(double), gender(char),
		// isPermanent(boolean)

		Object empInfo[] = new Object[5];
		System.out.println(Arrays.toString(empInfo));

		// Default value of any non premitive or any class is null
		empInfo[0] = "Anu";
		empInfo[1] = 35;
		empInfo[2] = 34.55;
		empInfo[3] = 'f';
		empInfo[4] = true;

		System.out.println(Arrays.toString(empInfo));

		for (Object ele : empInfo) {
			System.out.println(ele);
		}
		System.out.println("------------");
		for (int i = 0; i <= empInfo.length - 1; i++) {
			System.out.println(empInfo[i]);
		}

		// Usecases of static array
		// Booking movie tickets
		// Railway tickets
		// Months,days,countries

	}

}
