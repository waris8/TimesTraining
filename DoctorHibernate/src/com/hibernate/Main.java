package com.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
	public static void main(String[] args) {
//		StudentAddress studentAddress = new StudentAddress();
//	     studentAddress.setAddress("Delhi, India");
//	     Student student1 = new Student();
//	     student1.setStudent_name("AAA1");
//	     student1.setStudentAddress(studentAddress);
//	     Student student2 = new Student();
//	     student2.setStudent_name("AAA2");
//		 student2.setStudentAddress(studentAddress);
//	     (studentAddress.getStudents()).add(student1);
//	     (studentAddress.getStudents()).add(student2);
//	     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//	     Session session = sessionFactory.openSession();
//	     session.beginTransaction();
//	     session.save(studentAddress);
//	     session.getTransaction().commit();
//	     session.close();
//	     sessionFactory.close();
		Scanner sc = new Scanner(System.in);
		
			System.out.println("welcome to dbms ");
			System.out.println("please enter patient name: ");
			String name = sc.next();
			System.out.println("please enter patient's age: ");
			int age = sc.nextInt();
			System.out.println("please enter patient's address: ");
			String address = sc.next();
			System.out.println("please enter disease name: ");
			String disease = sc.next();
			Patient p = new Patient();
			p.setAddress(address);
			p.setAge(age);
			p.setName(name);
			p.setDisease(disease);
			Doctor d = new Doctor();
			d.setName("doctor1");
			d.getPatients().add(p);
			p.setDoctor(d);
			 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		     Session session = sessionFactory.openSession();
		     session.beginTransaction();
		     session.save(d);
		     session.getTransaction().commit();
		     session.close();
		     sessionFactory.close();
			
		
	
	}
}
//WAP in Java using Hibernate API to implement Patients Database management system.
//The program should be menu driven, able to perform CRUD operations on the Patients table created in the MySQL DB.
//Information required: Patient name, age, address, disease details, payment details, doctor details. Please add more information if necessary.
//Mappings:
//One doctor – many patients
//Many patients – one doctor