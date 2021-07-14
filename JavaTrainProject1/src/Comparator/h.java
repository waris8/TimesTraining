package Comparator;

interface Q{
	void fn();
	void fn2();
}
class Main{
	public static void main(String[] arg)
	{
		Q b=new Q(){                              //class Main$1 implements A
			public void fn() {
				System.out.println("Hello");
			}
			public void fn2() {
				System.out.println("Hello2");
			}
			
		};
		
		b.fn();
	}
}
