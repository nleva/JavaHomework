package ru.knbase.homework;

import java.math.BigInteger;

/**
 * Пример выполнения домашней работы
 * Вывод на экран последовательности фибоначчи
 * 
 * @author Lev Nadeinsky
 * @date	2017-02-01
 */
public class Fibonacci {

	BigInteger	a		= BigInteger.ONE; 
	BigInteger	b		= BigInteger.ONE;
	BigInteger	c;
	
	int			index	= 1; // <--- индекс элемента в последовательности

	/**
	 * Получить следующий элемент последовательности
	 * @return элемент последовательности
	 */
	public BigInteger next() {
		BigInteger tmp = a;
		c = a.add(b);
		a = b;
		b = c;
		//устанавливаем номер элемента
		index++;
		return tmp;
	}

	/**
	 * Получить текущий элемент последовательности
	 * @return
	 */
	public BigInteger current() {
		return a;
	}

	/**
	 * Получить индекс
	 * @return
	 */
	public int index() {
		return index;
	}

	/**
	 * Печать первых элементов до max
	 * @param max количество элементов, которое нужно вывести на экран
	 */
	public static void printFirstElements(final int max) {
		print(1,max);
	}

	/**
	 * Печать диапазона элементов из последовательности фибоначчи
	 * @param from начальный индекс от 1 до конечного индекса
	 * @param to конечный индекс от начального индекса до Integer.MAX_VALUE
	 */
	public static void print(final int from, final int to) {
		//проверка для оптимизации производительности
		if (to < 1 || from < 1 || from > to)
			return;
		Fibonacci fib = new Fibonacci();
		for (; fib.index() < from;) fib.next();
		for (; fib.index() <= to;) {
			System.out.println("["
					+ (fib.index())
					+ "] = "
					+ fib.next());
		}
	}
}
