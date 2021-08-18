package com.jpa;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {  
public static void main(String[] args) {  
 	         ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao dao = (EmployeeDao) ctx.getBean("d");

		Employee e = new Employee(101, "Ishu1", 50000); dao.saveEmployee(e);
//		Employee e = new Employee(102, "Ishu2", 350000); dao.saveEmployee(e);
//		Employee e = new Employee(103, "Ishu3", 3500); dao.saveEmployee(e);
		
		//Employee e = new Employee(102, "Ishu4", 550000); dao.updateEmployee(e);
		
		//Employee e=new Employee(); e.setId(103); dao.deleteEmployee(e);
			
		  List<Employee> employeeList = dao.getEmployees();
		  for(Employee g : employeeList) {System.out.println(g);}    
    }  
} 