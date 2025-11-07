/**
 * This the a homework about recursion in Java
 * 
 * @author Mingrui Liu
 */

public class RecursiveShapes {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkerBoard(3, 9, 9);
		System.out.println();
		evenNumber(10);
		System.out.println();
		System.out.println();
		isoscelesTriangle(9);
		
	}
	
	/**
	 * Draw a checker board
	 * 
	 * @param squ The size of cube for checker board
	 * @param row The long of checker board
	 * @param col The height of checker board
	 */
	public static void checkerBoard(int squ, int row, int col) {
		if(row == 0) return;
		checkerBoard(squ, row-1, col);	// Start draw the board from first row
		checkerBoardSec(squ, row, col);
		System.out.println();
	}
	
	public static void checkerBoardSec(int squ, int row, int col) {
		if(col == 0) return;
		checkerBoardSec(squ, row, col-1);	// Start draw from first column for each row
		if((row-1) / squ % 2 == (col-1) / squ % 2) {	// Different part of the board
			System.out.print("0");
		} else {
			System.out.print(" ");
		}
	}
	
	/**
	 * Draw an equal side length triangle
	 * 
	 * @param side The side length of the triangle
	 */
	public static void isoscelesTriangle(int side) {
		if(side == 0) return;
		isoscelesTriangleSec(side);
		System.out.println();
		isoscelesTriangle(side-1);	// Draw the triangle by floors 
	}
	
	public static void isoscelesTriangleSec(int side) {
		if(side == 0) return;
		System.out.print("*");
		isoscelesTriangleSec(side-1);
	}
	
	/**
	 * List the even number under the range
	 * 
	 * @param num The range of the number
	 */
	public static void evenNumber(int num) {
		if(num == 0) return;
		evenNumber(num-1);
		if(num % 2 == 0) {
			System.out.print(num + ",");
		}
	}
}
