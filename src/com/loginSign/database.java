package com.loginSign;

import java.util.ArrayList;
import java.util.List;

public class database {
	
	List<User> users=new ArrayList<>();
     
	public void  adduser(User user) {
         users.add(user);
         System.out.println("user added sucessfully");
 	}
	
	public boolean validuser(String username) {
		for(User u :users) {
			if(u.getusername().equals(username)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean validpassword(String password) {
		for (User u : users) {
			if(u.getPassword().equals(password)) {
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
