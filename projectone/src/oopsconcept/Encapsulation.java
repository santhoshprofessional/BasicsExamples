package oopsconcept;
/* @author  santhosh
 * @version 09-11-2023
 * @code    Java Program for Encapsulation 
 */
public class Encapsulation {
	//Member Function
	public void Print() {
		//Data member
		int a=10;
		System.out.println("Data member is"+a);
		System.out.println("Member Function is Print Method");
		System.out.println("Class is encapsulated Data member and Member Function");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation encapsulation = new Encapsulation();
		encapsulation.Print();
	}

}
