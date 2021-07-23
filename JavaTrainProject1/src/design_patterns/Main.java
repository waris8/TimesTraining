package design_patterns;

class A{
	int x;
	A(int x){this.x=x;}
	A(){}
	int get() {
		return x;
	}
	void set(int x) {
		this.x=x;
	}
	
}
class prototypeA{
	A a;
	prototypeA(){}
	prototypeA(int x){if(x==10) {a=new A();}else {a = new A(x);}}
	int get() {
		System.out.println("This is the prototype, not the original A class object");
		return a.get();
	}
	void set(int x) {
		a.set(x);
	}
	
}
public class Main {
	public static void main(String args[]) {
		prototypeA a=new prototypeA(10);
		//a.set(10);
		System.out.println(a.get());
	}
}
