package generics;

import java.util.Vector;

public class ListOfEmployees {
	Vector<Employee> v;
	public ListOfEmployees() {
		v = new Vector<>();
	}
	public void add(Employee e) {
		v.add(e);
		System.out.println(v);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListOfEmployees l = new ListOfEmployees();
		Employee e = new Employee<String>("gg", 3);
		l.add(e);
	}

}
