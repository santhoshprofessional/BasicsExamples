//create a package for projectone
package projectone;
/* @author  santhosh
 * @version 09-11-2023
 * @code    Java Program for unary operator example
 */
public class Unary {
	//creating a main method
	public static void main(String[] args) {
		//to create two number as a input one is number is limit another one is increament or decrement number
		int n=5,a=1;
		for(int i=0;i<n;i++) {
			System.out.println(a+" ");// to print the numbers
			if(i<n/2) {
				a++;     // increament operation done
			}
			else {
				a--;     // decreament operation done
			}
		}
	}
	
}
