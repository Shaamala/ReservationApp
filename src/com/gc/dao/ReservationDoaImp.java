/**
 * 
 */
package com.gc.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.gc.model.Reservation;
import com.gc.util.HibernateUtil;

/**
 * @author Abdul Shaamal
 *
 */
public  class ReservationDoaImp implements ReservationDoa{
	
	// display all reservation list
		public List<Reservation> readReservation() {

			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

			Session session = sessionFactory.openSession();
			Transaction tx = null;
			List<Reservation> reservationList = null;
			try {
				tx = session.beginTransaction();
				reservationList = session.createQuery("FROM customers").list();
				tx.commit(); // COMMIT MUST COME AFTER THE ACTION
			} catch (HibernateException e) {
				if (tx != null)
					tx.rollback();
				e.printStackTrace();
			} finally {
				session.close();
			}
			return reservationList;
		}

		// add new reservation
		public Reservation addReservation(Reservation reserv) {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tx = null;
			//Reservation reservation = new Reservation();
			//reservation.setReservationID(reservationID);
			try {
				tx = session.beginTransaction();
				session.save(reserv);
				
				tx.commit();
				System.out.println("Made it here");
			} catch (HibernateException e) {
				if (tx != null)
					tx.rollback();
				System.out.println("Rollback");
				e.printStackTrace();
			} finally {
				session.close();
			}
			return reserv;
		}
		// delete reservation
		public void updateReservation(int reservationID) {

			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tx = null;

			Reservation reservation = getReservation(reservationID);
			try {
				tx = session.beginTransaction();
				session.update(reservation);
				tx.commit();
			} catch (HibernateException e) {
				if (tx != null)
					tx.rollback();
				e.printStackTrace();
			} finally {
				session.close();
			}
		}

		// delete reservation
		public void deleteReservation(int reservationID) {

			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tx = null;

			Reservation reservation = getReservation(reservationID);
			try {
				tx = session.beginTransaction();
				session.delete(reservation);
				tx.commit();
			} catch (HibernateException e) {
				if (tx != null)
					tx.rollback();
				e.printStackTrace();
			} finally {
				session.close();
			}
		}

		@Override
		public List<Reservation> getAllReservation() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Reservation getReservation(int reservationID) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void updateReservation(Reservation reservation) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteReservation(Reservation reservation) {
			// TODO Auto-generated method stub
			
		}

}
