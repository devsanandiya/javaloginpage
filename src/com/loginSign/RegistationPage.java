package com.loginSign;
import java.util.Scanner;
public class RegistationPage {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String Y;
		do {
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
		if(username!=null&&password!=null&&email!=null &&phone!=null&&confiPassword!=null) {
			System.out.println("Successfull in first check phase");
			if(email.contains("@")&&email.contains(".com")) {
				System.out.println("Email Successfull");
				if(phone.charAt(0)>6&&phone.charAt(0)<9) {
					System.out.println("Success Number");
					if(confiPassword==password) {
						System.out.println("All Step Done ");
						SingUp sig=new SingUp(username ,email,phone,password);
					}
					else {
						System.out.println("Error check id pass all");
					}
			
				}
				else {
					System.out.println("Check All Thing Phone Number Invalid");
				}
			}
			else {
				System.out.println("ERROR:check email invalid");
			}
		}
		else {
			System.out.println("Invalid input enetered");
		}
		System.out.println("Do You Want To Countinue?");
		Y=sc.nextLine();
		}while(Y.equalsIgnoreCase("y"));
	}
}
