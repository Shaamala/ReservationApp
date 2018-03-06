package com.gc.dao;

import java.util.List;
import com.gc.model.Customers;

/*
 * @Abduljabbar Shaamala
 */

public interface CustomersDao {
	public List<Customers> getAllCustomers();
	   public Customers getCustomer(int customerID);
	   public void updateStudent(Customers customer);
	   public void deleteStudent(Customers customer);

}
