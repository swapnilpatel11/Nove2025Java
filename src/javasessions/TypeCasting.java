package javasessions;

public class TypeCasting {

	public static void main(String[] args) {

		// Widening
		byte b = 10;
		short s = b;
		System.out.println(s);

		int i = b;
		System.out.println(i);

		long l = b;
		System.out.println(l);

		int t = 200;
		byte g = (byte) t;
		System.out.println(g); // Loss of data because we cannot store int in byte which is out of range for
								// byte

		short r = (short) t;
		System.out.println(r);

		int u = 50000;
		short p = (short) u;
		System.out.println(p);

		long k = 90909090900l;
		byte a = (byte) k;
		System.out.println(a);

		int total = 100;
		byte total1 = (byte) total;
		System.out.println(total1);

		int price = 9000;
		float pr = price;
		System.out.println(pr);

		byte e = 10;
		double d = e;
		System.out.println(d);

		double s1 = 12.33; // Widening without loss of data only decimal value is lost due to data types
		byte b1 = (byte) s1;
		System.out.println(b1);

		double s2 = 300.44;
		byte b2 = (byte) s2;
		System.out.println(b2); // why 44? -127 to 128 = total 256 so 300 - 256 = 44

		long bill = 40000;
		float bg = bill;
		System.out.println(bg);

		// Interview Question
		byte x1 = 10;
		byte x2 = 20;
		byte x3 = (byte) (x1 + x2); // getting error because x1 and x2 will be int in future than it will be
									// mismatch beyond the range
		System.out.println(x3);

		// OR convert it to int
		short c1 = 10;
		short c2 = 200;
		int c3 = c1 + c2;
		long c4 = c1 + c2;
		float c5 = c1 + c2;
		double c6 = c1 + c2;

		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);

		// char to int
		char ch = 'a';
		int ci = ch;
		System.out.println(ci);

		byte bh = (byte) ch;
		System.out.println(bh);

	}

}
