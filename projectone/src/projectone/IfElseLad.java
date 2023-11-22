//create a package for projectone
package projectone;
//import the scanner class in util package
import java.util.Scanner;
/* @author  santhosh
 * @version 09-11-2023
 * @code    Java Program for else if ladder example to find the number is positive or negative
 */
public class IfElseLad {
	//creating a main method
	public static void main(String[] args) {
		//create scanner object
		Scanner sc=new Scanner(System.in);  
		//get the input from the user
		System.out.println("enter the number");
        int n=sc.nextInt();
        if(n>0) {
        	System.out.println("number is positive");
        }else if(n==0) {
        	System.out.println("number is zero");
        }else {
        	System.out.println("number is negative");
        }
        /*Since n>0, 
		if part will be executed
		Since n==0, 
		else if part will be executed
		otherwise else part will be executed */
	}

}
