//create a package for projectone
package projectone;
//import the scanner class in the util package
import java.util.Scanner; 
/* @author  santhosh
 * @version 09-11-2023
 * @code    Java Program for one of the type casting is narrowing in explicitly example
 */
public class Type {
	//creating a main method
	public static void main(String[] args) {
		//create scanner object with reference variable sc
		Scanner sc=new Scanner(System.in);
//		byte---1byte
//		short--2byte
//		int----4byte
//		long---8byte
//		float--4byte
//		double-8byte
//		char---2byte
//		boolean-1bit
		
		//narrowing explicitly
		
		System.out.println("enter the double vale");
		double d=sc.nextDouble();                               //get double value from user
		
		System.out.println("enter the float vale");
		float ff=sc.nextFloat();                                //get float value from user
		
		System.out.println("enter the integer vale");
		int num=sc.nextInt();                                   //get integer value from user
		
		System.out.println("enter the long vale");
		long ll=sc.nextLong();                                  //get long value from user
		
		System.out.println("enter the short vale");
		short ssss=sc.nextShort();                                  //get short value from user
		
		char chh='a';
		
		// converting and display
		
		int a=(int)d;                                           //convert double to integer
		System.out.println("convert double to integer is"+a);
		
		int x=(int)ff;                                          //convert float to integer
		System.out.println("convert float to integer is"+x);
		
		int y=(int)ll;                                          //convert long to integer
		System.out.println("convert long to integer is"+y);
		
		char ca=(char)ff;                                       //convert float to character
		System.out.println("convert float to character is"+ca);
		
		char cd=(char)d;                                          //convert double to character
		System.out.println("convert double to character is"+cd);
		
		char cb=(char)num;                                     //convert integer to character
		System.out.println("convert integer to character is"+cb);

		char cc=(char)ll;                                          //convert long to character
		System.out.println("convert long to character is"+cc);
		
		short sa=(short)ff;                                     //convert float to short
		System.out.println("convert float to short is"+sa);
		
		short sb=(short)d;                                     //convert double to short
		System.out.println("convert double to short is"+sb);
		
		short scc=(short)num;                                     //convert integer to short
		System.out.println("convert integer to short is"+scc);
		
		short sd=(short)ll;                                     //convert long to short
		System.out.println("convert long to short is"+sd);
		
		byte ba=(byte)chh;                                      //convert character to byte
		System.out.println("convert character to byte is"+ba);
		
		byte bb=(byte)ff;                                      //convert float to byte
		System.out.println("convert float to byte is"+bb);
		
		byte bc=(byte)d;                                      //convert double to byte
		System.out.println("convert double to byte is"+bc);
		
		byte bd=(byte)ll;                                      //convert long to byte
		System.out.println("convert long to byte is"+bd);
		
		byte be=(byte)num;                                      //convert integer to byte
		System.out.println("convert integer to byte is"+be);
		
		byte bf=(byte)ssss;                                      //convert short to byte
		System.out.println("convert short to byte is"+bf);
	}

}
