//create a package for projectone
package projectone;

import java.util.Scanner; //import the scanner class in the util package
/* @author  santhosh
 * @version 09-11-2023
 * @code    Java Program for one of the non - primitive data type array example
 *           with get from user non primitive data type in for loop finally display the output
 */
public class GetArray {
	//creating a main method
	public static void main(String[] args) {
		int i;
		//create an array with size 5
		int[] arr = new int[5];
		//create scanner object with reference variable sc
		Scanner sc=new Scanner(System.in);
		//get from user non primitive data type in for loop
		for(i=1;i<arr.length;i++) {
			System.out.println("enter the number");
			arr[i]=sc.nextInt();
			
		}
		//display the output one by one using for loop
		for(int j=1;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
	}

}
