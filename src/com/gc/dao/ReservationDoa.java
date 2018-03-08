package com.gc.dao;

import java.util.List;

import com.gc.model.Reservation;



public interface ReservationDoa {

	public List<Reservation> getAllReservation();

	public Reservation getReservation(int reservationID);
	
	public Reservation addReservation(Reservation reservation);

	public void updateReservation(Reservation reservation);

	public void deleteReservation(Reservation reservation);
	
}
