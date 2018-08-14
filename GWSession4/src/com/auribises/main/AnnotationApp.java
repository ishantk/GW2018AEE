package com.auribises.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.auribises.model.Manager;

public class AnnotationApp {

	public static void main(String[] args) {
		
		Manager mRef1 = new Manager(null, "John", 10, 57000, "john@example.com");
		Manager mRef2 = new Manager(null, "Fionna", 12, 67000, "fionna@example.com");

		// Hibernate API's
		AnnotationConfiguration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new AnnotationConfiguration();
			config.configure(); // Reading hibernate.cfg.xml file
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession(); // connection with DB
			
			transaction = session.beginTransaction();
			
			session.save(mRef1);
			session.save(mRef2);
			
			// all other operations are same
			
			transaction.commit();
			
			System.out.println("==hiberntae Transaction Finished==");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(session!=null){
				session.close();
			}
		}

	}

}
