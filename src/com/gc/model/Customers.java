package com.gc.model;

/*
 * @Abduljabbar Shaamala
 */

public class Customers {
	private int customerID;
	private String fName;
	private String lName;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String email;
	private String homeTel;
	private String emrgTel;
	private String vetName;
	private String vetTel;
	
	public Customers() {
		
	}
	

	public Customers(int customerID, String fName, String lName, String street, String city, String state, String zip,
			String email, String homeTel, String emrgTel, String vetName, String vetTel) {
		super();
		this.customerID = customerID;
		this.fName = fName;
		this.lName = lName;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.email = email;
		this.homeTel = homeTel;
		this.emrgTel = emrgTel;
		this.vetName = vetName;
		this.vetTel = vetTel;
	}


	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHomeTel() {
		return homeTel;
	}

	public void setHomeTel(String homeTel) {
		this.homeTel = homeTel;
	}

	public String getEmrgTel() {
		return emrgTel;
	}

	public void setEmrgTel(String emrgTel) {
		this.emrgTel = emrgTel;
	}

	public String getVetName() {
		return vetName;
	}

	public void setVetName(String vetName) {
		this.vetName = vetName;
	}

	public String getVetTel() {
		return vetTel;
	}

	public void setVetTel(String vetTel) {
		this.vetTel = vetTel;
	}
	

	
}
