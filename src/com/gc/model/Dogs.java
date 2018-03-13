package com.gc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // marks the class as a hibernate entity (mapped class)
@Table(name = "dogs") // maps the class to the DB table 
public class Dogs implements Serializable{
	private int dogID;
	private String dogName;
	private String breed;
	private String size;
	private String food;
	private String owner;
	

	
	
	public Dogs() {
		
	}

	public Dogs(String dogName, String breed, String size, String food,String owner) {
				
		this.dogName = dogName;
		this.breed = breed;
		this.size = size;
		this.food = food;
		this.owner = owner;
		
	}

	@Id // maps the primary key
	@GeneratedValue //  generate a value for the field automatically
	@Column(name = "dogID") //  column names 
	public int getDogID() {
		return dogID;
	}

	public void setDogID(int dogID) {
		this.dogID = dogID;
	}

	@Column
	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	@Column
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Column
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Column
	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}
	
	@Column
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}


	


}
