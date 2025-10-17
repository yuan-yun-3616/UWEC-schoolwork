/* Mingrui Liu
 * This program is to practice for loop in java,
 * include use for loop to solve problem and loop inside loop
 */
/* In the for loop, the condition is easily set wrong.
 * To debug it, try run each for loops after they done.
 * Remember, the number in java is starting at 0 instead of 1.
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ForLoops {
	
	public static List<Integer> sortNumbers(Scanner sc) {
			
			List<Integer> sortInteger = new ArrayList<>();
			
			System.out.println("Type two integer number");
			System.out.print("Number one: ");
			int a = sc.nextInt();
			System.out.print("Number two: ");
			int b = sc.nextInt();
			
			if(a <= b) {
				
				sortInteger.add(a);
				sortInteger.add(b);
				
			} else {
				
				sortInteger.add(b);
				sortInteger.add(a);
				
			}
			
			return sortInteger;
			
		}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Mode(A, B, C, D) chosen: ");
		String mode = sc.nextLine();
		
		if(mode.equals("A")) {rangeStats(sc);}
		if(mode.equals("B")) {controlledGrowth(sc);}
		if(mode.equals("C")) {primeInARange(sc);}
		if(mode.equals("D")) {textShapes(sc);}

	}
	
	static void rangeStats(Scanner sc) {
		
		List<Integer> integerList = sortNumbers(sc);
		
		int lo = integerList.get(0);
		int hi = integerList.get(1);
		
		//System.out.println("lo: " + lo);
		//System.out.println("hi: " + hi);
		
		if(1 > lo || hi > 10) {
			System.out.println("Number provided fall outside the range");
			return;
		}
			
		int sum = 0;
		int product = 1;
		int countEven = 0;
		int countOdd = 0;
		
		for(int i = lo; i <= hi; i++) {
			sum += i;
			product *= i;
		
			if(i % 2 == 0) {
				countEven++;
			} else {
				countOdd++;
			}
		}
		
		double arithmeticMean = (double)sum / (double)(countEven + countOdd);
		double geometricMean = (double)product / (double)(countEven + countOdd);
		
		System.out.println("Sum = " + sum);
		System.out.println("Numbers of even number: " + countEven);
		System.out.println("Numbers of odd number: " + countOdd);
		System.out.println("Arithmetic mean: " + arithmeticMean);
		System.out.println("Geometric mean: " + geometricMean);
		
	}
	
	static long controlledGrowth(Scanner sc) {
		
		long result = 1;
		
		System.out.print("Type an integer number between 1 to 10: ");
		int n = sc.nextInt();
		
		if(n < 1 || n > 10) {	// Cap n to 10 to prevent result becomes to large and makes an error
			
			System.out.println("The input is out of the range!");
			return result;
			
		}
		
		for(int i = n; i != 1; i--) {
			
			result *= i;
			System.out.println(result);
			
		}
		
		System.out.println("The result is: " + result);
		return result;
	}
	
	static void primeInARange(Scanner sc) {
		
		
		List<Integer> integerList = sortNumbers(sc);
		List<Integer> primeNumber = new ArrayList<>();
		
		int lo = integerList.get(0);
		int hi = integerList.get(1);
		
		for(int i = lo; i <= hi; i++) {
			boolean trueFalse = false;
			if(i > 1) {
				for(int d = 2; d * d <= i; d++) {
					for(int z = 2; z < i; z++) {
						trueFalse = (z * d == i);
						if(trueFalse) {break;}
					}
					if(trueFalse) {break;}
				}
				if(!trueFalse) {primeNumber.add(i);}
			}
		}
		System.out.println("Prime numbers in the given range: " + primeNumber);
	}
	
	static void textShapes(Scanner sc) {
		
		System.out.print("The rows: ");
		int rows = sc.nextInt();
		System.out.print("The columns: ");
		int cols = sc.nextInt();
		System.out.println();
		
		for(int i = 1; i <= rows; i++) {
			for(int d = 1; d <= cols; d++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1; i <= rows; i++) {
			for(int d = 1; d <= cols; d++) {
				if(i == 1 || i == rows || d == 1 || d == cols) {
					System.out.print("+");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1; i <= rows; i++) {
			for(int d = 1; d <= i; d++) {
				if(d == 1 || d == i || i == rows) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
		
}