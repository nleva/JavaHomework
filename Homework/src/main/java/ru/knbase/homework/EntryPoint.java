package ru.knbase.homework;

import my.homework.car.Car;

/**
 * Точка входа для выполнения домашней работы
 * @author Lev Nadeinsky
 * @date	2017-02-01
 */
public class EntryPoint {

	public static void main(String[] args) {
		// ----------> your code starts here <------------
		Car car = new Car();
		car.setAge(5);
		car.setName("mycar");
		
		System.out.println(car);
	}
	
	/*
	 * приватный конструктор для
	 * запрета создания экземпляра или наследования
	 */
	private EntryPoint() {}

}
