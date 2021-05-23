package cs6359.utdcart.entity.impl;

public class History {

	private int rideID;
	private String src;
	private String dest;
	private String c_id;
	private String d_id;
	private double cost;
	// private double duration;
	public History(int rideID, String src, String dest, String c_id, String d_id, double cost) {
		super();
		this.rideID = rideID;
		this.src = src;
		this.dest = dest;
		this.c_id = c_id;
		this.d_id = d_id;
		this.cost = cost;
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
	public String getC_id() {
		return c_id;
	}
	public void setC_id(String c_id) {
		this.c_id = c_id;
	}
	public String getD_id() {
		return d_id;
	}
	public void setD_id(String d_id) {
		this.d_id = d_id;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "History [rideID=" + rideID + ", src=" + src + ", dest=" + dest + ", c_id=" + c_id + ", d_id=" + d_id
				+ ", cost=" + cost + "]";
	}
	
	
	

	
}
