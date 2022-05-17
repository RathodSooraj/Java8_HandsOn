package com.java8;

import java.util.stream.IntStream;

/**
 * @author SurajR3 Sum of Number from 0 - 100
 */
public class Example2 {
	public static void main(String[] args) {

		/**
		 * Imprative approach
		 */

		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println("Sum is :" + sum);

		/**
		 * Declarative Approach
		 */

		int sum1 = IntStream.rangeClosed(0, 100).sum();
		System.out.println("Sum is :" + sum1);

	}
}
