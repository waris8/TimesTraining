package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CreateStudent {
	public static void main(String[] args) {
		// Create student entity object
		Student student = new Student();
		student.setStudentName("Ishu3"); // Ishu1, Ishu3
		student.setRollNumber(02); // 01, 03
		student.setCourse("MCA"); // BE BTech
		// Create session factory object
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		// getting session object from session factory
		Session session = sessionFactory.openSession();
		// getting transaction object from session object
		session.beginTransaction();
		session.save(student);
		System.out.println("Inserted Successfully");
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
