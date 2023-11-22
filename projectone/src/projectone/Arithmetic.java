//create a package for projectone
package projectone;

import java.util.Scanner; //import the scanner class
/* @author  santhosh
 * @version 09-11-2023
 * @code    Java Program for arithmetic operator example with using switch case
 */
public class Arithmetic {
	//creating a main method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  //create scanner object
		//get two inputs from the user
		System.out.println("enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		//to give input as 12345 1 is additon 2 is subtraction 3 is multiplication 4 is division 5 is modulus
		System.out.println("1.add 2.sub 3.mul 4.div 5.mod");
		System.out.println("enter your choice");  //get input
		
		//using switch case
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a%b);
			break;
		case 5:
			System.out.println(a/b);
			break;
		default:
			System.out.println("invalid choice");
		}

	}

}
