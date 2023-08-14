package com.inheritance.joinTable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClassJoinTable {

	public static void main(String args[]) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		CreditCard creditCard = new CreditCard();
		creditCard.setOwner("John Doe");
		creditCard.setCardNumber("1234567890123456");
		creditCard.setExpirationDate("12/25");

		PayPal payPal = new PayPal();
		payPal.setOwner("Jane Smith");
		payPal.setEmail("jane@example.com");
		
		session.save(creditCard);
		session.save(payPal);
		
		tx.commit();
		session.close();
		
	}
}
