package cs6359.utdcart.entity;

public abstract class User {

	//private int userid;
	private String uID;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String userType;

	
	public User(String uID, String password, String firstName, String lastName, String email) {
		System.out.println("user");
		this.uID = uID;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		//this.userType = userType;
	}
	
	public User() {
		
	}
	
	
	/*
	 * public int register() throws Exception { DBMgr db = new DBMgr();
	 * db.insertUser(this); return -1; }
	 */

	public String getuID() {
		return uID;
	}

	public void setuID(String uID) {
		this.uID = uID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	
}