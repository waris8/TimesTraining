package generics;

//import java.util.Scanner;
import java.util.Stack;

public class Compiler {
	Stack<String> curly = new Stack<>();
	Stack<String> square = new Stack<>();
	Stack<String> circle = new Stack<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
		Compiler c = new Compiler();
		String str = "import java.util.*; class JavaExample{  \n"
				+ "		  public static void main(String args[]){  \n"
				+ "		     ArrayList<String> alist=new ArrayList<String>();  \n"
				+ "		     alist.add(\"Gregor Clegane\");  \n" + "		     alist.add(\"Khal Drogo\");  \n"
				+ "		    //iterating ArrayList\n" + "		     for(String str:alist)  \n"
				+ "		        System.out.println(str);  \n" + "		     }  \n" + "		}\"\" ";
		for (int i = 0; i < str.length(); i++) {
			String token = str.substring(i, i + 1);
			if (token.equals("{")) {
				c.curly.push(token);
			}
			if (token.equals("(")) {
				c.circle.push(token);
			}
			if (token.equals("[")) {
				c.square.push(token);
			}
			if (token.equals("}")) {
				c.curly.pop();
			}
			if (token.equals(")")) {
				c.circle.pop();
			}
			if (token.equals("]")) {
				c.square.pop();
			}
		}
		if (c.curly.isEmpty() && c.circle.isEmpty() && c.square.isEmpty()) {
			System.out.println("compiled successfully");
		} else {
			System.out.println("error");
		}
	}

}
