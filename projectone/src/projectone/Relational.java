package projectone;
import java.util.Scanner; //import the scanner class
/* @author  santhosh
 * @version 09-11-2023
 * @code    Java Program for Relational operator example 
 */
public class Relational {
//creating a main method
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);  //create scanner object
			//get two inputs from the user
			System.out.println("enter two numbers");
			int a=sc.nextInt();
			int b=sc.nextInt();
			//campare two values all possibles and returns boolean values
			System.out.println(a<b);
			System.out.println(a>b);
			System.out.println(a<=b);
			System.out.println(a>=b);
			System.out.println(a==b);
			System.out.println(a!=b);

	}

}
