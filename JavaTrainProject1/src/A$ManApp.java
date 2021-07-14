

//class A { // javac generates A.class
//	public void outerPrint() {
//		System.out.println("I am inside Class A");
//	}
//
//	class B { // javac generates A$B.class
//		public static void print() {
//			System.out.println("I am inside static inner Class A.B");
//		}
//	}
//	
//	public static class MainApp { //java MainApp -> run -> MainApp.main(String[]);
//		static {
//			System.out.println("Static block: called even before main(static method)");
//		}
//	  void add(int a)
//	  {
//		  System.out.println(a+a);
//	  }
//	  public static void main(String[] args) {
//			A a=new A();
//			a.outerPrint();
////			A.B b=new A.B();
//			A.B.print();
//		}
//
//	}
//			
//
//}

class A { 
	public void outerPrint() {
		System.out.println("I am inside Class A");
	}

	public static class ManApp { //inner Main class: A$MainApp.class

		public static void main(String[] args) { //inner class main()
			A a = new A();
			a.outerPrint();
		}

	}
}
