package com.samul.javaсorelessons.lesson28.Task2;

public class Car {

	String model = "Mustang";
	int year = 1963;
	Engine engine = new Engine(); 
	
	class Engine{
		String type = "atmosphere";
		int horsepower = 100;
		
		@Override
		public String toString() {
			return getClass().getSimpleName() + " [type=" + type + ", horsepower=" + horsepower + "]";
		}
	}
	
	public void displayCarInfo() {
		System.out.println(this.toString() + "\n" + engine.toString());
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [model=" + model + ", year=" + year + "]";
	}

}
