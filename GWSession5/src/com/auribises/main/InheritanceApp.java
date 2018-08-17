package com.auribises.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.auribises.model.LEDTV;
import com.auribises.model.Product;
import com.auribises.model.TV;

public class InheritanceApp {

	public static void main(String[] args) {
		
		Product product = new Product(null,"iPhoneX",80000);

		TV tv = new TV(50,"Samsung");
		tv.setName("QTV");
		tv.setPrice(60000);
		 
		LEDTV ledTv = new LEDTV();
		ledTv.setName("Curved LED TV");
		ledTv.setScreenSize(55);
		ledTv.setWattage(20);
		ledTv.setCompany("Samsung");
		ledTv.setPrice(70000);
		ledTv.setType("Curved LED");
		
		
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		// Create your own HibernateHelper the way we created JDBCHelper
		
		try {
			
			config = new Configuration();
			config.configure();
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession();
			
			transaction = session.beginTransaction();
			
			session.save(product);
			session.save(tv);
			session.save(ledTv);
			
			transaction.commit();
			System.out.println("==Transaction Finished==");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(session!=null)
				session.close();
		}
		

	}

}
