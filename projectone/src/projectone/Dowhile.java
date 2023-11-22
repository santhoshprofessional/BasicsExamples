//creating a package for projectone
package projectone;

/* @author  santhosh
 * @version 09-11-2023
 * @code    Java Program for Do-while Loop example sum of given numbers
 */
public class Dowhile {
	// Main driver method
	public static void main(String args[]){
	// Declaring and initializing integer values
		int x = 21, sum = 0;

		// Do-while loop
		do {
		// Execution statements(Body of loop) 
				sum += x;
				x--;
		}while (x > 10);   // Now checking condition

			// output display 
			System.out.println("Summation: " + sum);
		}
	

}
