package FunctionsConcept;

public class User {

	// Acceptance Criteria: getting the student marks
	// Write a Function: function name: getStudentMarks(String studentName)
	// 1 parameter: studentName(String)
	// return: marks(int)

	public int getStudentMakrs(String studentName) {
		System.out.println("getting the marks for: " + studentName);

		if (studentName.equals("swap")) {
			return 90;
		} else if (studentName.equals("vijay")) {
			return 80;
		} else if (studentName.equals("priya")) {
			return 85;
		} else if (studentName.equals("nirali")) {
			return 10;
		} else {
			System.out.println("Student is not found " + studentName);
			return 0;
		}
	}

	public int getMarks(String studentName) {
		System.out.println("Getting  the marks for: " + studentName);

		switch (studentName.trim().toLowerCase()) {
		case "swap":
			return 90;

		case "vijay":
			return 80;
		case "priya":
			return 85;
		case "nirali":
			return 10;

		default:
			System.out.println("Student is not found " + studentName);
			return 0;
		}

	}

	public static void main(String[] args) {
		User u1 = new User();
		int swapMarks = u1.getStudentMakrs("swap");
		System.out.println(swapMarks);
		if (swapMarks >= 1 && swapMarks <= 100) {
			System.out.println("Print the marksheet");
		}

		int niraliMarks = u1.getMarks("Nirali");
		System.out.println(niraliMarks);
		
		

	}

}
