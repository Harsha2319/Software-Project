package cs6359.utdcart.entity.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class TestLicense {

	License license = null;

	@BeforeEach
	void setUp() throws Exception {

		String inputDate = "2020-11-18";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate issuedDate = LocalDate.parse(inputDate);
		LocalDate expDate = LocalDate.parse(inputDate);
		License license = new License(123456789L, issuedDate, expDate);
	}

	@AfterEach
	void tearDown() throws Exception {
		license = null;
	}

	@Test
	void testLicenseNo() {

		String inputDate = "2020-11-18";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate issuedDate = LocalDate.parse(inputDate);
		LocalDate expDate = LocalDate.parse(inputDate);
		License license = new License(123456789L, issuedDate, expDate);
		license.setLicenseNo(123456789L);
		//System.out.println("license.getLicenseNo() : " + license.getLicenseNo());

		assertEquals(Long.valueOf(123456789L), license.getLicenseNo());
	}

	@Test
	void testIssuedDate() {
		String inputDate = "2020-11-18";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate issuedDate = LocalDate.parse(inputDate);
		LocalDate expDate = LocalDate.parse(inputDate);
		License license = new License(123456789L, issuedDate, expDate);
		//String inputDate = "2020-11-18";
		//LocalDate issuedDate = LocalDate.parse(inputDate);
		license.setIssuedDate(issuedDate);
		assertEquals(issuedDate, license.getIssuedDate());
	}

	@Test
	void testExpDate() {
		String inputDate = "2020-11-18";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate issuedDate = LocalDate.parse(inputDate);
		LocalDate expDate = LocalDate.parse(inputDate);
		License license = new License(123456789L, issuedDate, expDate);
		//String inputDate = "2020-11-18";
		//LocalDate expDate = LocalDate.parse(inputDate);
		license.setExpDate(expDate);
		assertEquals(expDate, license.getExpDate());
	}

}