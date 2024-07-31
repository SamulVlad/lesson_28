package com.samul.javaсorelessons.lesson28.Task5;

public class Main {

	public static void main(String[] args) {
		Greeting sayGreeting = new Greeting() {
			@Override
			public void sayHello() {
				System.out.println("Hello, Javaaaaaaaaaaaaaaaa!");
			}
		};
		
		sayGreeting.sayHello();
	}

}
