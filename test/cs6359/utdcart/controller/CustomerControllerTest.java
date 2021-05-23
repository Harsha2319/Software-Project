package cs6359.utdcart.controller;

import static org.junit.jupiter.api.Assertions.*;

import cs6359.utdcart.controller.CustomerController;

class CustomerControllerTest {
	CustomerController cc = new CustomerController();

    @org.junit.jupiter.api.Test
    void searchRide() throws Exception {
    	cc.SearchRide("sg", "dh");
    }

    @org.junit.jupiter.api.Test
    void generateEstimatedTime() {
    }

    @org.junit.jupiter.api.Test
    void addPaymentMethod() {
    }

    @org.junit.jupiter.api.Test
    void viewCustomerHistory() {
    }
}