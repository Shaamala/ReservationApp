/**
 * 
 */
package com.gc.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Abdul Shaamala
 *
 */
@Entity // marks the class as a hibernate entity (mapped class)
@Table(name = "Reservation") // maps the class to the DB table 
public class Reservation {

	private int reservationID;
	private int customerID;
	private String dropOff;
	private String pickUp;


	private Customers customer;
	

	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="customerID")
	public Customers getCustomer() {
		return customer;
	}

	public void setCustomer(Customers customer) {
		this.customer = customer;
	}

	
	public Reservation() {

	}

	public Reservation(int reservationID,  String dropOff, String pickUp) {
		this.reservationID = reservationID;
		this.dropOff = dropOff;
		this.pickUp = pickUp;
	}

	@Id // maps the primary key
	@GeneratedValue // generate a value for the field automatically
	
	public int getReservationID() {
		return reservationID;
	}

	public void setReservationID(int reservationID) {
		this.reservationID = reservationID;
	}


	@Column
	public String getPickUp() {
		return pickUp;
	}
	
	@Column
	public String getDropOff() {
		return dropOff;
	}

	public void setPickUp(String pickUp) {
		this.pickUp = pickUp;
	}
	public void setDropOff(String dropOff) {
		this.dropOff = dropOff;
	}

}
