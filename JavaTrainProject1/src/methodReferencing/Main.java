package methodReferencing;

//import java.util.Random;
//
//interface A
//{
//	int fn(int x);
//}
//class B{ //existing class
//	int print(int x) {
//		System.out.println("This is a printing process");
//		return x*x;
//	}
//}
//class C{ //static method
//	static int display(int x) {
//		System.out.println("This is a displaying process");
//		return (int) new Random().nextInt(10-1) + 1;
//	}
//}
//public class Main{
//	static void api(A a) {
//		System.out.println(a.fn(100));
//	}
//	public static void main(String[] ar) {
//		A a1=new B() :: print; //instance method
//		A a2= C :: display;  //static
//		A a3= Integer :: numberOfTrailingZeros; //arbitrary Object
//		//static int	numberOfTrailingZeros(int i)
//		//Returns the number of zero bits following the lowest-order ("rightmost") 
//		api(a1); //a1.fn()->b.print()
//		api(a2);  //a2.fn() -> C.display()
//		
//api(a3); //a3.fn()-> Integer.numberOfTrailingZeros()
//	}
//}

//interface A
//{
//	void fn(int x);
//}
//class B{ //case 4: constructor reference
// B(int x){
//	 System.out.println("Inside the constructor" +  x);
// }
//}
//	
//public class Main{
//	
//	public static void main(String[] ar) {
//		A a = B :: new;
//		a.fn(10);
//	}
//}

//interface A
//{
//	String fn(String s);
//}
//interface B{
//	int fn2(int x);
//}
//
//public class Main{
//	
//	public static void main(String[] ar) {
////		
////		System.out.println(new String("Java").toUpperCase()); //String object calls toUppercase() : non static function of arbitrary object
////		//signature: String toUpperCase(){}
////		System.out.println(Integer.numberOfTrailingZeros(1000)); //Integer calls numberOfTrailingZeros(): Static function of arbitrary object
////		//signature: static int numberOfTrailingZeros(int){}
//		
//		A a = String :: toUpperCase;
//		B b = Integer :: numberOfTrailingZeros;
//		
//		System.out.println(a.fn("Java"));
//		
//		System.out.println(b.fn2(100));
//		
//		
//	}
//}

//interface A{
//	int fn(int x, int y);
//}
//class Add{
//	static int add(int x, int y){
//		return x+y;
//	}
//}
//class Sub{
//	static int sub(int x, int y){
//		return x-y;
//	}
//}
//class Mul{
//	static int mul(int x, int y){
//		return x*y;
//	}
//}
//class Div{
//	static int div(int x, int y){
//		if(y!=0) {return x/y;}
//		return 0;
//	}
//}
//public class Main{
//	public static void main(String[] args) {
//		A a = Add :: add;
//		A s = Sub :: sub;
//		A m = Mul :: mul;
//		A d = Div :: div;
//		System.out.println(a.fn(10,5));
//		System.out.println(s.fn(10,5));
//		System.out.println(m.fn(10,5));
//		System.out.println(d.fn(10,5));
//	}
//}
interface A
{
	String fn(String s); //SAM
	default void print(String s) {
		show();
		System.out.println("The String: "+ s);
	}
	private void show() {
		System.out.println("This is private method");
	}
}
public class Main{
	
	public static void main(String[] ar) {
		A a=String :: toUpperCase;
		a.print(a.fn("Java"));

	}
}







