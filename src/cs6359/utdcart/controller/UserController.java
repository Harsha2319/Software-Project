package cs6359.utdcart.controller;

import java.util.Random;

import cs6359.utdcart.dao.impl.DBMgrImpl;
import cs6359.utdcart.dao.impl.GetAvailableDriver;
import cs6359.utdcart.dao.impl.GetUser;
import cs6359.utdcart.dao.impl.SaveUser;
import cs6359.utdcart.entity.User;
import cs6359.utdcart.entity.impl.Customer;
import cs6359.utdcart.entity.impl.Driver;

public class UserController {
	private String userType;
	private Customer customer;
	private Driver driver;
	private SaveUser cmd;
	private GetUser get;
	private User user;
	public UserController() {
		
	}

	
	public int register(String username, String password, String firstName, String lastName, String email,
			String userType) throws Exception {
		
		
		this.userType = userType;
		System.out.println(this.userType);

		if (this.userType.equals("Customer")) {
			System.out.println("inside");
			this.customer = new Customer(username, password, firstName, lastName, email);
			//DBMgrImpl cmd = new SaveUser(this.customer);
			//this.customer = (Customer) cmd.execute();
			 cmd = new SaveUser(this.customer);
			 cmd.execute();
		} else if (this.userType.equals("Driver")) {
			this.driver = new Driver(username, password, firstName, lastName, email);
			cmd = new SaveUser(this.driver);
			cmd.execute();
		}
		return -1;
	}
	
	public int login(String username, String password) throws Exception {
		
		get = new GetUser(username);
		user = (User) get.execute();
		System.out.println("Username : "+user.getuID());
		System.out.println("Correct Password : "+user.getPassword());
		System.out.println("Entered Password : "+password);
		
        if (password.equals(user.getPassword())) {
        	if(user.getUserType().equals("customer")){return 0;}
        	else if(user.getUserType().equals("driver")){return 1;}
        	else { 
        		System.out.println("Incorrect user type");
        		return -1;}
        } else {
        	System.out.println("Incorrect password");
        	return -1;
        }
	}

	public int logout(int id) {
		return -1;
	}

}
