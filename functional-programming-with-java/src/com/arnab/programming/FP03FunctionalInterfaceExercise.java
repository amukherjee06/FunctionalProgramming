package com.arnab.programming;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03FunctionalInterfaceExercise {
	
	public static void main(String [] args) {
		
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
			
		BinaryOperator<Integer> operator = Integer::sum;
		
		BinaryOperator<Integer> operator2 = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
			
		};
		
		int x=numbers.stream()
		.reduce(0,operator2);
		
		System.out.println(x);
		
	}

}
