package projectone;
/* @author  santhosh
 * @version 09-11-2023
 * @code    Java Program for call by method without using static keyword finally display the output
 */
public class CallByMethod1 {
	public void Print() {
		System.out.println("Print method is printed");
	}
	public static void main(String[] args) {

		CallByMethod1 callbymethod = new CallByMethod1();
		callbymethod.Print();
	}

}
