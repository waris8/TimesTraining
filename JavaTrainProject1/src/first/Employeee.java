package first;

import java.util.Scanner;

public class Employeee {
	String name;
	static int count;
	public Employeee(String s) {
		name = s;
		count++;
	}
	
	public static int displayCount() {
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		Scanner sc = new Scanner(System.in);
		while(true) {
			if(sc.nextLine().equals("exit")) {
				System.out.println("exit");
				break;
			}
			String name = sc.nextLine();
			Employeee e = new Employeee(name);
			System.out.println(e.name);
			System.out.println(Employeee.displayCount());
		}
	}

}
