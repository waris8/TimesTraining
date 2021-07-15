package javaIO;

import java.io.*;
import java.util.Scanner;

public class FileReadWrite {
	public static void main(String args[]) throws IOException {
		File file = new File("Name_collection.txt");
		// creates the file
		file.createNewFile();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Run: ");
			String s = sc.nextLine();
			long time = System.currentTimeMillis();
			System.out.println("Hello " + s);
			FileWriter writer = new FileWriter(file, true);
			writer.write(s + " Login time " + time + "\n");
			writer.flush();
			writer.close();
		}

	}
}


//exercise for collecting the login name and time in a file "name_collector"
