package com.gc.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.gc.model.Customers;
import com.gc.util.HibernateUtil;

/*
 * @Abduljabbar Shaamala
 */
public abstract class CustomerDaoImp implements CustomersDao {
	List<Customers> customerList;

	// display all customers list
	public List<Customers> readCustomers() {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction tx = null;
		List<Customers> customerList = null;
		try {
			tx = session.beginTransaction();
			customerList = session.createQuery("FROM customers").list();
			tx.commit(); // COMMIT MUST COME AFTER THE ACTION
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return customerList;
	}

	// Create a customer in the database
	public void addUser(Customers customer) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(customer);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void deleteCustomer(int customerID) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;

		Customers customer = getCustomer(customerID);
		try {
			tx = session.beginTransaction();
			session.delete(customer);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}
