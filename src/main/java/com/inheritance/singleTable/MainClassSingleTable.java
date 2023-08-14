package com.inheritance.singleTable;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClassSingleTable {

	public static void main(String args[]) {
		Configuration conf = new Configuration().configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Car car = new Car();
		car.setMake("Toyota");
		car.setModel("Corolla");
		car.setNumberOfDoors(4);

		Bike bike = new Bike();
		bike.setMake("Harley-Davidson");
		bike.setModel("Sportster");
		bike.setHasSidecar(false);

		session.save(car);
		session.save(bike);

		tx.commit();
		session.close();
	}
}
