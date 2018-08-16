package com.auribises.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.auribises.model.Certificate;
import com.auribises.model.Manager;

public class OneToManyApp {

	public static void main(String[] args) {
		
		Certificate c1 = new Certificate();
		c1.setName("AWS");
		
		Certificate c2 = new Certificate();
		c2.setName("CCNA");
		
		Certificate c3 = new Certificate();
		c3.setName("OCJP");
		
		Certificate c4 = new Certificate();
		c4.setName("OCWD");
		
		Certificate c5 = new Certificate();
		c5.setName("CCNP");
		
		
		List<Certificate> list1 = new ArrayList<Certificate>();
		List<Certificate> list2 = new ArrayList<Certificate>();
		
		list1.add(c1); //0
		list1.add(c2); //1
		list1.add(c3); //2
		
		list2.add(c4); //0
		list2.add(c5); //1
		
		Manager mRef1 = new Manager();
		Manager mRef2 = new Manager();
		
		mRef1.setName("John Watson");
		mRef1.setExp(10);
		mRef1.setCertificates(list1);
		
		mRef2.setName("Fionna Flynn");
		mRef2.setExp(12);
		mRef2.setCertificates(list2);
		
		
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
			
			//session.save(mRef1);
			//session.save(mRef2);
			
			Manager mgr = (Manager)session.get(Manager.class, 2);
			System.out.println(mgr);
			
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
