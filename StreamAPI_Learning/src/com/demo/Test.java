package com.demo;

import java.util.Arrays;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);
		
		//values.forEach(i -> System.out.println(i));
		//		for every value of i, it will print the value of i
		 
		//values.forEach(System.out::println);
		//		method referance is passing as argument
		//		System.out is object, println is method
		
		values.forEach(Test::doubleIt);
		
	}
	
	public static void doubleIt(int i) {
		System.out.println(i*2);
	}

}
