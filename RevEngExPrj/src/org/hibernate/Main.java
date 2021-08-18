package org.hibernate;

import java.util.Scanner;

//import com.hibernate.Doctor;
//import com.hibernate.HibernateUtil;
//import com.hibernate.Patient;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("welcome to dbms ");
//		System.out.println("please enter patient name: ");
//		String name = sc.next();
//		System.out.println("please enter patient's age: ");
//		int age = sc.nextInt();
//		System.out.println("please enter patient's address: ");
//		String address = sc.next();
//		System.out.println("please enter disease name: ");
//		String disease = sc.next();
//		Patient p = new Patient();
//		p.setAddress(address);
//		p.setAge(age);
//		p.setName(name);
//		p.setDisease(disease);
//		Doctor d = new Doctor();
//		d.setName("doctor1");
//		d.getPatients().add(p);
//		p.setDoctor(d);
		System.out.println("please enter name");
		String name = sc.next();
//		System.out.println("please enter id");
//		int id = sc.nextInt();
		System.out.println("please enter course");
		String course = sc.next();
		System.out.println("please enter fees");
		int fees = sc.nextInt();
		AllRequiredId d = new AllRequiredId();
		d.setCourse(course);
		d.setFees(fees);
//		d.setId(id);
		d.setName(name);
		
		 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	     Session session = sessionFactory.openSession();
	     session.beginTransaction();
	     session.save(d);
	     session.getTransaction().commit();
	     session.close();
	     sessionFactory.close();
	}

}
