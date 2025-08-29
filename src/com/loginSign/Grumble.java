package com.loginSign;
import java.util.*;

public class Grumble {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		database db=new database();
			SingUp signup=new SingUp(db);
			Login login=new  Login(db);
	
			
			
			while(true) {
				System.out.println("login page--");
			System.out.println("enter ur username:");
			String suName=sc.nextLine();
			System.out.println("enter your password:");
			String password=sc.nextLine();
			
			login.Login(suName, password);
			
		     System.out.println("signup page---");
		     System.out.println("username:");
		     String newusername=sc.nextLine();
		     System.out.println("password:");
		     String newpassword=sc.nextLine();
		     System.out.println("phonenumber:");
		     String newphonenum=sc.nextLine();
		     System.out.println("email:");
		     String newemailString=sc.nextLine();
		     
		     signup.SingUp(newusername, newemailString, newphonenum, newpassword);
		     continue;
			}
			

		    
			} 
	}

	


