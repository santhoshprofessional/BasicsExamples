package projectone;
//import the scanner class in util package
import java.util.Scanner;
/* @author  santhosh
 * @version 09-11-2023
 * @code    Java Program for nested if else statement example 
 * executed ATM machie
 */
public class IfNest {
	//creating a main method
		public static void main(String[] args) {
		    //create scanner object
		    Scanner scc=new Scanner(System.in);  
			int atmpin =1234;
			int balance=3000;
			//get the ATM pin from the user
			System.out.println("enter the ATM pin");
			int n=scc.nextInt();
			if(n==atmpin) {
				//get the amount from the user
				System.out.println("enter the Amount");
				int amount=scc.nextInt();
				if(amount<=balance) {
					System.out.println("transaction successful");
					System.out.println("available balance:"+(balance-amount));
				}
				else {
					System.out.println("insufficient balance");
				}
			}
			else {
				System.out.println("incorrect ATM pin");
			}
		

	}

}
