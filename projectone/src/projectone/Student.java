//creating a package for projectone
package projectone;

/* @author  santhosh
 * @version 09-11-2023
 * @code    Java Program for class example with creating data member and object finally display the output
 */

class Student {
	// creating a data member 
	int id =1;
	String name="santhosh";

	//creating a main method
	public static void main(String args[])
	{
		/* creating an object of
		 Student class */
		
		Student s1 = new Student();
		
		//print the output
		System.out.println(s1.id);
		System.out.println(s1.name);
	}
}
