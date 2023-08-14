package com.inheritance.joinTable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "credit_cards")
public class CreditCard extends PaymentMethod {
    private String cardNumber;
    private String expirationDate;
    
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
    
}
