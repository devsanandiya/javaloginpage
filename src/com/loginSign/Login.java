package com.loginSign;

public class Login {
	database db=new database();
		String username;
		String password;
			
			public Login(String username,String password) {
				this.username=username;
				this.password=password;
				if(db.validuser(username, password)) {
					System.out.println("Login successfully");
					
				}else {
					System.out.println("invalid username");
				}
			}
			public Login() {
				
			}
			
			
			
}
