package cs6359.utdcart.entity.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPayment {

	Payment payment = null;

	@BeforeEach
	void setUp() throws Exception {

	}

	@AfterEach
	void tearDown() throws Exception {

	}

	@Test
	void testAdmin() {
		payment = new Payment();
		assertEquals(-1, payment.processPayment());

	}

}
