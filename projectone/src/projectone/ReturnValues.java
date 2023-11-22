package projectone;
/* @author  santhosh
 * @version 09-11-2023
 * @code    Java Program for return a value finally display the output
 */
public class ReturnValues {
	public int add(int a,int b) {
  	  int c=a+b;
  	  return c;
    }
    public int sub(int a,int b) {
  	  int c=a-b;
  	 return c;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnValues returnvalues = new ReturnValues();	
		System.out.println(returnvalues.add(10, 6)); 
		System.out.println(returnvalues.sub(10, 6)); 
	}

}
