package com.arnab.programming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FP03BehaviourParameterizationExercise {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		int[] numberArray= {12,9,13,4,6,2,4,12,15};
		
		List<Integer> listOfNumbers=operateAndPrint(numbers, x->x*x*x*x);
		
		System.out.println(listOfNumbers);
		
		System.out.println(numbers.stream().reduce(0,Integer::sum));
		
		System.out.println(Arrays.stream(numberArray).sum());
	}

	private static List<Integer> operateAndPrint(List<Integer> numbers, Function<Integer, Integer> mapper) {
		return numbers.stream()
		.map(mapper)
		.collect(Collectors.toList());
	}
	

}
