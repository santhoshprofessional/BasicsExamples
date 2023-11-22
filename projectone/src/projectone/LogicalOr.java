//create a package for projectone
package projectone;
/* @author  santhosh
 * @version 09-11-2023
 * @code    Java Program for logical operators logical|| example
 */
public class LogicalOr {
	//creating a main method
	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<=n;i++) {
			
			if(i<n/2||i==n) {
				System.out.print("-"+" ");
			}
			else {
				System.out.print("*"+" ");
			}
		}

	}

}
