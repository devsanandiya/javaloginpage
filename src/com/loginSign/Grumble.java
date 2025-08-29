package com.loginSign;
import java.util.*;

public class Grumble {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		database db=new database();
			SingUp signup=new SingUp(db);
			Login login=new  Login(db);
	
			System.out.println("Login");
			System.out.println("signup");
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			
			
			switch(choice) {
			
			case 1:
			System.out.println("enter ur username:");
			String suName=sc.nextLine();
			System.out.println("enter your password:");
			String password=sc.nextLine();
			
			login.Login(suName, password);
			
			case 2:
				System.out.println
				
		     
			

		    
			} 
	}
}
	


