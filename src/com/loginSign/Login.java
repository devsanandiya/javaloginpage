package com.loginSign;

public class Login {
	database db=new database();
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
				if(db.validuser(username, password)) {
					System.out.println("Login successfully");
					
				}else {
					System.out.println("invalid user");
				}
			}
			
			
			
}
