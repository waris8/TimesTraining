package first;

public class MainApp { //java MainApp -> run -> MainApp.main(String[]);
	static {
		System.out.println("Static block: called even before main(static method)");
	}
  void add(int a)
  {
	  System.out.println(a+a);
  }
  public static void main(String[] args) {
		A a=new A();
		a.outerPrint();
//		A.B b=new A.B();
		A.B.print();
	}

}
