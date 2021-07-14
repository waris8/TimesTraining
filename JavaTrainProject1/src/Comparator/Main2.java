package Comparator;
interface MathOp{
	int operation(int x, int y);
}
//A2 a = x -> x*x;
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOp add = (x,y) -> x+y;
		
		MathOp sub = (x,y) -> x-y;
		
		MathOp mult = (x,y) -> x*y;
		
		MathOp div = (x,y) -> {
			if(y!=0) {return x/y;}
			return 0;
		};
		
		System.out.println(add.operation(21, 43));
		System.out.println(sub.operation(21, 43));
		System.out.println(div.operation(21, 43));
		System.out.println(mult.operation(21, 43));
	}

}
