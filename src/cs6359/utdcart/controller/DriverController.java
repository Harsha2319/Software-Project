package cs6359.utdcart.controller;


//import cs6359.utdcart.entity.Driver;

import cs6359.utdcart.entity.impl.Driver;
import cs6359.utdcart.entity.impl.History;

import java.util.ArrayList;

import cs6359.utdcart.dao.impl.DBMgrImpl;
import cs6359.utdcart.dao.impl.DriverHistory;
import cs6359.utdcart.entity.User;

public class DriverController {
	
	
	
	private Driver user;
	// private Driver user;
	private ArrayList<History> driverList;
	private String d_id;
	private DBMgrImpl db = null;

	public DriverController() {
	}
	public ArrayList<History> viewDriverHistory(String d_id) throws Exception {
		this.d_id =d_id;
		DBMgrImpl cmd = new DriverHistory(this.d_id);
		driverList = (ArrayList<History>) cmd.execute();
		System.out.println("driver controller"+driverList);
		return driverList;
		
	}

}
