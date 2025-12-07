package javasessions;

public class NestedLoops {

	public static void main(String[] args) {
		
		// 10 11 12 13 14 15
		// 20 21 22 23 24 25
		// 30 31 32 33 34 35
		
		
		for(int i=1; i<=5; i++) {
			
			for(int j=0; j<=5; j++) {
				System.out.print(i+""+j + " ");
			}
			System.out.println();
		}
		
		// 000 001 002 003 004 005
		// 501 501 502 503 504 555
		
		// Excel data: rows and columns
		// CSV data
		// 2d arrays
		

	}

}
