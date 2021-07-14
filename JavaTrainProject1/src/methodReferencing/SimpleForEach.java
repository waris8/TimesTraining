package methodReferencing;

//The following code segment shows how to print 10 random numbers using forEach.

import java.util.*;
import java.util.function.*;
public class SimpleForEach {
   public static void main(String[] args) {
      Random random = new Random();
  random.ints().limit(10).forEach(e->System.out.println(e));
}
}
