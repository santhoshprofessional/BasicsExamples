//create a package for projectone
package projectone;
/* @author  santhosh
 * @version 09-11-2023
 * @code    Java Program for one of the type casting is widening in implicitly example
 */
public class WidImplicit {
	//creating a main method
	public static void main(String[] args) {
//		byte---1byte
//		short--2byte
//		int----4byte
//		long---8byte
//		float--4byte
//		double-8byte
//		char---2byte
//		boolean-1bit
		//widening implicitly and display the output
		double a=123;
		System.out.println("int,byte,short to double is"+a);
		
		double b='A';
		System.out.println("character to double is"+b);
		
		float c='a';
		System.out.println("character to float is"+c);
		
		int d='b';
		System.out.println("character to int is"+d);
	}

}
