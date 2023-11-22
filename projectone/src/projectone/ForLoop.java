//create a package for projectone
package projectone;
/* @author  santhosh
 * @version 09-11-2023
 * @code    Java Program for loop example 
 * to each iteration is happen it will call sum method
 * every time it called added one and gives output
 */
public class ForLoop {
	int s=0;
	// sum method creating
    public void sum() {
    	s=s+1;
    	System.out.println("the sum is"+s);
    }
	public static void main(String[] args) {
		ForLoop obj=new ForLoop();
		//each iteration is happen it will call sum method
		for(int i=0;i<5;i++) {
			obj.sum();
		}

	}

}
