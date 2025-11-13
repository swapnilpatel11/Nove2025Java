package javasessions;

public class CharConcept {

	public static void main(String[] args) {

		char ch1 = 'a';
		char ch2 = 'b';

		// a-z : 97 to 122
		// A-Z : 65 to 90
		// 0-9 : 48 to 57

		System.out.println(ch1);
		System.out.println(ch1 + ch2); // Any mathematical operation it consider ascii value of that character
		System.out.println(ch2 - ch1);

		System.out.println('A' - 'B');
		System.out.println(ch1 * 10);

		System.out.println(ch2);
		System.out.println(ch1 + 0);
		System.out.println((byte) ch1);

		System.out.println('a' + 'b' + "hello" + 100 + 200);
		System.out.println(100 + 200 + 'a' + 'b');

		System.out.println('a');

		System.out.println((byte) '$'); // ASCII value of dollar sign

		System.out.println((byte) ' '); // ASCII value of space 32

		System.out.println(97);
		System.out.println((char) 97);// char value of 97

		System.out.println((char) 98987);

		// unicode chars: 16000 chars + 127 ASCII values
		System.out.println('a' + 2);

		int p = 100;
		System.out.println((char) p);

		System.out.println('a' + "A"); // aA

	}

}
