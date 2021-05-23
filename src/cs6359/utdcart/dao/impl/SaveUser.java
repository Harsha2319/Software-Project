package cs6359.utdcart.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import cs6359.utdcart.dao.DBMgr;
import cs6359.utdcart.entity.User;
import cs6359.utdcart.entity.impl.Driver;
import cs6359.utdcart.service.ConnectionManager;

public class SaveUser implements DBMgrImpl {

	private static final String sql = "INSERT INTO `utdcart`.`user` (username, firstName, lastName, email, password, type) VALUES (?, ?, ?, ?, ?, ?)";
	private PreparedStatement ps = null;
	private User user = null;

	private static final String sqlDriver = "INSERT INTO `utdcart`.`driver` (id, driverStatus, capacity, seatAvailability) VALUES (?, ?, ?, ?)";

	public SaveUser(User user) {
		this.user = user;
		System.out.println("sucess"+this.user.getuID());
	}

	@Override
	public Object execute() throws Exception {
		ConnectionManager cm = new ConnectionManager();
		try {
			Connection connection = cm.getConnection();
			ps = connection.prepareStatement(sql);
			ps.setString(1, user.getuID());
			ps.setString(2, user.getFirstName());
			ps.setString(3, user.getLastName());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getPassword());
			ps.setString(6, user.getUserType());
			int count = ps.executeUpdate();

			if (user.getUserType().matches("driver")) {
				Driver driver = (Driver) user;
				ps = connection.prepareStatement(sqlDriver);
				ps.setString(1, driver.getuID());
				ps.setInt(2, driver.getDriverStatus());
				ps.setInt(3, driver.getCapacity());
				ps.setInt(4, driver.getSeatAvailability());
				int count2 = ps.executeUpdate();
				connection.close();
			}
			connection.close();
			return -1;
		} catch (Exception e) {
			throw e;
		} finally {
			cm.close();

		}
	}
}
