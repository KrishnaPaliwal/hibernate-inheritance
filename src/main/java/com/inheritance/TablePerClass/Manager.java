package com.inheritance.TablePerClass;

import javax.persistence.Entity;

@Entity
public class Manager extends Employee {
    private String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
    
}
