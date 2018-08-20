package com.auribises.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.auribises.model.User;

public class HibernateHelper {
	
	Configuration config;
	SessionFactory factory;
	Session session;
	Transaction transaction;
	
	public HibernateHelper() {
		
		try {
			
			config = new Configuration();
			config.configure();
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession();
			
			System.out.println("--Hibernate Configured and Session opened--");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void registerUser(User user){
		try {
			
			transaction = session.beginTransaction();
			
			session.save(user);
			
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
