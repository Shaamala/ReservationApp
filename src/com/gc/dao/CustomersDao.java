package com.gc.dao;

import java.util.List;
import com.gc.model.Customers;

/*
 * @Abduljabbar Shaamala
 */

public interface CustomersDao {

	public List<Customers> getAllCustomers();

	public Customers getCustomer(int customerID);
	
	public Customers addCustomers(Customers customer);

	public void updateCustomres(Customers customer);

	public void deleteCustomers(Customers customer);

}
