package first;

//class A{  
//	public static boolean palindromeCheck(StringBuilder s) {
////		boolean result;
//		for(int i=0;i<s.length()/2;i++) {
//			if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
//				return false;
//			}
//		}
//		return true;
//	}
//	
//	public static boolean palindromeCheck(String s) {
////		boolean result;
//		for(int i=0;i<s.length()/2;i++) {
//			if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
//				return false;
//			}
//		}
//		return true;
//	}
//	
//	public static boolean palindromeCheck(StringBuffer s) {
////		boolean result;
//		for(int i=0;i<s.length()/2;i++) {
//			if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
//				return false;
//			}
//		}
//		return true;
//	}
//	
//	public static void main(String args[]){  
//		StringBuilder sb=new StringBuilder("Hello ");  
//		sb.append("Java");//now original string is changed  
//		System.out.println(sb);//prints Hello Java for sb=“Hello” 
//		sb.insert(1,"Java");//now original string is changed  
//		System.out.println(sb);//prints HJavaello for sb=“Hello”
//		sb.replace(1,3,"Java");  
//		System.out.println(sb);//prints HJavalo for sb=“Hello”
//		sb.delete(1,3);  
//		System.out.println(sb);//prints Hlo for sb=“Hello”
//		sb.reverse();  
//		System.out.println(sb);//prints olleH for sb=“Hello”
//		
//		System.out.println(palindromeCheck(sb));
//	}  
//}  

//class A{
//	static {
//		System.out.println("Static block initializer called");
//	}
//	int x;
//	{
//		System.out.println("Initializer called");
//		x=10;
//	}
//	public void display() {
//		System.out.println("Value of x: "+x);
//	}
//	public static  void display2() {
//		System.out.println("static method");
//	}
//}
public class A { // javac generates A.class
	public void outerPrint() {
		System.out.println("I am inside Class A");
	}

	class B { // javac generates A$B.class
		public static void print() {
			System.out.println("I am inside static inner Class A.B");
		}
	}
	
	public static class MainApp { //java MainApp -> run -> MainApp.main(String[]);
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
//			A.B b=new A.B();
			A.B.print();
		}

	}
			

}
