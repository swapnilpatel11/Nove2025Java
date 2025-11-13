package javasessions;

public class DataTypesSessions {

	public static void main(String[] args) {

		System.out.println("Hello World");

		// Data Types:
		// 1. Primitive type data types: Fixed memory size - int, double, boolean
		// 2. Non-primitive Data types: Class, Object, interface, array, OOPs

		// Primitive type data types:
		// 1. Numeric Type:
		// Integral Value:
		// a. Integer: byte, short, int, long
		// b. floating - point: float, double
		// character value: char: 1, #, $, a
		// 2. Boolean type: boolean: true/false

		// 1. byte:
		// size: 1 byte = 8 bits
		// range: -128 to 127 => -2^7 to 2^7-1
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = 0;
		byte b4 = 127;
		byte b5 = -10;
		byte b6 = -128;
		byte age = 30;

		System.out.println(b1);
		System.out.println(age);

		// 2. short:
		// size: 2 bytes = 16 bits
		// range: -32768 to 32767 => -2^15 to 2^15-1
		short s1 = 1000;
		short s2 = -900;
		System.out.println(s1);
		System.out.println(s1 + s2);

		// 3. int:
		// size: 4 bytes = 32bits
		// range: -2147483648 to 2147483647

		int i = 1989898989;

		// 4. long:
		// size: 8 bytes = 64bits
		// range: -2^63 to 2^63-1
		// Use case: distance between moon and earth, blood cell count, scientific
		// calculations
		long l1 = 10;
		System.out.println(l1);
		long num = 9898765678l; // Explicitly tell java to accept this number
		System.out.println(num);

		// Reassignment
		int p = 10;
		p = 20;
		p = 30; // latest value of p
		System.out.println(p);

		// 5. float:
		// size: 4 bytes = 32 bits
		// range: after . it may take upto 6-7 digits
		float t = 12.33f; // have to use identifier to defined float
		float t1 = (float) 34.33;
		System.out.println(t1);
		System.out.println(t);

		float f3 = 121212121.90f;
		System.out.println(f3);

		// 6. double:
		// size: 8 bytes = 64 bits
		// range: after . it may take upto 15-16 digits
		// use case: bank balance, health care systems
		double d1 = 12.3333;
		double d2 = -909.98989;

		// Bigdecimal class: for long ranges

		// 7. char:
		// within single quotes: ''
		// can hold only single digit value
		// size: 2 bytes = 16 bits
		// chinese, arabic, symbols, unicodes
		// size: ASCII/Unicode
		char ch = 'a';
		char ch1 = 'Z';
		char ch2 = '1';
		char ch3 = '$';
		char gender = 'f';

		// 8.boolean:
		// range: true/false
		// size: ~ 1 bit
		boolean flag = true;
		boolean isActive = false;

		System.out.println(flag);
		System.out.println(isActive);

		// mobile number, SSN, Aadhar card
		// -- String only
		String phone = "+16474564984";
		String CC = "1221 1234 121121";
		System.out.println(phone);

	}

}
