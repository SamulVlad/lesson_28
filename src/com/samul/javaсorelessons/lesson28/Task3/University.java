package com.samul.javaсorelessons.lesson28.Task3;

public class University {

	public static class Student {
		int id = 123;
		String name = "John Grand";

		@Override
		public String toString() {
			return getClass().getSimpleName() + " [id=" + id + ", name=" + name + "]";
		}

	}
}
