package com.gc.dao;

import java.util.List;

import com.gc.model.Customers;
import com.gc.model.Dogs;

/*
 * @Abduljabbar Shaamala
 */

public interface DogsDao {

	public List<Dogs> getAllDogs();

	public Dogs getDogs(int dogsID);
	
	public Dogs addDogs(Dogs dog);

	public void updateDogs(Dogs dog);

	public void deleteDogs(Dogs dog);
}
