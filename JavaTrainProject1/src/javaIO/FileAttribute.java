package javaIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class FileAttribute {

	public static void main(String[] args) {
		Path sourcePath = Paths.get("test.txt");

		try {
			if (!Files.isReadable(sourcePath))
				System.out.println("Error");
			else {
				BasicFileAttributes ab = Files.readAttributes(sourcePath, BasicFileAttributes.class);
				System.out.println("Creation time " + ab.creationTime());
				System.out.println("Size " + ab.size());
				System.out.println("Last Access time " + ab.lastAccessTime());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

