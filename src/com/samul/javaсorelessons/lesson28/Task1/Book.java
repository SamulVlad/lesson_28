package com.samul.javaсorelessons.lesson28.Task1;

public class Book {
	String title = "Thinking in Java";
	
	class Author{
		String name = "Bruce Ackel";
		int age = 60;
		
		void displayBookInfo() {
			System.out.println("Title: " + title + "\nAuthor: " + name);
		}
	}

}
