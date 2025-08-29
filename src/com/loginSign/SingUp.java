package com.loginSign;

public class SingUp {
	
	private database db=new database();
	
	public SingUp(database db) {
		this.db=db;
		
	}
	
	
	public void SingUp (String username,String email,String phone,String password) {
		User newUser=new User(username,password,phone,email);
		db.adduser(newUser);
	      
	      
	}

}

