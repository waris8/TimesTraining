package exceptions;

class MyAutoClosable implements AutoCloseable {
    public void doIt() {
        System.out.println("MyAutoClosable doing it!");
    }
    public void close() {
        System.out.println("MyAutoClosable closed!");
    }
}
public class Main2 {    
    public static void main(String args[]){      
       // Using try-with-resources  
         try(MyAutoClosable myAutoClosable = new MyAutoClosable()){
               myAutoClosable.doIt();
          } 
      }      
}  
