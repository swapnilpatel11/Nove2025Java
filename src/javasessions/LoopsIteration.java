package javasessions;

public class LoopsIteration {

	public static void main(String[] args) {

		int m[] = new int[4];
		m[0] = 10;
		m[1] = 20;
		m[2] = 30;
		m[3] = 40;

		for (int ele : m) {
			System.out.println(ele);
		}

		System.out.println("--------------");

		float marks[] = new float[5];
		marks[0] = 12.33f;
		marks[1] = 22.32f;
		marks[2] = 12.34f;

		for (float ele : marks) {
			System.out.println(ele);
		}

		char name[] = new char[4];

		name[0] = 'v';
		name[1] = 'i';
		name[2] = '$';
		name[3] = '0';

		for (char ele : name) {
			System.out.println(ele);
		}

		String browser[] = new String[4];
		browser[0] = "Chrome";
		browser[1] = "firefox";
		browser[2] = "edge";
		browser[3] = "ie";
		for (String ele : browser) {
			System.out.println(ele);
		}

		int num[] = new int[4];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;

		for (int i = 3; i >= 0; i--) {
			System.out.println(num[i]);
		}

		// reverse order using foreach:
		int count = num.length - 1;
		for (int ele : num) {
			System.out.println(num[count]);
			count--;
		}

		String empData[] = new String[4];
		empData[0] = "Vijay";
		empData[1] = "Pooja";
		empData[2] = "Ravi";
		empData[3] = "Tarun";
		for (int i = 0; i <= empData.length - 1; i++) {
			System.out.println(empData[i]);
			if (empData[i].equals("Ravi")) {
				System.out.println("Salary is increased by 10%");
			} else {
				System.out.println("Salary is incread by 5%");
			}
		}

		System.out.println("-----------------");

		for (String ele : empData) {
			System.out.println(ele);
			if (ele.equals("Ravi")) {
				System.out.println("Salary is increased by 10%");
			} else {
				System.out.println("Salary is increased by 5%");
			}
		}

	}

}
