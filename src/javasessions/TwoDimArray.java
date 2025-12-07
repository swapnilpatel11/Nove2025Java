package javasessions;

import java.util.Arrays;

public class TwoDimArray {

	public static void main(String[] args) {
		// [][] = [row][column]

		int num[][] = new int[4][4];
		num[0][0] = 10;
		num[0][1] = 20;
		num[0][2] = 30;
		num[0][3] = 40;

		// num[0][4] = 100; //AIOB out of index - this is also fixed two dimensional
		// array

		// to print array values deepToString method
		System.out.println(Arrays.deepToString(num));

		System.out.println(num.length); // total number of rows

		System.out.println("----------Printing 2d Array--------------");
		// 2d Array Literals:
		// total number of segments = 3 x 3 = 9
		int numbers[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

		System.out.println(Arrays.deepToString(numbers));

		// as we go to 2d array or 3d array time complexity is increasing respectively
		// like O(n)^2 and O(n)^3
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) { // length of row we are capturing here
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("-----------Using For Each Loop: Not recommanded-------");
		// for each loop:
		for (int row[] : numbers) { // go to row
			for (int col : row) { // iterate column of row
				System.out.print(col + " "); // print column value
			}
			System.out.println();
		}

		System.out.println("------Declaring 2d Object-------");
		// Object Array Declaration
		// Data driven approach - driving data from external source
		Object userData[][] = { { "Omkar", "automation", "om@gmail.com", "9090987676", "om123", true },
				{ "Vijay", "auto", "vj@gmail.com", "9090987679", "vj123", true },
				{ "Anu", "sharma", "anu@gmail.com", "9090987678", "om123", true } };
		System.out.println(Arrays.deepToString(userData));

		System.out.println("-----------Using For Each Loop: Not recommanded-------");
		// for each loop:
		for (Object row[] : userData) { // go to row
			for (Object col : row) { // iterate column of row
				System.out.print(col + " "); // print column value
			}
			System.out.println();
		}

	}

}
