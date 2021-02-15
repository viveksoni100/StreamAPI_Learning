package com.demo;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> valuesNew = Arrays.asList(12, 20, 35, 46, 55, 68, 75);

		// values.forEach(i -> System.out.println(i));
		// for every value of i, it will print the value of i

		// values.forEach(System.out::println);
		// method referance is passing as argument
		// System.out is object, println is method

		// values.forEach(Test::doubleIt);

		// System.out.println(values.stream().map(i -> i * 2).reduce(0, Integer::sum));
		
		// get the sum of numbers which are divisible by 5
		
		// traditional logic
		int result = 0;
		for (int i : valuesNew) {
			if(i%5 == 0) {
				result += 1;
			}
		}
		// System.out.println(result);
		
		// stream logic
		System.out.println(valuesNew.stream()
				.filter(i -> i%5==0)
				.reduce(0, Integer::sum));
	}

	public static void doubleIt(int i) {
		System.out.println(i * 2);
	}

}
