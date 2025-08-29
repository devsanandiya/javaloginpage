package com.loginSign;
import java.util.Scanner;
public class RegistationPage {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Username");
			String username=sc.nextLine();
		System.out.println("Enter Your Email");
			String email=sc.nextLine();
		System.out.println("Enter Your Phone Number");
			String phone=sc.nextLine();
		System.out.println("Enter Your Password");
		    String password=sc.nextLine();
		System.out.println("Enter Your Confirm Password");
		    String confiPassword=sc.nextLine();
		if(username!=null&&password!=null&&email!=null &&phone==null&&confiPassword!=null) {
			System.out.println("Successfull in first check phase");
			if(email.contains("@")&&email.contains(".com")) {
				System.out.println("Email Successfull");
				if(phone.charAt(0)>6&&phone.charAt(0)<9) {
					System.out.println("Success Number");{
						if(confiPassword==password)
						{
								SingUp s=new SingUp(username,email,phone,password);
						}					
					}
				
			}
		}
	}
	}
}
class SingUp {
		public SingUp() 
			{
				System.out.println("invalid inputted");
			}
			public SingUp (String username,String email,String phone,String password) 
			{
				System.out.println("SuccessFully");
			}
		
}