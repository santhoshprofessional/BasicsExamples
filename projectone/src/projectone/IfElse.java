//create a package for projectone
package projectone;
//import the scanner class in util package
import java.util.Scanner;
/* @author  santhosh
 * @version 09-11-2023
 * @code    Java Program for simple if else statement example 
 * if the given number is equal to password statement 1 will be executed
 * otherwise else statement will be executed
 */
public class IfElse {
	//creating a main method
	public static void main(String[] args) {
	    //create scanner object
	    Scanner scc=new Scanner(System.in);  
	    //get the input from the user
		System.out.println("enter the number");
		int n=scc.nextInt();
		int password=123;
		if(n==password) {
			System.out.println("password is correct");
			System.out.println("successfully login");
		}
		else {
			System.out.println("password is incorrect");
			System.out.println("unsuccessful login");
		}
		/*Since n==password, 
		if part will be executed 
		otherwise else part will be executed*/

	}

}
