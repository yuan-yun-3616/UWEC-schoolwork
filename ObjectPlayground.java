/* Name: Mingrui Liu
 * Description: This program is going to help me understand primitive, object, and else in java.
 */
/* The variables scope prevent the naming conflicts
 * In primativeVsObjectExamplesInActio method, have variables a and b(String)
 * In precedenceExample method, also have variables a and b(double)
 * If do not have the variables scope, it will get a duplicate error
 */

import java.util.Scanner;

public class ObjectPlayground {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		primativeVsObjectExamples();
		primativeVsObjectExamplesInAction();
		scopeDemo();
		precedenceExample(sc);
		
	}
	
	public static void primativeVsObjectExamples() {
		/* primitive variables store the value directly in the memory(for local variables store in the steak)
		 * object variables store the references(point to the actual objects), the actual objects are store in the heap memory
		 */
		
		int x = 5;
		String myText = "Hello";
		
		System.out.println("Primitive example : x = " + x );
		System.out.println("Objects are stored as references : myText = \"" + myText + "\"" );
		
	}
	
	public static void primativeVsObjectExamplesInAction() {
		/* Compare primitive variables are comparing the actual value stored in memory
		 * Compare object variables are comparing the references which are not actual object in memory
		 */
		
		String a = new String("Hi");
		String b = new String("Hi");
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
	}
	
	public static void scopeDemo() {
		/* Variable scope is used to manage memory to optimize resource usage and prevents unnecessary memory consumption
		 * Help code to be readable and debug, prevents naming conflicts and errors
		 */
		
		int count = 799;
		System.out.println("count = " + count);
		
		if(count > 325) {
			int inner = 2029;
			
			System.out.println("inner = " + inner);
			System.out.println("count = " + count);
			
		}
		//System.out.println("inner = " + inner);	// inner cannot be resolved to a variable outside the if
	}
	
	public static void precedenceExample(Scanner sc) {
		/* First: If there are brackets, calculate the inside first
		 * Second: If there have times/divide, calculate them first
		 * Third: Calculate from left to right for the rest
		 */
		
		System.out.print("a = ");
		double a = sc.nextDouble();
		System.out.print("b = ");
		double b = sc.nextDouble();
		System.out.print("c = ");
		double c = sc.nextDouble();
		
		System.out.println(a + b * c);
		System.out.println((a + b) * c);
		System.out.println(a / b + c);
		System.out.println(a / (b + c));
		
	}
	
}


