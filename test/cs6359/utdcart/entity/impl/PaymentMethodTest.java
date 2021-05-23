package cs6359.utdcart.entity.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class PaymentMethodTest {

	PaymentMethod paymentMethod = null;

	@BeforeEach
	void setUp() throws Exception {

	}

	@AfterEach
	void tearDown() throws Exception {

	}

	@Test
	void testCardNo() {
		String inputDate = "2020-11-18";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate expDate = LocalDate.parse(inputDate);
		PaymentMethod paymentMethod = new PaymentMethod(123456789L, 333, expDate);		
		assertEquals(123456789L, paymentMethod.getCardNo());		
	}

	@Test
	void testCvv() {
		String inputDate = "2020-11-18";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate expDate = LocalDate.parse(inputDate);
		PaymentMethod paymentMethod = new PaymentMethod(123456789L, 333, expDate);		
		assertEquals(333, paymentMethod.getCvv());	
	}

	@Test
	void testExpDate() {
		String inputDate = "2020-11-18";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate expDate = LocalDate.parse(inputDate);
		PaymentMethod paymentMethod = new PaymentMethod(123456789L, 333, expDate);		
		assertEquals(expDate, paymentMethod.getExpDate());	
	}

}