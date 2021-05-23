package cs6359.utdcart.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {

	private final String url = "jdbc:mysql://localhost:3306/utdcart";
	private final String username = "root";
	private final String password = "shaloo23";
	private Connection connection = null;

	public Connection getConnection() throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			this.connection = DriverManager.getConnection(this.url, this.username, this.password);
			
			//System.out.println("Location ::: get Connection");
			return this.connection;
		} catch (Exception e) {
			System.out.println("Location ::: get Connection | Errror");
			close();
			throw e;
		} finally {
			//close();
		}
		// return this.connection;
	}

	public void close() {
		try {
			if (this.connection != null) {
				this.connection.close();
			}
		} catch (Exception e) {

		}
	}
}
