package com.loginSign;

public class Login {
		String username;
		String password;
			public Login(){
				System.out.println("Invalid input");
			}
			public Login(String username) {
				System.out.println("Password Must Be Required");
			}
			public Login(String username,String password) {
				this.username=username;
				this.password=password;
			}
			
			
			
}
