//create a package for projectone
package projectone;
//import the scanner class in util package
import java.util.Scanner;
/* @author  santhosh
 * @version 09-11-2023
 * @code    Java Program for simple if statement example 
 * if the given number is lessthen 15 if statement will be executed
 */
public class IfClass {
	//creating a main method
	public static void main(String[] args) {
		      //create scanner object
		      Scanner scc=new Scanner(System.in);  
		    //get the input from the user
	       	  System.out.println("enter the number");
	       	  int n=scc.nextInt();
			  if (n < 15)
					System.out.println("10 is less than 15");

			  System.out.println("Outside if-block");
			  // both statements will be printed
			
			  /*Since n<15, 
				first operation is performed
				else outside the loop*/

	}

}
