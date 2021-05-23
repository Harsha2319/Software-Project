package cs6359.utdcart.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.ZoneId;

import cs6359.utdcart.dao.DBMgr;
import cs6359.utdcart.entity.User;
import cs6359.utdcart.entity.impl.Customer;
import cs6359.utdcart.entity.impl.PaymentMethod;
import cs6359.utdcart.service.ConnectionManager;

public class SavePaymentMethod implements DBMgrImpl {

	private static final String sql = "INSERT INTO `utdcart`.`paymentmethod` (id, cardNo, cvv, expDate) VALUES (?, ?, ?, ?)";
	private PreparedStatement ps = null;
	private Customer customer = null;

	public SavePaymentMethod(Customer customer) {
		this.customer = customer;
	}

	@Override
	public Object execute() throws Exception {
		ConnectionManager cm = new ConnectionManager();
		PaymentMethod paymentMethod = customer.getPaymentMethod();
		ZoneId zone = ZoneId.systemDefault();
		try {
			Connection connection = cm.getConnection();
			ps = connection.prepareStatement(sql);
			ps.setString(1, customer.getuID());
			ps.setLong(2, paymentMethod.getCardNo());
			ps.setInt(3, paymentMethod.getCvv());
			ps.setLong(4, paymentMethod.getExpDate().atStartOfDay(zone).toEpochSecond());
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
