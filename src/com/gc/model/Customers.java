package com.gc.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * @Abduljabbar Shaamala
 */

@Entity // marks the class as a hibernate entity (mapped class)
@Table(name = "Customers") // maps the class to the DB table 
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
	private String dropOff;
	private String pickUp;
	private String dog;

	
	

	public Customers() {
		
	}
	

	

	public Customers(String fName, String lName, String street, String city, String state, String zip, String email,
			String homeTel, String emrgTel, String vetName, String vetTel, String dropOff, String pickUp,
			String dog) {
		super();
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
		this.dropOff = dropOff;
		this.pickUp = pickUp;
		this.dog = dog;
	}




	@Id // maps the primary key
	@GeneratedValue //  generate a value for the field automatically
	@Column(name = "customerID") //  column names 
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	@Column
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	@Column
	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	@Column
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Column
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column
	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Column
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column
	public String getHomeTel() {
		return homeTel;
	}

	public void setHomeTel(String homeTel) {
		this.homeTel = homeTel;
	}

	@Column
	public String getEmrgTel() {
		return emrgTel;
	}

	public void setEmrgTel(String emrgTel) {
		this.emrgTel = emrgTel;
	}

	@Column
	public String getVetName() {
		return vetName;
	}

	public void setVetName(String vetName) {
		this.vetName = vetName;
	}

	@Column
	public String getVetTel() {
		return vetTel;
	}

	public void setVetTel(String vetTel) {
		this.vetTel = vetTel;
	}
	@Column
	public String getDropOff() {
		return dropOff;
	}

	public void setDropOff(String dropOff) {
		this.dropOff = dropOff;
	}
	@Column
	public String getPickUp() {
		return pickUp;
	}

	public void setPickUp(String pickUp) {
		this.pickUp = pickUp;
	}
	@Column
	public String getDog() {
		return dog;
	}

	public void setDog(String dog) {
		this.dog = dog;
	}
	

	

}
