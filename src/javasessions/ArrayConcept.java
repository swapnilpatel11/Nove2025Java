package javasessions;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {

		// Array is collection of multiple values.

		// declare the array: using new keyword:

		// int array:
		int i[] = new int[4]; // 0-3 range; li=0; hi=3; length=4

		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i[0]);
		System.out.println(i[3]);
		// System.out.println(i[4]); //ArrayindexoutofBoundsException - AIOB - Runtime
		// exception
		// memory will be allocated in runtime so
		// there is no negative index

		int p[] = new int[4];
		p[0] = 10;
		p[2] = 30;
		System.out.println(p[0]);
		System.out.println(p[1]);
		System.out.println(p[2]);
		System.out.println(p[3]);

		// byte array;
		byte b[] = new byte[2]; // 0-1; li=0; hi=1; length=2
		System.out.println(Arrays.toString(b)); // Default value of byte 0

		System.out.println("---------------");
		
		// short array;
		short sh[] = new short[3]; // 0-2; li=0; hi=2; l=3
		System.out.println(Arrays.toString(sh));
		
		System.out.println("---------------");
		
		// float array;
		float marks[] = new float[5]; // 0-4; li=0; hi=4; l=5;
		marks[0] = 12.33f;
		marks[1] = 22.33f;
		marks[2] = 2.34f;

		System.out.println(marks[0]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		
		System.out.println(Arrays.toString(marks));
		
		System.out.println("--------------");
		
		// char array:
		char name[] = new char[4]; // 0-3; li=0; hi=3; l=4

		name[0] = 'v';
		name[1] = 'i';
		name[2] = 'j';

		System.out.println(name[0]);
		System.out.println((int) name[3]); // it gives empty value as default value when we do not declare its value in
											// array
		System.out.println(Arrays.toString(name));
		
		System.out.println("----------------");
		
		// boolean array:
		boolean flag[] = new boolean[2];
		flag[0] = true;
		flag[1] = false;

		// String array:
		String browser[] = new String[4]; // 0-3; li=0;hi=3; l=4
		browser[0] = "chrome";
		browser[1] = "firefox";
		browser[2] = "edge";

		System.out.println(browser[0]);
		System.out.println(browser[3]);
		// System.out.println(browser[4]);

		System.out.println("------------");

		int m[] = new int[4];
		m[0] = 10;
		m[1] = 20;
		m[2] = 30;
		m[3] = 40;

		System.out.println(m);
		System.out.println(Arrays.toString(m));

		// to print all the values of array: iterations of the array: using for loop:

		// 1. index based loop:
		for (int k = 0; k <= m.length - 1; k++) {
			System.out.println(m[k]);
		}

		// 2. for each loop: advance for loop:
		for (int e : m) {
			System.out.println(e);
		}

	}

}
