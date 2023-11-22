//create a package for projectone
package projectone;

import java.util.Scanner;

/* @author  santhosh
 * @version 09-11-2023
 * @code    Java Program for ternary operator example to find the largest number
 */
public class Ternary {
	//creating a main method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  //create scanner object
		//get two inputs from the user
		System.out.println("enter two numbers");
		int num1 =sc.nextInt();
		int num2 =sc.nextInt();

		int max=(num1>num2) ? num1 : num2;
		/*Since num1>num2, 
		first number is performed
		Since num1<num2, 
		second number is performed*/
		System.out.println("largest number is:"+max);
	}

}
