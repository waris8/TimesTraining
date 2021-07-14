package functinalInterface;

public class Main2 {
	int fn(Integer a) {
		int x=100;
		int y=1;
		int z;
		try {
			
			z=x/y;
		}
		catch(ArithmeticException e) {
			return x;
		}
		finally {
			System.out.println("a became 0");
			a=10;
		}
		System.out.println("a became 10");
		a=10;
		return z;
		
	}
	public static void main(String args[]) {
		Integer a=2;
		int x=new Main2().fn(a);
		System.out.println("Value of x(Return value of fn(): "+x+"\n Value of resource a : "+a);
		
System.out.println("rest of the code...");
	}
}
