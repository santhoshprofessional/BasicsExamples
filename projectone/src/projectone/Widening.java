//create a package for projectone
package projectone;
/* @author  santhosh
 * @version 09-11-2023
 * @code    Java Program for one of the type casting is widening in explicitly example
 */
public class Widening {
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
		//to create a variable for all
		byte a=91;
		short b=69;
		int c=100;
		long d=2222;
		float e=12.344f;
		double f=22.2344;
		
		//widening explicitly and display the output
		double x=(double)c;
		System.out.println("integer to double is"+x);
		
		float z2=(float)c;
		System.out.println("integer  to float is"+z2);
		
		long l3=(long)c;
		System.out.println("integer  to long is"+l3);
		
		char ch=(char)b;
		System.out.println("short  to character is"+ch);
		
		int y1=(int)b;
		System.out.println("short  to integer is"+y1);
		
		long l4=(long)b;
		System.out.println("short  to integer is"+l4);
		
		float z3=(float)b;
		System.out.println("short  to float is"+z3);
		
		double x2=(double)b;
		System.out.println("short  to float is"+x2);
		
		int y=(int)'a';
		System.out.println("character  to integer is"+y);
		
		float z=(float)'A';
		System.out.println("character  to float is"+z);
		
		long l1=(long)'a';
		System.out.println("character  to long is"+l1);
		
		double zz=(double)'A';
		System.out.println("character  to double is"+zz);
		
		int yy=(int)a;
		System.out.println("byte  to integer is"+yy);
		
		short ss=(short)a;
		System.out.println("byte  to short is"+ss);
		
		long l2=(long)a;
		System.out.println("byte  to long is"+l2);
		
		float z1=(float)a;
		System.out.println("byte  to float is"+z1);
		
		double x1=(double)a;
		System.out.println("byte  to double is"+x1);
	}

}
