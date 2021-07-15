package javaIO;

import java.io.IOException;
import java.nio.file.*;
public class PathFileNIO {
	 public static void main(String[] args) {
    	String dirPath ="/Users/gulam.waris/NIO/hh";
        // Check If Directory Already Exists Or Not?
        Path dirPathObj = Paths.get(dirPath);
        boolean dirExists = Files.exists(dirPathObj);
        if(dirExists) {
            System.out.println("! Directory Already Exists !");
        } else {
            try {
                // Creating The New Directory Structure
                Files.createDirectories(dirPathObj);
                System.out.println("! New Directory Successfully Created !");
            } catch (IOException ioExceptionObj) {
                System.out.println("Problem While Creating The Directory Structure: " + ioExceptionObj.getMessage());
            }
        }
    }	}
