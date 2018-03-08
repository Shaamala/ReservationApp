package com.gc.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.gc.model.Customers;
import com.gc.model.Dogs;
import com.gc.util.HibernateUtil;

/*
 * @Abduljabbar Shaamala
 */

public  class DogsDaoImp implements DogsDao{
	
	List<Dogs> dogsList;

	// display all customers list
	@Override
	public List<Dogs> getAllDogs() {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction tx = null;
		List<Dogs> dogsList = null;
		try {
			tx = session.beginTransaction();
			dogsList = session.createQuery("FROM dogs").list();
			tx.commit(); // COMMIT MUST COME AFTER THE ACTION
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return dogsList;
	}

	// add new dog
	public Dogs addDogs(Dogs dog) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			session.save(dog);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return dog;
	}

	// Update dog
		public void updateDogs(int dogID) {

			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tx = null;

			Dogs dog = getDogs(dogID);
			try {
				tx = session.beginTransaction();
				session.update(dog);
				tx.commit();
			} catch (HibernateException e) {
				if (tx != null)
					tx.rollback();
				e.printStackTrace();
			} finally {
				session.close();
			}
		}
		
	// delete dog
	public void deleteDogs(int dogID) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;

		Dogs dog = getDogs(dogID);
		try {
			tx = session.beginTransaction();
			session.delete(dog);
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
	public Dogs getDogs(int dogID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateDogs(Dogs dog) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDogs(Dogs dog) {
		// TODO Auto-generated method stub
		
	}

}
