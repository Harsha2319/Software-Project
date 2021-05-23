package cs6359.utdcart.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import cs6359.utdcart.dao.DBMgr;
import cs6359.utdcart.entity.User;
import cs6359.utdcart.entity.impl.Customer;
import cs6359.utdcart.entity.impl.Driver;
import cs6359.utdcart.entity.impl.License;
import cs6359.utdcart.service.ConnectionManager;


public class GetAvailableDriver implements DBMgrImpl{
	
	private static final String sql = "SELECT * FROM `utdcart`.`driver` WHERE `driverStatus` = 1";
	private PreparedStatement ps = null;
	private Driver driver = null;
	private ResultSet rst = null;


	public GetAvailableDriver(Driver driver) {
		this.driver = driver;
	}


	@Override
	public Object execute() throws Exception {
		// TODO Auto-generated method stub
		ConnectionManager cm = new ConnectionManager();
		try {
			Connection connection = cm.getConnection();
			
			ps = connection.prepareStatement(sql);
			rst = ps.executeQuery();
			while(rst.next()) {
				driver = new Driver();
				driver.setCapacity(rst.getInt("capacity"));
				driver.setuID(rst.getString("id"));
				driver.setDriverStatus(rst.getInt("driverStatus"));
				driver.setSeatAvailability(rst.getInt("seatAvailability"));
			}
			return driver;
			
			
		} catch (Exception e) {
			throw e;
		} finally {
			cm.close();

		}
		
	}
	

}
