package com.samul.javaсorelessons.lesson28.Task7;

public class Main {

	public static void main(String[] args) {
		Shape circle = new Shape() {

			@Override
			double area(double param) {
				return Math.PI * Math.pow(param, 2);
			}

		};

		System.out.println("S=" + circle.area(10));

	}

}
