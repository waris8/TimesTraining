package methodReferencing;

//import java.util.*;
//import java.util.*;
//import java.util.stream.Collectors;
//public class hh {
//	public static void main(String[] args) {
//		System.out.println("The stream after applying the function is : ");
//		List<String> list = Arrays.asList("java", "world", "j", "a", "v", "a");
//		// Using Stream map(Function mapper) to convert the Strings in stream to
//		// UpperCase form
//		List<String> l= list.stream().map(String::toUpperCase).distinct().collect(Collectors.toList());	
//		System.out.println(l);
//	}
//}
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class JavaForEachListFilter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//get list of unique squares
//List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
// System.out.println(squaresList);
        Integer var = numbers.stream().min(Integer::compare).get();
        System.out.println("min is: " + var);
        Integer v = numbers.stream().max(Integer::compare).get();
        System.out.println("max is: " + v);
        Integer sum = numbers.stream()
        		  .collect(Collectors.summingInt(Integer::intValue));
        System.out.println("sum is: " + sum);
        
        System.out.println("avg is: " + sum/numbers.size());
    }
}

//import java.util.stream.*;
//import java.util.*;
//import java.util.function.*;
//public class JavaForEachListFilter {
//   public static void main(String args[]) {
//      Stream<String> words = Stream.of("lower", "case", "text");
//List<String> list = words
//    .peek(s -> System.out.println(s))
//    .map(s -> s.length())
//    .collect(Collectors.toList());
//System.out.println(list);
//   }
//}

//import java.util.stream.*;
//import java.util.*;
//import java.util.function.*;
//class A5{
//	public static void fn(String s) {
//		s="Hello "+ s;
//		System.out.println(s);
//	}
//}
//public class JavaForEachListFilter {
//   public static void main(String args[]) {
//      Stream<String> words = Stream.of("lower", "case", "text");
//List<String> list = words
//    .map(String :: toLowerCase)
//    .collect(Collectors.toList());
//System.out.println(list);
//   }
//}

//import java.util.ArrayList;
//import java.util.stream.*;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//public class SimpleStream2 {
//   public static void main(String args[]) {
//      List<String> list = Arrays.asList("Java", "is", "not", "great", "now");
//list.stream()
//    .filter(s -> !s.startsWith("n"))
//    .map(String::toUpperCase)
//    .forEach(s -> System.out.print(s + " "));
//   }
//}

//import java.util.ArrayList;
//import java.util.List;
//public class JavaForEachListFilter {
//    public static void main(String[] args) {
//        List<String> items = new ArrayList<>();
//
//        items.add("coins");
//        items.add("pens");
//        items.add("keys");
//        items.add("sheets");
//        items.add("");
//
//        long c = items.stream().filter(item -> (item.length() == 0)).count();
//        System.out.println(c);
//    }
//}

//import java.util.stream.*;
//class A0 {
//	public static void fn(String s) {
//		s = "Hello " + s;
//		System.out.println(s);
//	}
//}
//
//public class JavaForEachListFilter {
//	public static void main(String args[]) {
//		Stream<String> words = Stream.of("lower", "case", "text", "Java", "Prg");
//		long c = words.peek(A0::fn).map(String::length).peek(System.out::println).count();
//		System.out.println("The number of Elements : " + c);
//	}
//}

//import java.util.*;
//
//public class JavaForEachListFilter {
//	public static void main(String args[]) {
//		List<String> gadgets = new ArrayList<>();
//		gadgets.add("SmartPh");
//		gadgets.add("SmartWatch");
//		gadgets.add("SmartTV");
//		gadgets.add("iPhone");
//		// using lambda expression and stream methods
//		String item = gadgets.stream().peek(s -> System.out.println("processing: " + s)).filter(s -> s.length() > 8)
//				.findFirst().orElse("");
//		System.out.println("In Java 8, first item: " + item);
//	}
//}

//import java.util.stream.*;
//import java.util.*;
//import java.util.function.*;
//public class JavaForEachListFilter {
//   public static void main(String args[]) {
//      Stream<String> words = Stream.of("lower", "case", "text");
//List<String> list = words
//    .peek(s -> System.out.println(s))
//    .map(s -> s.toUpperCase()).sorted()
//    .collect(Collectors.toList());
//System.out.println(list);
//   }
//}

//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//public class JavaForEachListFilter {
//  public static void main(String[] args) {
//    List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");
//    System.out.println("original list: " + numbers);
//List<Integer> even = numbers.stream().map(s -> Integer.valueOf(s))
//           .filter(number -> number % 2 == 0).collect(Collectors.toList());
//    System.out.println("processed list, only even numbers: " + even);
//String even2 = numbers.stream().map(s -> Integer.valueOf(s))
//           .filter(number -> number % 2 == 0).map(s->s.toString()).collect(Collectors.joining(", "));
//    System.out.println("processed list, only even numbers: " + even2);
//
//  }
//}

//import java.util.DoubleSummaryStatistics;
//import java.util.stream.DoubleStream;
//public class SimpleStat {
//	public static void main(String[] args) {
//		System.out.println("---DoubleSummaryStatistics---");		
//		DoubleSummaryStatistics dstats = DoubleStream.of(5.33d,2.34d,5.32d,2.31d,3.51d).
//				collect(DoubleSummaryStatistics::new, DoubleSummaryStatistics::accept, DoubleSummaryStatistics::combine);
//System.out.println("Max:"+dstats.getMax()+", Min:"+dstats.getMin());
//		System.out.println("Count:"+dstats.getCount()+", Sum:"+dstats.getSum());
//		System.out.println("Average:"+dstats.getAverage());	
//}
//}
















