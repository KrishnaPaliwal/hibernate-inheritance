package com.inheritance.joinTable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "paypal_accounts")
public class PayPal extends PaymentMethod {
    private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
}
