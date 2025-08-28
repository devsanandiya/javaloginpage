package com.loginSign;

public class user {
	
	private String username;
	private String Password;
	private String phonenumber;
	private String email;
	
	public user(String username,String Password,String phonenumber,String email) {
		
		this.username=username;
		this.Password=Password;
		this.phonenumber=phonenumber;
		this.email=email;
	}
	public String getusername() {
		return username;
	}
	
	public String getPassword() {
		return Password;
	}
	
	public String getphonenumber() {
		return phonenumber;
	}
	
	public String getemail() {
		return email;
	}      

}
