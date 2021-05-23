package cs6359.utdcart.entity.impl;

import cs6359.utdcart.entity.User;

public class Driver extends User {

	private License license;
	private int driverStatus;
	private int capacity;
	private int seatAvailability;

	public Driver(String uID, String password, String firstName, String lastName, String email) {
		super(uID, password, firstName, lastName, email);
		// TODO Auto-generated constructor stub
		this.setUserType("driver");
		this.capacity = 4;
		this.driverStatus = 1;
		this.seatAvailability = 0;
	}

	public Driver() {
		super();
	}

	public License getLicense() {
		return this.license;
	}

	public void setLicense(License license) {
		this.license = license;
	}

	public int getDriverStatus() {
		return driverStatus;
	}

	public void setDriverStatus(int driverStatus) {
		this.driverStatus = driverStatus;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
		System.out.println("driver:"+capacity);
	}

	public int getSeatAvailability() {
		return seatAvailability;
	}

	public void setSeatAvailability(int seatAvailability) {
		this.seatAvailability = seatAvailability;
	}

}
