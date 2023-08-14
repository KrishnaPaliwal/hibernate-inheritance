package com.inheritance.singleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Bike")
public class Bike extends Vehicle {

	private boolean hasSidecar;

	public boolean isHasSidecar() {
		return hasSidecar;
	}

	public void setHasSidecar(boolean hasSidecar) {
		this.hasSidecar = hasSidecar;
	}
}
