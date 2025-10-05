// Mingrui Liu
/* Exception error in both runGrade and runTemp methods, 
 * debug by add a convertTest method to convert String to double and return error message if find non-numeric input
 */
// Syntax error in the main method, debug "mode ==" to "mode.equals()". (line 16 & 19)
// Logic error in the runTemp method, debug "double c = (f - 32) * 1.8" to "double c = (f - 32) / 1.8". (line 68)

import java.util.Scanner;

public class BugHunt {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Choose mode [grade/temp]: ");
		String mode = sc.nextLine();

		if (mode.equals("grade") || mode.equals("GRADE")) {	// Both grade and GRADE are acceptable
			runGrade(sc);
			
		} else if (mode.equals("temp") || mode.equals("TEMP")) {	// Both temp and TEMP are acceptable
			runTemp(sc);
			
		} else {
			System.out.println("Unrecognized mode: " + mode);	// Give an error message if the input doesn't match all above
			
		}

		sc.close();
	}
	
	
	static void runGrade(Scanner sc) {
		System.out.print("Enter numeric score 0-100: ");
		
		
		double score = convertTest(sc.nextLine());	// Go to convertTest method
		
		
		if (score > 100 || score < 0) {
			System.out.println("Out off the range");	// Give a error message if the input out off the range
			System.exit(0);	// Close the program
		}
		
		if (score >= 90) {	// Return a grade for each range
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
		
		double f = convertTest(sc.nextLine());	// Go to convertTest method
		double c = (f - 32) / 1.8;	// Convert fahrenheit to Celsius
		System.out.println("Celsius: " + String.format("%.2f", c)); // Output the Celsius
		
		if (f > 32 && f < 212) {	// Give the phase of water at the fahrenheit temperature
			System.out.println("Phase: liquid");
		
		} else if (f >= 212) {
			System.out.println("Phase: gas");
		
		} else {
			System.out.println("Phase: solid");
		
		}
	}
	
	static double convertTest(String inputWord) {	// The type of the inputWord is String
		double value = 0;	// Set a variable
		
		try {
			value = Double.parseDouble(inputWord);	// Convert String type to double
		} catch(Exception e) {
			System.out.println("Something went wrong");	// Give an error message if there has non-numeric letter
			System.exit(0);	// Close the program
		}
		return value;	// Return the variable
	}
		
	
}