/* Mingrui Liu
 * This is a little program that use if/else, boolean, and create a two-mode calculator
 */

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		String modeUse;
		double firstNumber;
		double secondNumber;
		String operator;
		String roundingMode;
		double result = 0;
		String comparator;
		Boolean resultTrueFalse = true;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Choose a mode either 'calc' or 'compare' (all lowercase, no whitespace, same for whole program): ");
		modeUse = sc.nextLine();
		
		if(modeUse.equals("calc") || modeUse.equals("compare")) {
			if(modeUse.equals("calc")) {
				System.out.print("First number(use double type): ");
				firstNumber = sc.nextDouble();
				
				System.out.print("Second number(use double type): ");
				secondNumber = sc.nextDouble();
				sc.nextLine();
				
				System.out.println("An operator want to use: +, -, *, or /. (Also accept the phrases plus, minus, times, divide)");
				operator = sc.nextLine();
				
				System.out.print("Rounding mode (y/n): ");
				roundingMode = sc.nextLine();
				
				if(operator.equals("+") || operator.equals("plus")) {
					
					result = firstNumber + secondNumber;
					
				} else if(operator.equals("-") || operator.equals("minus")) {
					
					result = firstNumber - secondNumber;
					
				} else if(operator.equals("*") || operator.equals("times")) {
					
					result = firstNumber * secondNumber;
					
				} else if(operator.equals("/") || operator.equals("plus")) {
					if(secondNumber == 0) System.out.println("Can not divide by zero");
					result = firstNumber / secondNumber;
					
				} else {
					System.out.println("Error input");
					System.exit(0);
				}
				
				if(roundingMode.equals("y")) {
					result = Math.round(result * 1000d) /1000d;
					System.out.printf("%f %s %f = %.3f", firstNumber, operator, secondNumber, result);
				} else if(roundingMode.equals("n")) {
					System.out.printf("%f %s %f = %f", firstNumber, operator, secondNumber, result);
				} else {
					System.out.println("Error input");
					System.exit(0);
				}
				
				
			} else if(modeUse.equals("compare")) {
				System.out.print("First number(use double type): ");
				firstNumber = sc.nextDouble();
				
				System.out.print("Second number(use double type): ");
				secondNumber = sc.nextDouble();
				sc.nextLine();
				
				System.out.println("A comparator: one of <, <=, >, >=, ==, !=");
				comparator = sc.nextLine();
				
				if(comparator.equals("<")) {
					resultTrueFalse = firstNumber < secondNumber;
					
				} else if(comparator.equals("<=")) {
					resultTrueFalse = firstNumber <= secondNumber;
					
				} else if(comparator.equals(">")) {
					resultTrueFalse = firstNumber > secondNumber;
					
				} else if(comparator.equals(">=")) {
					resultTrueFalse = firstNumber >= secondNumber;
					
				} else if(comparator.equals("==")) {
					resultTrueFalse = firstNumber == secondNumber;
					
				} else if(comparator.equals("!=")) {
					resultTrueFalse = firstNumber != secondNumber;
					
				} else {
					System.out.println("Error input");
					System.exit(0);
				}
				
				System.out.println(firstNumber + " " + comparator + " " + secondNumber + " is " + resultTrueFalse);
				
			}
			
		} else {
			System.out.println("Can not find the mode.");
		}
		
	}
	
}


