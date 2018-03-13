package com.gc.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.web.bind.annotation.RequestParam;

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
		List<Customers> list = new ArrayList<Customers>();
		try {
			tx = session.beginTransaction();

			
			customerList =  session.createQuery("Select c.customerID,c.fName,c.lName FROM Customers c").list();
						
			for(Customers customer : customerList) {
				   if(customer instanceof Customers) {
					   list.add((Customers) customer);
				   }}
			

			customerList = (List<Customers>)session.createQuery("FROM Customers").setMaxResults(10).list();

			tx.commit(); // COMMIT MUST COME AFTER THE ACTION
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}

	// add new customer
	public Customers addCustomers(Customers customer) {
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
		return customer;
	}
	// update customer
	public void updateCustomers(int id) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;

		Customers customer = getCustomer(id);
		System.out.println(id);
		//customer.setCustomerID(id);
		try {
			tx = session.beginTransaction();
			System.out.println("Made it here");
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			System.out.println("Rollback");
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
		List<Customers> customerList = null;
		
		try {
			tx = session.beginTransaction();
			Query query = session.createQuery("SELECT c FROM Customers c WHERE c.id = :id");
	        query.setParameter("id", customerID);
	        System.out.println("aaaaa" + customerID);
	        customerList = query.list();
	        session.delete(customerList.get(0));
	        System.out.println("To delete: " + customerList.get(0));
	        
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
