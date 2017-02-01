package ru.knbase.homework;

/**
 * Точка входа для выполнения домашней работы
 * @author Lev Nadeinsky
 * @date	2017-02-01
 */
public class EntryPoint {

	public static void main(String[] args) {
		
		// ----------> your code starts here <------------
		System.out.println("------------Fibonacci.print(3, 5)-----------");
		Fibonacci.print(3, 5);
		System.out.println("------------Fibonacci.print(-3, 5)-----------");
		Fibonacci.print(-3, 5);
		System.out.println("------------Fibonacci.print(3, -5)-----------");
		Fibonacci.print(3, -5);
		System.out.println("------------Fibonacci.print(4, 4)-----------");
		Fibonacci.print(4, 4);
		System.out.println("------------Fibonacci.print(1, 1)-----------");
		Fibonacci.print(1, 1);
		System.out.println("------------Fibonacci.print(0, 1)-----------");
		Fibonacci.print(0, 1);
		System.out.println("------------Fibonacci.print(4, 3)-----------");
		Fibonacci.print(4, 3);
		System.out.println("------------END-----------");
		
	}
	
	/*
	 * приватный конструктор для
	 * запрета создания экземпляра или наследования
	 */
	private EntryPoint() {}

}
