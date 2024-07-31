package com.samul.javaсorelessons.lesson28.Task7;

public abstract class Shape {
 // параметризовал метод, чтобы можно было передавать разные параметры
//	т.к. для разных фигур площадь считается по-разному
	abstract <T> double area(T param); 

}
