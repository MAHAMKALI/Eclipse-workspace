package com.JPA_Hibernate.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="USERTABLE")
public class UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String userName;
	
	private String userCollege;
	
	protected UserDetails() {
		
	}

	public UserDetails(String userName, String userCollege) {
		super();
		this.userName = userName;
		this.userCollege = userCollege;
	}

	public long getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserCollege() {
		return userCollege;
	}

	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", userName=" + userName + ", userCollege=" + userCollege + "]";
	}

	
	
	
	
	
}
