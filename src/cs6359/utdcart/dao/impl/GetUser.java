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
import cs6359.utdcart.dao.DBMgr;

public class GetUser implements DBMgrImpl {

	private static final String sql = "SELECT * FROM `utdcart`.`user` WHERE `username` = ?";
	private PreparedStatement ps = null;
	private String uID;
	private ResultSet rs = null;

	public GetUser(String uID) {
		this.uID = uID;
	}

	@Override
	public Object execute() throws Exception {
		ConnectionManager cm = new ConnectionManager();
		try {
			Connection connection = cm.getConnection();
			ps = connection.prepareStatement(sql);
			ps.setString(1, this.uID);
			rs = ps.executeQuery();
			User user = null;
			while (rs.next()) {
				String uID = rs.getString("username");
				String password = rs.getString("password");
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");
				String email = rs.getString("email");
				String type = rs.getString("type");

				if (type.matches("customer")) {
					user = new Customer(uID, password, firstName, lastName, email);
				}

				else if (type.matches("driver")) {
					user = new Driver(uID, password, firstName, lastName, email);
				}
			}
			cm.close();
			return user;

		} catch (Exception e) {
			throw e;
		} finally {
			cm.close();

		}

	}

}
