package cs6359.utdcart.entity.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestDriver {

	Driver driver = null;

	@BeforeEach
	void setUp() throws Exception {
		driver = new Driver("john1", "password", "john", "David", "john@utdcart.com");
	}

	@AfterEach
	void tearDown() throws Exception {
		driver = null;
	}

	@Test
	void testDriver() {
		Driver driver = new Driver();

		driver.setuID("john1");
		String uID = driver.getuID();
		assertEquals("john1", uID);
	}

	@Test
	void testLicense() {

		String inputDate = "2020-11-18";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate issuedDate = LocalDate.parse(inputDate);
		LocalDate expDate = LocalDate.parse(inputDate);
		License license = new License(123456789L, issuedDate, expDate);

		driver.setLicense(license);

		assertEquals(license, driver.getLicense());
	}

	@Test
	void testDriverStatus() {
		driver.setDriverStatus(1);
		assertEquals(1, driver.getDriverStatus());
	}

	@Test
	void testCapacity() {
		driver.setCapacity(1);
		assertEquals(1, driver.getCapacity());
	}

	@Test
	void testAvailability() {
		driver.setSeatAvailability(1);
		assertEquals(1, driver.getSeatAvailability());
	}



	@Test
	void testGetuID() {
		assertEquals("john1", driver.getuID());
	}

	@Test
	void testSetuID() {
		driver.setuID("John2");
		assertEquals("John2", driver.getuID());
	}

	@Test
	void testGetPassword() {
		assertEquals("password", driver.getPassword());
	}

	@Test
	void testSetPassword() {
		driver.setPassword("password1");
		assertEquals("password1", driver.getPassword());
	}
}
