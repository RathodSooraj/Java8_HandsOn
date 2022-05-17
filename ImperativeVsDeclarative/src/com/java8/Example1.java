package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author SurajR3 Remove Duplicate from List
 */
public class Example1 {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * Imperative approach
		 */

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 3, 2, 4, 6, 7, 2, 4, 5, 6, 33, 34, 62);

		List<Integer> uniqueList = new ArrayList<Integer>();

		for (Integer integer : list) {
			if (!uniqueList.contains(integer)) {
				uniqueList.add(integer);
			}
		}
		System.out.println("Uniquelist :" + uniqueList);

		/**
		 * Declarative approach
		 */

		List<Integer> uniqueList1 = list.stream().distinct().collect(Collectors.toList());
		System.out.println("Uniquelist :" + uniqueList1);

	}

}
