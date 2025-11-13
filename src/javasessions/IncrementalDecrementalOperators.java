package javasessions;

public class IncrementalDecrementalOperators {

	public static void main(String[] args) {
		// ++ , --

		// 1. post increment: ++
		int a = 1;
		int b = a++; // first original value to b so b =1 and then increment 'a' so a = 2
		System.out.println(a);
		System.out.println(b);

		int x = 100;
		int y = x++;
		System.out.println(x);
		System.out.println(y);

		int c = -99;
		int d = c++;
		System.out.println(c);
		System.out.println(d);

		int p = 10;
		System.out.println(p++);
		System.out.println(p);

		// 2. pre increment: ++
		int m = 1;
		int n = ++m; // first increase value of m so m =2 then assign to n so n =2
		System.out.println(m);
		System.out.println(n);

		int u = -999;
		int w = ++u;
		System.out.println(u);
		System.out.println(w);

		int t = 10;
		System.out.println(++t);
		System.out.println(t);

	}

}
