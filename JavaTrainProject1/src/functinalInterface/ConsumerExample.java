package functinalInterface;

//import java.util.function.Consumer;
//
//public class Main {
//	void fn(int x) {
//		x=x*x;
//		System.out.println("Consumer function1 gives: " + x);	
//	}
//	void fn2(int x) {
//		x=x+x;
//		System.out.println("Consumer function2 gives: " + x);	
//	}
//	
//	void fun(Consumer<Integer> c) {
//		c.accept(100);
//	}
//   public static void main(String args[]) {
//       Consumer<Integer> c= new Main()::fn;
//       Consumer<Integer> c2= new Main()::fn2;
//       new Main().fun(c);  //10000
//   }
//}
//import java.util.function.*;
//
//public class Main {
//	int fn() {
//		int x=10;
//		x=x*x;
//		System.out.println("Supplier function1 gives: " + x);
//		return x;
//	}
//	int fn2() {
//		int x=10;
//		x=x+x;
//		System.out.println("Supplier function2 gives: " + x);
//		return x;
//	}
//	static void fun(Supplier<Integer> s) {
//		System.out.println(s.get()); //fn(x) /fn2(x)
//	}
//   public static void main(String args[]) {
//      Supplier<Integer> s=new Main() :: fn2;
//       fun(s);  
//   }
//}

//import java.util.function.*;
//
//public class Main {
//	Boolean fn(int x) {
//		return x>7;
//	}
//	static void fun(Predicate<Integer> p, int x) {
//		System.out.println(p.test(x)); //fn(x) /fn2(x)
//	}
//   public static void main(String args[]) {
//      Predicate<Integer> p=new Main() :: fn;
//      fun(p, 10); //true
//      fun(p, 3); //false
//   }
//}


import java.util.function.*;

public class ConsumerExample {
//	Integer fn(String x) {
//		return x.length();
//	}
//	static void fun(Function<String, Integer> f, String x) {
//		System.out.println(f.apply(x)); //fn(x) /fn2(x)
//	}
 public static void main(String args[]) {
    BiFunction<Integer, Integer, Integer> add = (a,b) -> a+b;
    BiFunction<Integer, Integer, Integer> sub = (a,b) -> a-b;
    BiFunction<Integer, Integer, Integer> mul = (a,b) -> a*b;
    BiFunction<Integer, Integer, Integer> div = (a,b) -> (b==0?0:a/b);
    System.out.println(add.apply(10,5));
    System.out.println(sub.apply(10,5));
    System.out.println(mul.apply(10,5));
    System.out.println(div.apply(10,5));
 }
}

//import java.util.*;
//import java.util.function.Consumer;
//public class ConsumerExample{
//  public static void main(String args[]){
//  Consumer<Integer> consumer= i-> System.out.print(" "+i);
//  Consumer<Integer> consumerWithAndThen = consumer.andThen( i-> System.out.print("(printed "+i+")"));
//  List<Integer> integerList=Arrays.asList(1, 10, 200, 101, -10, 0);
//  printList(integerList,consumerWithAndThen);
// }
//  public static void printList(List<Integer> listOfIntegers, Consumer<Integer> consumer){
//	  for(Integer integer:listOfIntegers){
//	   consumer.accept(integer);
//	  }
//	 }
//	}













