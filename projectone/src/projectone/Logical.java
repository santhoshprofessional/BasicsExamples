//create a package for projectone
package projectone;
/* @author  santhosh
 * @version 09-11-2023
 * @code    Java Program for one of the logical operator logical& example
 */
public class Logical {
	//creating a main method
	public static void main(String[] args) {
		// initializing variable		
		int a=10,b=20,c=30;
		System.out.println("variable 1 = "+a);
		System.out.println("variable 2 = "+b);
		System.out.println("variable 3 = "+c);
		
		//using logical and to verify
		//three condition
		if((a>=b) && (a>=c)) {
			System.out.println("a is greater");
		}
		else if((b>=c)&&(b>=a)){
			System.out.println("b is greater");
		}
		else {
			System.out.println("c is greater");
		}

	}

}
