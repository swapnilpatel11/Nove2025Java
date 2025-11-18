package javasessions;

public class IncrementDecrementExpressions {

	public static void main(String[] args) {

		// Interview type questions
		int i = 11;
		int j = i++ + ++i;
		System.out.println(i);
		System.out.println(j);

		int a = 11;
		int b = 22;

		int c = a + b + a++ + b++ + ++a + ++b;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

		int s = 0;
		int p = s++ - --s + ++s - s--;
		System.out.println(s);
		System.out.println(p);

		int r = 1, t = 2;
		int u = --t - ++r + ++t - --r;
		System.out.println(r);
		System.out.println(t);
		System.out.println(u);

		int m = 0, n = 0;
		int o = --m * --n * n-- * m--;
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);

		char ch = 'A';
		System.out.println(ch++);
		System.out.println(ch);

		double d = 1.5, D = 2.5;
		double d2 = d++ + ++D;
		System.out.println(d);
		System.out.println(D);
		System.out.println(d2);
		
		

	}

}
