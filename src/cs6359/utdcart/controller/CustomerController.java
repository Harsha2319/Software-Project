package cs6359.utdcart.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

import cs6359.utdcart.dao.impl.CustomerHistory;
import cs6359.utdcart.dao.impl.DBMgrImpl;
import cs6359.utdcart.dao.impl.DriverHistory;
import cs6359.utdcart.dao.impl.GetAvailableDriver;
import cs6359.utdcart.dao.impl.GetUser;
import cs6359.utdcart.dao.impl.SavePaymentMethod;
import cs6359.utdcart.dao.impl.SaveRide;
import cs6359.utdcart.entity.User;
//import cs6359.utdcart.entity.Gui;
import cs6359.utdcart.entity.impl.Customer;
import cs6359.utdcart.entity.impl.Driver;
import cs6359.utdcart.entity.impl.PaymentMethod;
import cs6359.utdcart.entity.impl.Ride;
import cs6359.utdcart.entity.impl.History;

public class CustomerController {

	// THE LOGIC NEED TO BE FIXED

	private Customer customer;
	private DBMgrImpl db = null;
	private Driver driver;
	private Ride ride;
	private String src;
	private String dst;
	private long cardNo;
	private int cvv;
	private String c_id;
	private LocalDate expDate;
	private ArrayList<History> customerList;
	
	

	public CustomerController() {

	}

	public int SearchRide(String src, String dst) throws Exception {
		this.src = src;
		this.dst = dst;
		System.out.println("searchride");

		DBMgrImpl cmd = new GetAvailableDriver(driver);
		this.driver = (Driver) cmd.execute();
		System.out.println("driver id : "+this.driver.getuID());
		
		cmd = new GetUser("Harsha");
		this.customer = (Customer) cmd.execute();
		System.out.println("customer id : "+this.customer.getuID());
		
		System.out.println(src+" "+dst);
		 Ride ride = new Ride(this.src, this.dst, this.driver, this.customer);

		 cmd = new SaveRide(ride);
		 System.out.println("Ride saved");
		 cmd.execute();
		 
		 System.out.println("Ride saved");
		 
		 int time = generateEstimatedTime(this.src, this.dst);
		 System.out.println("Time : "+time);
		 return time;
		 

	}
	
	public int generateEstimatedTime(String src,String dst) {
		 Random r = new Random();
		 int low = 10;
		 int high = 20;
		 int result = r.nextInt(high-low) + low;

		 return result;
		
	}
	
	public int addPaymentMethod(long cardNo, int cvv, LocalDate expDate) throws Exception {
		this.cardNo = cardNo;
		this.cvv = cvv;
		this.expDate = expDate;
		System.out.println("CardNo : "+cardNo);
		System.out.println("CVV : "+cvv);
		System.out.println("expDate : "+expDate);
		PaymentMethod pm = new PaymentMethod(this.cardNo,this.cvv,this.expDate);
		
		DBMgrImpl cmd = new GetUser("Harsha");
		this.customer = (Customer) cmd.execute();
		System.out.println("customer id : "+this.customer.getuID());
		
		customer.setPaymentMethod(pm);
		
		cmd = new SavePaymentMethod(customer);
		cmd.execute();
		
		return -1;
		
	}
	
	public ArrayList<History> viewCustomerHistory(String c_id) throws Exception {
		this.c_id = c_id;
		DBMgrImpl cmd = new CustomerHistory(this.c_id);
		customerList =  (ArrayList<History>) cmd.execute();
		for(int i = 0; i < customerList.size(); i++) {
			System.out.print(customerList.get(i).getRideID());
			System.out.print(customerList.get(i).getSrc());
			System.out.print(customerList.get(i).getDest());
			System.out.print(customerList.get(i).getC_id());
			System.out.print(customerList.get(i).getD_id());
			System.out.println(customerList.get(i).getCost());
		} 
		
		return customerList;
		
	}
	

}
