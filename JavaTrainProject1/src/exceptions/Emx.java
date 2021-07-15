package exceptions;

import java.util.List;

//public class Employee {
//	String EmpName;
//	int EmpAge;
//	List<String> list;
//	
//	public Employee(String name, int age) {
//		EmpName = name;
//		EmpAge = age;
//		list.add(name);
//		}
//	public void validate(int age, String name) throws exception{
//		if(age<18) {
//			throw new IOException("children not allowed as employee");
//		}
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

import java.util.HashMap;

class EmpNameException extends Exception {
	EmpNameException(String s) {
		super(s);
	}
}
class EmpAgeException extends Exception {
	EmpAgeException(String s) {
		super(s);
	}
}

class Employee {
	HashMap<String, Integer> map;

	public Employee() {
		map = new HashMap();
	}

	void addEmp(String name, Integer age) throws Exception {
		if (map.containsKey(name)) {
			throw new EmpNameException("Name already taken");
		} 
		
			if (age < 0)
				throw new EmpAgeException("Ghost not allowed");
			else if (age < 18)
				throw new EmpAgeException("Children are not allowed as Employees");
			else if (age > 100)
				throw new EmpAgeException("Purvaj are not allowed as Employees");
			else if (age>60 && age <  100)
				throw new EmpAgeException("Seniors are not allowed as Employees");
		 else {
			map.put(name, age);
		}
	}
}

public class Emx {

	public static void main(String[] args) {
		Employee obj = new Employee();
		try {
			obj.addEmp("a", 5);
			obj.addEmp("b", 30);
			obj.addEmp("c", -4);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
