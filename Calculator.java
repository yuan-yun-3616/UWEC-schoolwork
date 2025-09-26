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
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Choose a mode either 'calc' or 'compare' (all lowercase, no whitespace, same for whole program): ");	// To get which mode user want to use
		modeUse = sc.nextLine();
		
		if(modeUse.equals("calc") || modeUse.equals("compare")) {
			if(modeUse.equals("calc")) {
				System.out.print("First number(use double type): ");
				firstNumber = sc.nextDouble();	// get the number before the operator
				
				System.out.print("Second number(use double type): ");
				secondNumber = sc.nextDouble();	// get the number after the operator
				sc.nextLine();
				
				System.out.println("An operator want to use: +, -, *, or /. (Also accept the phrases plus, minus, times, divide)");
				operator = sc.nextLine();	// get the operator
				
				System.out.print("Rounding mode (y/n): ");
				roundingMode = sc.nextLine();	// figure out whether user want to rounding the value
				
				result = calculateMode(firstNumber, secondNumber, operator);	// calculate the value by the numbers given
				
				roundingMethod(roundingMode, result, firstNumber, secondNumber, operator);	// rounding or not the value is decided by roundingMode
				
			} else if(modeUse.equals("compare")) {
				System.out.print("First number(use double type): ");
				firstNumber = sc.nextDouble();	// get the number before the comparator
				
				System.out.print("Second number(use double type): ");
				secondNumber = sc.nextDouble();	// get the number after the comparator
				sc.nextLine();
				
				System.out.println("A comparator: one of <, <=, >, >=, ==, !=");
				comparator = sc.nextLine();	// get the comparator
				
				compareMode(firstNumber, secondNumber, comparator);	// compare two numbers that given
				
			}
			
		} else {
			System.out.println("Can not find the mode.");
		}
		
	}
	
	private static double calculateMode(double num1, double num2, String operator) {
		
		double value = 0;	// if do not initial first, will get an error at return part #90
		
		if(operator.equals("+") || operator.equals("plus")) {	// find the correct method to calculate two numbers
			
			value = num1 + num2;
			
		} else if(operator.equals("-") || operator.equals("minus")) {
			
			value = num1 - num2;
			
		} else if(operator.equals("*") || operator.equals("times")) {
			
			value = num1 * num2;
			
		} else if(operator.equals("/") || operator.equals("plus")) {
			if(num2 == 0) System.out.println("Can not divide by zero");
			value = num1 / num2;
			
		} else {
			System.out.println("Error input");
			System.exit(0);
		}
		
		return value;
		
	}
	
	private static void roundingMethod(String round, double value, double num1, double num2, String operator) {
		
		if(round.equals("y")) {	//round and give the final result
			value = Math.round(value * 1000d) /1000d;
			System.out.printf("%f %s %f = %.3f", num1, operator, num2, value);
		} else if(round.equals("n")) {
			System.out.printf("%f %s %f = %f", num1, operator, num2, value);
		} else {
			System.out.println("Error input");
			System.exit(0);	// stop the program
		}
		
	}
	
	private static void compareMode(double num1, double num2, String comparator) {
		
		Boolean resultTrueFalse = true;	// if do not initial first, will get an error at System.out.println part #135
		
		if(comparator.equals("<")) {	// find the correct method to compare two numbers
			resultTrueFalse = num1 < num2;
			
		} else if(comparator.equals("<=")) {
			resultTrueFalse = num1 <= num2;
			
		} else if(comparator.equals(">")) {
			resultTrueFalse = num1 > num2;
			
		} else if(comparator.equals(">=")) {
			resultTrueFalse = num1 >= num2;
			
		} else if(comparator.equals("==")) {
			resultTrueFalse = num1 == num2;
			
		} else if(comparator.equals("!=")) {
			resultTrueFalse = num1 != num2;
			
		} else {
			System.out.println("Error input");
			System.exit(0);
		}
		
		System.out.println(num1 + " " + comparator + " " + num2 + " is " + resultTrueFalse);	//give the final result
		
	}
	
}

/* for calculateMode and compareMode, if don't initial the variable at the beginning,
 * the last line with the variable will turn to an error, the Boolean type I can understand, but the double type really don't know.
 * for the multiple method, I found "void" and "return" against each other, and void, integer, double, ... can only have one at the very top of the method,
 * compare to my memory, this also difference between public and private method.
 */


