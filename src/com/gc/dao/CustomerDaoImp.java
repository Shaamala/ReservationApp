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
public class CustomerDaoImp implements CustomersDao {
	List<Customers> customerList;

	// display all customers list
	@Override
	public List<Customers> getAllCustomers() {

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

	// add new customer
	public Customers addCustomers(Customers customer) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		
		//Customers customer = new Customers();
		//customer.setCustomerID(customerID);
		try {
			tx = session.beginTransaction();
			session.save(customer);
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
		return customer;
	}
	// delete customer
	public void updateCustomers(int customerID) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;

		Customers customer = getCustomer(customerID);
		try {
			tx = session.beginTransaction();
			session.update(customer);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	// delete customer
	public void deleteCustomers(int customerID) {

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

	@Override
	public Customers getCustomer(int customerID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCustomres(Customers customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomers(Customers customer) {
		// TODO Auto-generated method stub
		
	}

}
