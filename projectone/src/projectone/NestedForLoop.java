//create a package for projectone
package projectone;
/* @author  santhosh
 * @version 10-11-2023
 * @code    Java Program for nested for loop finally display the output
 */
public class NestedForLoop {

	public static void main(String[] args) {
		// attribute declaration
		int n=5;
		//using for loops for condition is not beyond
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				//j==0 || i== n-1 || i==j al these condition if true if statement is execute otherwise else statement is executed
				if(j==0 || i== n-1 || i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" "+ "");
				}
			}
			System.out.println();
		}

	}

}
