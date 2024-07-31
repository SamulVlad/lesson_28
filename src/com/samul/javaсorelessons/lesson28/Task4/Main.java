package com.samul.javaсorelessons.lesson28.Task4;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rnd = new Random();

		for (int i = 0; i < 10; i++) {
			int r = rnd.nextInt(10);
			System.out.printf("Factorial of %d is %d\n", r, MathUtils.Factorial.calculate(r));
		}

	}

}
