//create a package for projectone
package projectone;
/* @author  santhosh
 * @version 09-11-2023
 * @code    Java Program for one of the non - primitive data type String example
 *           reverse the string using for loop finally display the output
 */
public class RevString {
	//creating a main method
	public static void main(String[] args) {
		// creating a String
		String str= "pollachi";
		//create a empty string for purpose of storing the reverse string
		String rev="";
		//reverse the string using for loop
		//used in length()method purpose is it returns the no. of characters present in the string
		for(int i=str.length()-1;i>=0;i--) {
			//used in charAt()method purpose is it returns the character at specified index from the string
			rev=rev+str.charAt(i);
		}
		//display the output of reverse string
		System.out.println(rev);
	}

}
