package com.auribises.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.auribises.model.Address;
import com.auribises.model.Person;

public class App {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.setName("John");
		person.setEmail("john@example.com");
		person.setAge(30);
		person.setPhone("+91 99999 77777");
		
		Address address = new Address();
		address.setAdrsLine("Country Homes");
		address.setCity("Ludhiana");
		address.setState("Punjab");
		address.setZipCode(141001);

		person.setAddress(address);
		address.setPerson(person);
		
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
			
			session.save(person);
			
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
