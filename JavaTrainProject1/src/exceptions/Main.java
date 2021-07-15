package exceptions;

public class Main {    
    public static void main(String args[]){      
       // Using try-without-resources  
         try{
        	 MyAutoClosable myAutoClosable = new MyAutoClosable();
               myAutoClosable.doIt();
               if(3>2)
                 throw new Exception("OH no!");
        	 myAutoClosable.close();
          }
         catch(Exception exception){  
              System.out.println(exception);  
          }     
      }      
}  
