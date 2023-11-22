package projectone;
/* @author  santhosh
 * @version 09-11-2023
 * @code    Java Program for pass by values as a arguments in method finally display the output
 */
public class PassByValue {
      public void add(int a,int b) {
    	  int c=a+b;
    	  System.out.println("addition is"+c);
      }
      public void sub(int a,int b) {
    	  int c=a-b;
    	  System.out.println("subtraction is"+c);
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassByValue passbyvalue = new PassByValue();
		passbyvalue.add(10, 10);
		passbyvalue.sub(10, 5);
	}

}
