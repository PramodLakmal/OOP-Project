package model.user;

public class User {
	private int id;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private String role;
	
	public User() {}
	
	
	/**
	 * @param fname
	 * @param lname
	 * @param email
	 * @param password
	 * @param mobile
	 * @param address
	 * @param nIC
	 * @param role
	 */
	public User(String fname, String lname, String email, String password, String role) {
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.role = role;
	}



	/**
	 * @param id
	 * @param fname
	 * @param lname
	 * @param email
	 * @param password
	 * @param mobile
	 * @param address
	 * @param join_date
	 * @param nIC
	 * @param role
	 */
	public User(int id, String fname, String lname, String email, String password, String role) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.role = role;
	}
	
	/**
	 * @param fname
	 * @param lname
	 * @param email
	 * @param mobile
	 * @param address
	 * @param nIC
	 */
	public User(int id, String fname, String lname, String email) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;

	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}
	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	
}
