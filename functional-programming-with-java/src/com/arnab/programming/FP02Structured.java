package com.arnab.programming;

import java.util.List;

public class FP02Structured {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		int sum=addListStructured(numbers);
		System.out.println(sum);
	}

	private static int addListStructured(List<Integer> numbers) {

		//In traditional approach-----
		//how to loop?
		//how to store the sum?
		//return the sum
		int sum=0;
		for(int number:numbers) {
			sum+=number;
		}
		
		return sum;
	}

}
