package first;

/*public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
	}

}*/
/*public class Prj1Class {
	public static void main(String[] args) {
		Mammals m1=new Mammals();
		m1.hand_bones(); //not sure of the type
		Mammals m2 =new Humans();
		m2.hand_bones(); //not flying away does work
		Mammals m3 = new Bats();
		m3.hand_bones();
			
	}
}*/
/*public class Prj1Class {
	public static void main(String[] args) {
		Framework f=new Framework();
		Mammals m1=new Mammals();
		f.work(m1);
		Mammals m2 =new Humans();
		f.work(m2);
		Mammals m3 = new Bats();
		f.work(m3);
			
	}
}*/
public class Prj1Class {
	public static void main(String[] args) {
//		Empl e1=new Empl();
//		Empl e2=new Empl(5000);
	}
}
class Empl { 
	int sal;
	public Empl() {
		sal = 0;
		System.out.println("Default constructor in Employee with sal : " + sal);
	}
	public Empl(int s) {
		sal=s;
		System.out.println("Parameterized Constructor in Employee for initialising attribute sal : "+ sal);
	}
}

