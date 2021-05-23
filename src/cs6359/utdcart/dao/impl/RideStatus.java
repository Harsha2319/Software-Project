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
import cs6359.utdcart.entity.impl.Ride;
import cs6359.utdcart.service.ConnectionManager;
import cs6359.utdcart.dao.DBMgr;

public class RideStatus implements DBMgrImpl {

	private static final String sql = "SELECT ride_status FROM `utdcart`.`ride` WHERE `id` = ?";
	private PreparedStatement ps = null;
	private String rideID;
	private ResultSet rs = null;

	public RideStatus(String rideID) {
		this.rideID = rideID;
	}

	@Override
	public Object execute() throws Exception {
		ConnectionManager cm = new ConnectionManager();
		try {
			Connection connection = cm.getConnection();
			ps = connection.prepareStatement(sql);
			ps.setString(1, this.rideID);
			rs = ps.executeQuery();
			String status = "";
			while (rs.next()) {
				status = rs.getString("ride_status");
			}
			cm.close();
			return status;

		} catch (Exception e) {
			throw e;
		} finally {
			cm.close();
		}
	}
}
