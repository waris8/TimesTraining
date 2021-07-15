package javaIO;

import java.io.File;
public class CreateDir {

   public static void main(String args[]) {
      String dirname = "/Users/gulam.waris/git_training_times/javadir/eclipse/gulam";
      File d = new File(dirname);
      
      // Create directory now.
      d.mkdirs();
      System.out.println("Dirs Created ..");
   }
}
