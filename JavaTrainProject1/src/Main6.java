//
//interface A9
//{
//	int fn();
//}
//class B{
//	int print() {
//		System.out.println("This is a printing process");
//		return 10;
//	}
//}
//public class Main6{
//	public static void main(String[] ar) {
//		A9 a=new A9() {
//			public int fn() {
//				return new B().print();
//			}
//		};
//		System.out.println(a.fn());
//	}
//}
//
interface A9
{
	int fn(int x);
}
class B{
	int print(int x) {
		System.out.println("This is a printing process");
		return x*x;
	}
}
class C{
	int display(int x) {
		System.out.println("This is a displaying process");
		return x+x;
	}
}
//public class Main6{
//	static void fnn(A9 a) {
//		System.out.println(a.fn(10));
//	}
//	public static void main(String[] ar) {
//		A9 a1= x -> new B().print(x);
//		
//		A9 a2=new A9() {
//			public int fn(int x) {
//				return new C().display(x);
//			}
//		};
//		fnn(a1); //
//		fnn(a2);
//	}
//}
public class Main6{
	static void fnn(A9 a) {
		System.out.println(a.fn(10));
	}
	public static void main(String[] ar) {
		A9 a1= x -> new B().print(x);
		
		A9 a2= new C() :: display;
		fnn(a1); //
		fnn(a2);
	}
}



