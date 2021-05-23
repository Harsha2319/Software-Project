package cs6359.utdcart.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.ZoneId;

import cs6359.utdcart.dao.DBMgr;
import cs6359.utdcart.entity.impl.Ride;
import cs6359.utdcart.service.ConnectionManager;

public class SaveRide implements DBMgrImpl {

	private static final String sql = "INSERT INTO `utdcart`.`ride` (c_id, d_id, src, dest, cost) VALUES (?, ?, ?, ?, ?)";
	private PreparedStatement ps = null;
	private Ride ride = null;

	public SaveRide(Ride ride) {
		this.ride = ride;
		System.out.println(ride.getCustomerID());
	}

	@Override
	public Object execute() throws Exception {
		ConnectionManager cm = new ConnectionManager();

		ZoneId zone = ZoneId.systemDefault();
		try {
			Connection connection = cm.getConnection();
			ps = connection.prepareStatement(sql);
			ps.setString(1, this.ride.getCustomerID());
			ps.setString(2, this.ride.getDriverID());
			ps.setString(3, this.ride.getSrc());
			ps.setString(4, this.ride.getDest());
			ps.setDouble(5, this.ride.getCost());

			int count = ps.executeUpdate();
			connection.close();
			return -1;
		} catch (Exception e) {
			throw e;
		} finally {
			cm.close();

		}
	}
}
