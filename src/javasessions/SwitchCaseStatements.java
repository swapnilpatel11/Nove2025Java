package javasessions;

public class SwitchCaseStatements {

	public static void main(String[] args) {

		String browser = "chrome";
		int version = 100;

		switch (browser) {
		case "chrome":

			System.out.println("Launch chrome");
			
			switch (version) {
			case 100:
				System.out.println("Chrome v100.0");
				break;
				
				default:
					break;
			}
			System.out.println("Helloo chrome....");
			break;

		case "firefox":

			System.out.println("Launch firefox");
			break;

		case "edge":

			System.out.println("Launch edge");
			break;

		case "safari":

			System.out.println("Launch safari");
			break;

		default:
			System.out.println("Plz pass the right browser name...." + browser);
			break;
		}
		System.out.println("Bye");

		// byte,short,int,String -- allowed
		// long, float, double, boolean -- is not allowed

		int marks = 90;
		switch (marks) {
		case 90:
			System.out.println("Grade A");
			break;
		case 100:
			System.out.println("Grade A++");
			break;
		case 50:
			System.out.println("Grade B");
			break;
		case 0:
			System.out.println("Failed");
			break;
		default:
			System.out.println("Invalid Marks");
			break;
		}

		// char: numeric:
		char ch = 'a';
		switch (ch) {
		case 'a':
			System.out.println("a is vowel");
			break;
		case 'e':
			System.out.println("e is vowel");
			break;
		case 'i':
			System.out.println("i is vowel");
			break;
		case 'o':
			System.out.println("o is vowel");
			break;
		case 'u':
			System.out.println("u is vowel");
			break;

		default:
			System.out.println(ch + " is a consonent");
			break;
		}

		char th = 'B';
		switch (th) {
		case 65:
			System.out.println("Hiii");
			break;
		case 'B':
			System.out.println("Helooo");
			break;
		default:
			System.out.println("Byeee");
			break;
		}
		
		// Practical use cases: 
		// 1. Cross browser testing: 
		//2. cross OS/platforms: windows/mac/linux
		//3. multi env testing: qa/dev/stage/uat/prod
		//4. devices: ios/android/ windows/ desktop/browser
		// 5. Uber App: type of car: mini/sedan / suv
		// 6. RABC: Roll access based controll for users
		// 7. Payment methods: 
		// 8. API Automation: Get/ Put/ 

	}

}
