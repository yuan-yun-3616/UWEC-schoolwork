/* Task 1: Setup
 * student name: Mingrui Liu
 * This program is a practice about variable, scanner and formatted print in java
 */

import java.util.Scanner;

public class PersonalGreeter {
	
	// Task 2: Constant & variable//
	// Constant that will be used
	final static int DAYS_PER_YEAR = 365;
	final static double CM_PER_INCH = 2.54;
	
	public static void main(String[] args) {
		
		// Variable that will be asked to scan
		String fullName;
		String nickName;
		int age;
		double cmHeight;
		double favoriteNumber;
		boolean likeGame;
		
		
		// Task 3: Prompt and Read Input//
		Scanner sc = new Scanner(System.in);	// Set a scan statement
		
		System.out.print("User's name: ");
		fullName = sc.nextLine();
		
		System.out.print("User perferred name: ");
		nickName = sc.nextLine();
		
		System.out.print("User's age: ");
		age = sc.nextInt();
		
		System.out.print("User's Height in cm: ");
		cmHeight = sc.nextDouble();
		
		System.out.print("User's favorite number: ");
		favoriteNumber = sc.nextDouble();
		
		sc.nextLine();	//Up and low are nextDouble() and NextLine(), so use a sc.nextLine to separate them
		
		System.out.print("User like play game(Y/N): ");
		String answer = sc.nextLine();
		likeGame = answer.equalsIgnoreCase("Y");	// Only "Y" will become true
		
		
		// Task 4: Derived Value & Type Casting//
		// store new variable use the constant from the top and the variable that scanned
		int daysInYear = age * DAYS_PER_YEAR;
		double heightInInches = cmHeight / CM_PER_INCH;
		
		int castingHeightInInches = (int) heightInInches;
		Long roundingHeightInInches = Math.round(heightInInches);
		char userFirstInitial = nickName.charAt(0);
		/*
		 * Casting is just integer the number by ignore the decimals
		 * rounding is also integer the number, but will if the decimals is larger than 0.5,
		 * the decimal part will become zero and add one to the integer part
		 */
		
		
		// Task 5: Output - Two Presentations//
		System.out.println();
		System.out.println();
		System.out.println("Welcome! " + nickName + "(" + age + ")" + "___" + favoriteNumber + userFirstInitial);
		System.out.println();
		System.out.println();	// Make some space between above to make the output board more clear
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.printf("------------------------ID Card--------------------------------\n"
						+ "Full name: %s		:	Perferred name: %s			 \n"
						+ "Age in years: %d		:	Age in days: %d				 \n"
						+ "Height(cm): %.2f		:	Height(in): %.2f				 \n"
						+ "Casting height(in): %d		:	Rounding height(in): %d			 \n"
						+ "Like play games: %s		:									 \n"
						+ "---------------------------------------------------------------"
						, fullName, nickName, age, daysInYear, cmHeight, heightInInches
						, castingHeightInInches, roundingHeightInInches, likeGame);		
		

	}

}
