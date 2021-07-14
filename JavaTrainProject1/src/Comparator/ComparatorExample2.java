package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample2 {
	public static void main(String args[]) {
		List<Emp> list = new ArrayList<Emp>();
		list.add(new Emp("Ram", 23));
		list.add(new Emp("Rohan", 22));
		list.add(new Emp("Roy", 30));
		list.add(new Emp("Tom", 24));
		Collections.sort(list);// Sorts the array list
for (Emp a : list)
			System.out.print(a.name + ", ");
		
	}
}

