package cs6359.utdcart.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.ZoneId;

import cs6359.utdcart.entity.impl.Driver;
import cs6359.utdcart.entity.impl.License;
import cs6359.utdcart.service.ConnectionManager;
import cs6359.utdcart.dao.DBMgr;


public class SaveLicense implements DBMgrImpl {

	private static final String sql = "INSERT INTO `utdcart`.`license` (id, licenseNo, issuedDate, expDate) VALUES (?, ?, ?, ?)";
	private PreparedStatement ps = null;
	private Driver driver = null;

	public SaveLicense(Driver driver) {
		this.driver = driver;
	}

	@Override
	public Object execute() throws Exception {
		ConnectionManager cm = new ConnectionManager();
		License license = driver.getLicense();
		
		ZoneId zone = ZoneId.systemDefault();
		try {
			Connection connection = cm.getConnection();
			ps = connection.prepareStatement(sql);
			ps.setString(1, driver.getuID());
			ps.setLong(2, license.getLicenseNo());
			ps.setLong(3, license.getIssuedDate().atStartOfDay(zone).toEpochSecond());
			ps.setLong(4, license.getExpDate().atStartOfDay(zone).toEpochSecond());
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
