package cs6359.utdcart.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import cs6359.utdcart.dao.DBMgr;
import cs6359.utdcart.entity.User;
import cs6359.utdcart.entity.impl.Customer;
import cs6359.utdcart.entity.impl.Driver;
import cs6359.utdcart.entity.impl.History;
import cs6359.utdcart.entity.impl.License;
import cs6359.utdcart.entity.impl.Ride;
import cs6359.utdcart.service.ConnectionManager;
import cs6359.utdcart.dao.DBMgr;

public class DriverHistory implements DBMgrImpl {

	private static final String sql = "SELECT * FROM `utdcart`.`ride` WHERE `d_id` = ?";
	private PreparedStatement ps = null;
	private String d_id;
	private ResultSet rs = null;

	public DriverHistory(String d_id) {
		this.d_id = d_id;
	}

	@Override
	public Object execute() throws Exception {
		ConnectionManager cm = new ConnectionManager();
		try {
			Connection connection = cm.getConnection();
			ps = connection.prepareStatement(sql);
			ps.setString(1, this.d_id);
			rs = ps.executeQuery();
			// String status = "";
			ArrayList<History> driverHistoryList = new ArrayList<History>();

			while (rs.next()) {
				int rideID = rs.getInt("id");
				String src = rs.getString("src");
				String dest = rs.getString("dest");
				String c_id = rs.getString("c_id");
				String d_id = rs.getString("d_id");
				Double cost = rs.getDouble("cost");

				History customerHistory = new History(rideID, src, dest, c_id, d_id, cost);
				driverHistoryList.add(customerHistory);
			}
			cm.close();
			return driverHistoryList;

		} catch (Exception e) {
			throw e;
		} finally {
			cm.close();
		}
	}
}
