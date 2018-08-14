package com.auribises.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.auribises.model.Employee;

public class App {

	public static void main(String[] args) {
		
		/*Employee emp1 = new Employee();
		emp1.setName("Sia");
		emp1.setEmail("sia@example.com");
		emp1.setSalary(37500);
		emp1.setDept("Admin");
		
		Employee emp2 = new Employee(null, "Kia", 47000, "kia@example.com","R&D");
		
		System.out.println(emp1);
		System.out.println(emp2);*/
		
		// Hibernate API's
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new Configuration();
			config.configure(); // Reading hibernate.cfg.xml file
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession(); // connection with DB
			
			transaction = session.beginTransaction();
			
			// Insert Operation
			//session.save(emp1);
			//session.save(emp2);
			
			// Retrieve Operation
			//Employee emp = (Employee)session.get(Employee.class, 5);
			//System.out.println(emp);
			
			// Update Operation
			//emp.setName("Sia Flynn");
			//emp.setEmail("sia.f@example.com");
			//emp.setSalary(57500);
			//session.update(emp);
			
			// Delete Operation
			//Employee emp = new Employee();
			//emp.setId(2);
			
			//session.delete(emp);
			
			// Retrieve All
			// 1. HQL | Hibernate Query Language
			/*String hql = "From Employee"; // From Employee where salary > 50000
			List<Employee> employees = session.createQuery(hql).list();
			for(Employee emp : employees){
				System.out.println(emp);
			}*/
			
			// 2. Criteria API
			Criteria criteria = session.createCriteria(Employee.class);
			criteria.add(Restrictions.gt("salary", 40000));
			List<Employee> employees = criteria.list();
			for(Employee emp : employees){
				System.out.println(emp);
			}
			
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
