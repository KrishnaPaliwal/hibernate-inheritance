package com.inheritance.TablePerClass;

import javax.persistence.Entity;

@Entity
public class Engineer extends Employee {
    private String specialization;

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
    
    
}
