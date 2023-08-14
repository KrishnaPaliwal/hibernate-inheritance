package com.inheritance.TablePerClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClassTablePerClass {


	public static void main(String args[]) {
		Configuration conf = new Configuration().configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Manager manager = new Manager();
		manager.setName("John Doe");
		manager.setDepartment("Sales");

		Engineer engineer = new Engineer();
		engineer.setName("Jane Smith");
		engineer.setSpecialization("Software");

		session.save(manager);
		session.save(engineer);


		tx.commit();
		session.close();
	}
}
