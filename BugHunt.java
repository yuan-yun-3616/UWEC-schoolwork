// This code intentionally contains syntax and logic errors.
// Your job: make it compile, behave correctly, and add try/catch input validation.
// Then add a top-of-file comment reflecting on bugs you found and how you fixed them.
import java.util.Scanner;

public class BugHunt {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Choose mode [grade/temp]: ");
		String mode = sc.nextLine();

		if (mode.equals("grade") || mode.equals("GRADE")) {
			runGrade(sc);
			
		} else if (mode.equals("temp") || mode.equals("TEMP")) {
			runTemp(sc);
			
		} else {
			System.out.println("Unrecognized mode: " + mode);
			
		}

		sc.close();
	}
	
	
	static void runGrade(Scanner sc) {
		System.out.print("Enter numeric score 0-100: ");
		
		
		int score = sc.nextInt();
		
		
		if (score > 100 || score < 0) {
			System.out.println("Out off the range");
			System.exit(0);
		}
		
		if (score >= 90) {
			System.out.println("Letter grade: A");
		
		} else if (score >= 80) {
			System.out.println("Letter grade: B");
		
		} else if (score >= 70) {
			System.out.println("Letter grade: C");
		
		} else if (score >= 60) {
			System.out.println("Letter grade: D");
		
		} else {
			System.out.println("Letter grade: F");
		
		}
		
		
		
	}
	
	static void runTemp(Scanner sc) {
		System.out.print("Enter Fahrenheit temperature: ");
		
		double f = sc.nextDouble();
		double c = (f - 32) / 1.8;
		System.out.println("Celsius: " + String.format("%.2f", c));
		
		if (f > 32 && f < 212) {
			System.out.println("Phase: liquid");
		
		} else if (f >= 212) {
			System.out.println("Phase: gas");
		
		} else {
			System.out.println("Phase: solid");
		
		}
		
	
		
	}
}