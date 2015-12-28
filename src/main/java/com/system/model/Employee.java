package com.system.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "employees")
public class Employee {

	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  
	  // The user's email
	  @NotNull
	  private String email;
	  
	  // The user's name
	  @NotNull
	  private String name;

	public Employee(String email, String name) {
		this.email = email;
		this.name = name;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
