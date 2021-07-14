
class Test1<T, U> {
    T obj1;  // An object of type T
    U obj2;  // An object of type U
     // constructor
    Test1(T obj1, U obj2)     {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
public void print()     {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
public class Main {
    public static void main (String[] args)     {
        Test1 <String, Integer> obj = new Test1<String, Integer>("Java", 15);
         obj.print();
    }
}
