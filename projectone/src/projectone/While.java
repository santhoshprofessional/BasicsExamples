//create a package for projectone
package projectone;
// import Scanner class in util package
import java.util.Scanner;
/* @author  santhosh
 * @version 09-11-2023
 * @code    Java Program for while example to print n numbers
 */
public class While {
    // to create main method
	public static void main(String[] args) {
		//create scanner class with reference variable sc
		Scanner sc=new Scanner(System.in);
		//to get starting value from user
		System.out.println("enter starting value");
		int i=sc.nextInt();
		//to get ending value from user
		System.out.println("enter limit");
		int n=sc.nextInt();
		//performing while loop
		while(i<=n) {
			System.out.println("the numbers is"+i);
			i++;
		}
	}

}
