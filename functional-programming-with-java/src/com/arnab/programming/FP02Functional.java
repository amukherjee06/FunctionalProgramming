package com.arnab.programming;

import java.util.List;

public class FP02Functional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		int sum=addListStructured(numbers);
		System.out.println(sum);
	}

	private static int sum(int a, int b) {
		System.out.println(a+" "+b);
		return a+b;
	}
	
	private static int addListStructured(List<Integer> numbers) {

	//functional approach
		//a stream of numbers to be converted to sum(one value)
		return numbers.stream()
		
				//first approach
				//.reduce(0,FP02Functional::sum);
				//second approach
				//.reduce(0, (x,y)->x+y);
				//third approach
				.reduce(0, Integer::sum);
		
	}

}
