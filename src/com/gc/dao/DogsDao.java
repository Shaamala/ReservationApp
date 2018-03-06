package com.gc.dao;

import java.util.List;
import com.gc.model.Dogs;

/*
 * @Abduljabbar Shaamala
 */

public interface DogsDao {

	public List<Dogs> getAllCustomers();

	public Dogs getDogs(int dogsID);

	public void updateStudent(Dogs dog);

	public void deleteStudent(Dogs dog);
}
