package cs6359.utdcart.entity.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestUser {

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
	void testUser() {
		 driver = new Driver();
	}

	@Test
	void testuID() {
		assertEquals("john1", driver.getuID());
	}

	@Test
	void testSetuID() {
		driver.setuID("John2");
		assertEquals("John2", driver.getuID());
	}

	@Test
	void testPassword() {
		driver.setPassword("password");
		assertEquals("password", driver.getPassword());
	}

	@Test
	void testFirstName() {
		driver.setFirstName("john");
		assertEquals("john", driver.getFirstName());
	}

	@Test
	void testLastName() {
		driver.setLastName("David");
		assertEquals("David", driver.getLastName());
	}

	@Test
	void testEmail() {
		driver.setEmail("john@utdcart.com");
		assertEquals("john@utdcart.com", driver.getEmail());
	}

	@Test
	void testGetUserType() {
		driver.setUserType("driver");
		assertEquals("driver", driver.getUserType());
	}

}
