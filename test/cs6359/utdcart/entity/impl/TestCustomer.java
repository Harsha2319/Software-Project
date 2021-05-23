package cs6359.utdcart.entity.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCustomer {

	Customer customer = null;

	@BeforeEach
	void setUp() throws Exception {
		customer = new Customer("john1", "password", "john", "David", "john@utdcart.com");
	}

	@AfterEach
	void tearDown() throws Exception {
		customer = null;
	}

	@Test
	void testCustomer() {
		String inputDate = "2020-11-18";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate expDate = LocalDate.parse(inputDate);
		PaymentMethod paymentMethod = new PaymentMethod(123456789L, 333, expDate);
		Customer customer = new Customer("john1", "password", "john", "David", "john@utdcart.com");
		customer.setPaymentMethod(paymentMethod);
		
		assertEquals(paymentMethod, customer.getPaymentMethod()); 
		
	}

	@Test
	void testPaymentMethod() {
		fail("Not yet implemented");
	}

}
