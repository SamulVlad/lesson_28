package com.samul.javaсorelessons.lesson28.Task7;

public class Main {

	public static void main(String[] args) {
		Shape circle = new Shape() {

			@Override
			<T> double area(T param) {
				return Math.PI * Math.pow((Integer) param, 2);
			}

		};

		System.out.println("S=" + circle.area(10));

	}

}
