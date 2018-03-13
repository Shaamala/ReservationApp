/**
 * 
 */
package com.gc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Abduljabbar Shaamal
 *
 */
@Entity // marks the class as a hibernate entity (mapped class)
@Table(name = "user") // maps the class to the DB table
public class User  implements Serializable{
	
   // private Long id;
    private String userId;
    private String password;
	public User() {
		
	}
	public User(String userId, String password) {
		
		this.userId = userId;
		this.password = password;
	}
	@Id // maps the primary key
	@GeneratedValue //  generate a value for the field automatically
	@Column(name = "userId") //  column names 
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@Column
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

    
}
