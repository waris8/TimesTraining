package Comparator;

import java.util.ArrayList;
import java.util.List;

public class LibNonGeneric {
	
	List<String> book;
	List<String> video;
	List<String> newspaper;
	
	public LibNonGeneric() {
		this.book = new ArrayList<>();
		this.video = new ArrayList<>();
		this.newspaper = new ArrayList<>();
	}
	
	public void add_book(String b) {
		book.add(b);
	}
	public void add_video(String b) {
		video.add(b);
	}
	public void add_newspaper(String b) {
		newspaper.add(b);
	}
	public void get_book(String b) {
		book.remove(b);
	}
	public void get_video(String b) {
		video.remove(b);
	}
	public void get_newspaper(String b) {
		newspaper.remove(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibNonGeneric library = new LibNonGeneric();
		library.add_book("aa");
		library.add_newspaper("the");
		library.add_video("vid");
		System.out.println(library.book.toString());
		System.out.println(library.video.toString());
		System.out.println(library.newspaper.toString());
	}

}
