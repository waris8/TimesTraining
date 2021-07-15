package javaIO;

//import java.io.IOException;
//import java.nio.file.*;
//public class PathFileNIO2 {
//	 public static void main(String[] args) {
//		 Path sourcePath = Paths.get("test.txt");
//		 Path destinationPath = Paths.get("test-copy.txt");
//		 try {
//		     Files.copy(sourcePath, destinationPath);
//		     System.out.println("Done");
//		 } catch(Exception e) { }
//    }	}

import java.nio.file.*;

public class PathFileNIO2 {
	public static void main(String[] args) {
		Path sourcePath = Paths.get("test.txt");
		Path destinationPath = Paths.get("test-copy.txt");
		try {
			Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("Done");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
