 //create a package for projectone
package projectone;

import java.util.Scanner; //import the scanner class in the util package

/* @author  santhosh
 * @version 09-11-2023
 * @code    Java Program for primitive data type example with get from user data type finally display the output
 */
public class Primitive { 
	//creating a main method
	public static void main(String[] args) {
		//create scanner object with reference variable sc
		Scanner sc=new Scanner(System.in);  
		
		//getting the datas from user
		System.out.println("enter the byte");
     	byte a=sc.nextByte();
     	
     	System.out.println("enter the short");
		short b =sc.nextShort();
		
		System.out.println("enter the integer");
		int c =sc.nextInt();
		
		System.out.println("enter the long");
		long d =sc.nextLong();	
		
		System.out.println("enter the float");
		float f =sc.nextFloat();
		
		System.out.println("enter the double");
		double g=sc.nextDouble();
		
		System.out.println("enter the boolean");
		boolean h =sc.nextBoolean();
		
      
		//display the output one by one
  		System.out.println("byte is:"+a);
		System.out.println("short is:"+b);
		System.out.println("integer is:"+c);
		System.out.println("long is:"+d);	
		System.out.println("float is:"+f);
		System.out.println("double is:"+g);
		System.out.println("boolean is:"+h);
		
	}

}
