package com.gc.model;

public class Dogs {
	private int dogID;
	private String dogName;
	private String breed;
	private String size;
	private String food;
	private String customerID;
	
	public Dogs() {
		
	}

	public Dogs(int dogID, String dogName, String breed, String size, String food, String customerID) {
		super();
		this.dogID = dogID;
		this.dogName = dogName;
		this.breed = breed;
		this.size = size;
		this.food = food;
		this.customerID = customerID;
	}

	public int getDogID() {
		return dogID;
	}

	public void setDogID(int dogID) {
		this.dogID = dogID;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	
	
	

}
