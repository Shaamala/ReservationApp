package com.gc.dao;

import java.util.List;

import com.gc.model.Customers;
/*
 * @Abduljabbar Shaamala
 */
public class CustomerDaoImp implements CustomersDao  {
	List<Customers> customerList;

	  public List<Customers> readCustomers() {
	        Session session = factory.openSession();
	        Transaction tx = null;
	        List<Customers> customerList = null;
	        try {
	            tx = session.beginTransaction();
	            customerList = session.createQuery("FROM customers").list();
	            tx.commit();  //COMMIT MUST COME AFTER THE ACTION
	        } catch (HibernateException e) {
	            if (tx != null) tx.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        return customerList;
	}
	

}
