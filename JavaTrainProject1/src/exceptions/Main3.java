package exceptions;

public class Main3 {    
    public static void main(String args[]){      
       // Using try-with-resources  
         try(MyAutoClosable myAutoClosable = new MyAutoClosable()){
               myAutoClosable.doIt();
               if(3>2)
                 throw new Exception("OH no!");
          }
         catch(Exception exception){  
              System.out.println(exception);  
          }     
      }      
}  
