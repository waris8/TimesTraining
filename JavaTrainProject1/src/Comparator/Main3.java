package Comparator;

interface Z{
	void fn(int x,String s);
}

//public class Main3{
//	public static void main(String[] arg)
//	{
//		Z a = () -> System.out.println("Hello");	
//		
//		a.fn();
//		
//	}
//}
//interface A{ //case 1
//	void fn(int x,String s);
//}

class Main3{
	public static void main(String[] arg)
	{
		//A a = (int x) -> System.out.println("Hello" + x);	
		Z a = (y,z) -> System.out.println("Hello" + (y*10) + z);	
		a.fn(10,"Hi");
		
	}
}
