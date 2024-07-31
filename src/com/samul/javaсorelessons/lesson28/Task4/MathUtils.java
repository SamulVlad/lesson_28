package com.samul.javaсorelessons.lesson28.Task4;

public class MathUtils {

	public static class Factorial {
		public static int calculate(int arg) {
			int result = 1;
			for (int i = 1; i <= arg; i++) {
				result *= i;
			}
			return result;
		}

	}

}
