package com.loginSign;

import java.util.ArrayList;
import java.util.List;

public class database {
	
	List<User> users=new ArrayList<>();
     
	public void  adduser(User user) {
         users.add(user);
         System.out.println("user added sucessfully"+user.getusername());
 	}
	
	public boolean validuser(String username ,String password) {
		System.out.println("Check point");
		for(User u :users) {
			if(u.getusername().equals(username)&&u.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	
	
	public boolean validphonenumber(String phonenumber) {
		for(User u :users) {
			if(u.getphonenumber().equals(phonenumber)) {
				return true;
			}
		}
		return false; 
	}
	
	public boolean validemail(String email) {
		for(User u : users) {
			if(u.getemail().equals(email)) {
				return true;
			}
		}
		return false;
	}
}
