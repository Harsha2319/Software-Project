package cs6359.utdcart.controller;

import cs6359.utdcart.dao.impl.CustomerHistory;

public class Test {

	public static void main(String[] args)  throws Exception  {
		// TODO Auto-generated method stub
		CustomerController cc = new CustomerController();
        cc.SearchRide("hotel","bank");
        cc.viewCustomerHistory("Harsha");
	}

}
