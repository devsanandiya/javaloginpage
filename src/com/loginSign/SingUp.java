package com.loginSign;

public class SingUp {
	
	private database db=new database();
	
	public SingUp() 
	{
		System.out.println("invalid inputted");
	}
	public SingUp (String username,String email,String phone,String password) {
		User newUser=new User(username,password,phone,email);
		System.out.println("signuppage");
		db.adduser(newUser);
	      
	      
	}

}

