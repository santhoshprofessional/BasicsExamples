package com.pirai.jarcall;

import java.util.Scanner;
import com.pirai.jarr.*;
public class MainDriver {

	public static void main(String[] args) {
		 //create scanner object
		Scanner sc=new Scanner(System.in); 
		LogIn login=new LogIn();
		login.display();
		System.out.println("wellcome to our library");
		System.out.println("1.Education 2.Biography 3.Sports");
		System.out.println("enter your category");
		int choice=sc.nextInt();
		switch(choice) {
		case 1: 
			System.out.println("wellcome to Education Category");
			System.out.println("1.engineering books 2.medical books 3.commerce books ");
			int a=sc.nextInt();
			Education edu=new Education();
		       edu.disp(a);
		       break;
		case 2: 
			System.out.println("wellcome to Biography Category");
			System.out.println("1.Dhoni biography book 2.sachin tendulkar biograpy book 3.modi biography book");
			int b=sc.nextInt();
			Biography ed=new Biography();
		       ed.disp(b);
		       break;
		case 3: 
			System.out.println("wellcome to Sports Category");
			System.out.println("1.cricket books 2.football books 3.tennis books");
			int c=sc.nextInt();
			Sports e=new Sports();
		       e.disp(c);
		       break;
		
		default :System.out.println("invalid");
		}
	LogOut logout=new LogOut();
    logout.displayy();
	}

}
