//create a package for projectone
package projectone;

import java.util.Scanner; //import the scanner class
/* @author  santhosh
 * @version 09-11-2023
 * @code    Java Program for switch example to find workingday or holiday
 */
public class SwitchLoop {
	
	//creating a main method
	public static void main(String[] args) {
		    //create scanner object
			Scanner sc=new Scanner(System.in);  //create scanner object
			System.out.println("1.sunday 2.monday 3.tuesday 4.wednesday 5.thursday 6.friday 7.saturday");
			System.out.println("enter your choice");  
			//using switch case
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("the day is sunday that is holiday");
				break;
			case 2:
				System.out.println("the day is monday that is workingday");
				break;
			case 3:
				System.out.println("the day is tuesday that is workingday");
				break;
			case 4:
				System.out.println("the day is wednesday that is workingday");
				break;
			case 5:
				System.out.println("the day is thursday that is workingday");
				break;
			case 6:
				System.out.println("the day is fridayday that is workingday");
				break;
			case 7:
				System.out.println("the day is saturday that is holiday");
				break;
			default:
				System.out.println("invalid choice");
			}

		
	}
}
