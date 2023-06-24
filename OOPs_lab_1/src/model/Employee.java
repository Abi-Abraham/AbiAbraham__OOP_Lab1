package com.greatlearning.model;

public class Employee {
	// variables
	String firstName;
	String lastName;

	public String getFirstName() {
		return firstName;
	}

	//to set first name
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	//To get last name
	public String getLastName() {
		return lastName;
	}

	//To set last name
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	//Full details
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	
}
