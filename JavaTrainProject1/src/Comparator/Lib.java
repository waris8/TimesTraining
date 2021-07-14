package Comparator;

import java.util.ArrayList;
import java.util.List;

//book, video, and newspaper
public class Lib<T> {
	List<T> book;
	List<T> video;
	List<T> newspaper;
	
	public Lib() {
		this.book = new ArrayList<>();
		this.video = new ArrayList<>();
		this.newspaper = new ArrayList<>();
	}
	
	public void add_book(T b) {
		book.add(b);
	}
	public void add_video(T b) {
		video.add(b);
	}
	public void add_newspaper(T b) {
		newspaper.add(b);
	}
	public void get_book(T b) {
		book.remove(b);
	}
	public void get_video(T b) {
		video.remove(b);
	}
	public void get_newspaper(T b) {
		newspaper.remove(b);
	}
	
	public static void main(String[] args) {
		Lib<String> library = new Lib<>();
		library.add_book("aa");
		library.add_newspaper("the");
		library.add_video("vid");
		System.out.println(library.book.toString());
		System.out.println(library.video.toString());
		System.out.println(library.newspaper.toString());

	}
	
	
}
