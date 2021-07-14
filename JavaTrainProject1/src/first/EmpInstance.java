package first;

public class EmpInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee a = new WagesEmployee();
		Employee b = new SalEmployee();
		System.out.println(a.getPaidAmount());
		System.out.println(b.getPaidAmount());
	}

}
