package generics;

public class Employee<T> {
	T EmpName;
	int EmpId;

	public Employee(T empName, int empId) {
		super();
		EmpName = empName;
		EmpId = empId;
	}

	public T getEmpName() {
		return EmpName;
	}

	public void setEmpName(T empName) {
		EmpName = empName;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public void showEmployee() {
		System.out.println("employeeName: " + EmpName + "  employeeId: " + EmpId);
	}
	
	public String toString() {
		return EmpId + " " + EmpName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee<String> e = new Employee<String>("john", 123);
		e.showEmployee();
	}

}
