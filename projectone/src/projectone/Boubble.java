package projectone;// package creation

import java.util.Scanner; //import the Scanner class
/* @author  santhosh
 * @version 09-11-2023
 * @code    Java Program for bubble short
 */
public class Boubble {
    //create a main method
	public static void main(String[] args) {
		int i;
		int[] arr = new int[5];
		//initialize size is 5 ang get array from user
		Scanner sc=new Scanner(System.in);
		for(i=0;i<arr.length;i++) {
			System.out.println("enter the number");
			arr[i]=sc.nextInt();
			
		}
		System.out.println("before shorting");
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
		for(int i1=0;i1<arr.length;i1++) {
			for(int j=i1+1;j<arr.length;j++) {
				if(arr[i1]>arr[j]) {
					int t=arr[i1];
					arr[i1]=arr[j];
					arr[j]=t;
				}
			}
		}
		System.out.println("after shorting");
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
		
	}

}
