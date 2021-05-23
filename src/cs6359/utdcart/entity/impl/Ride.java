package cs6359.utdcart.entity.impl;

import java.util.List;

public class Ride {

	private int rideID;
	private String src;
	private String dest;
	private double cost = 5;
	private double duration;
	private int seatAvailability;
	private Driver driver;
	private Customer customer;
	private String status;

	public Ride(String src, String dest, Driver driver, Customer customer) {
		super();
		this.src = src;
		this.dest = dest;
		this.driver = driver;
		this.customer = customer;
	}

	public int getRideID() {
		return rideID;
	}

	public void setRideID(int rideID) {
		this.rideID = rideID;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public int getSeatAvailability() {
		return seatAvailability;
	}

	public void setSeatAvailability(int seatAvailability) {
		this.seatAvailability = seatAvailability;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCustomerID() {
		return this.customer.getuID();
	}

	public String getDriverID() {
		return this.driver.getuID();
	}

	public String toString() {
		String sep = " | ";
		return "src: " + src + sep + "dest: " + dest + sep + "driver: " + driver + sep + "customer" + customer;
	}
}
