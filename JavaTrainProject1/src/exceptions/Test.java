package exceptions;

//import java.io.*;
//public class Test  {
//  public static void main(String[] args) {
//    try {
//        String str;
//       //opening file in read mode using BufferedReader stream
//        BufferedReader br=new BufferedReader(new FileReader("/Users/gulam.waris/gulam.txt"));
//        while((str=br.readLine())!=null) {
//                 System.out.println(str);
//         }
//         br.close();	//closing BufferedReader stream
//     }catch(IOException ie)
//     {  System.out.println("exception");  }
//   }
//}
import java.io.*;
class Test {
  public static void main(String[] args) {
     try(BufferedReader br=new BufferedReader(new FileReader("/Users/gulam.waris/gulam.txt")))         {
            String str;
            while((str=br.readLine())!=null)   {
                   System.out.println(str);
//                   throw new IOException();
             }
      }
     catch(IOException ie)
     {  System.out.println("exception");  }
  }
}
