package cs6359.utdcart.entity.impl;

import cs6359.utdcart.entity.User;

public class Customer extends User {

	PaymentMethod paymentMethod;

	public Customer(String uID, String password, String firstName, String lastName, String email) {
		super(uID, password, firstName, lastName, email);
		System.out.println("working....");
		this.setUserType("customer");
	}

	/*
	public void addPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	*/

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

}
