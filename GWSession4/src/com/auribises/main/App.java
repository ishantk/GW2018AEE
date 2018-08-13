package com.auribises.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.auribises.model.Employee;

public class App {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setName("Mike");
		emp1.setEmail("mike@example.com");
		emp1.setSalary(37500);
		emp1.setDept("HR");
		
		Employee emp2 = new Employee(null, "Leo", 47000, "leo@example.com","R&D");
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		// Hibernate API's
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new Configuration();
			config.configure(); // Reading hibernate.cfg.xml file
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession();
			
			transaction = session.beginTransaction();
			
			session.save(emp1);
			session.save(emp2);
			
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
