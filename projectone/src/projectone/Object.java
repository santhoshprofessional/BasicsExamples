//creating a package for projectone
package projectone;

/* @author  santhosh
 * @version 09-11-2023
 * @code    Java Program for object example with creating data member and member function finally display the output
 */
public class Object {
	// creating a data member 
	      String s="lap";
		  int age = 5;
		  String s1="white";
		// creating a member function 	  
          public void bark() {
        	  System.out.println("tommy is now bark");
          }         
          public void eat() {
        	  System.out.println("tommy is now eat");
          }
          public void sleep() {
        	  System.out.println("tommy is now sleep");
          }
        //creating a main method
		  public static void main(String[] args) {
			  /* creating an object of
				 Object class with named tommy */
			  Object tommy = new Object();
			  // display the output of tommy object data member and member function
		    System.out.println(tommy.s);
		    System.out.println(tommy.age);
		    System.out.println(tommy.s1);
		    tommy.bark();
		    tommy.eat();
		    tommy.sleep();
		    
		  }
		

}
