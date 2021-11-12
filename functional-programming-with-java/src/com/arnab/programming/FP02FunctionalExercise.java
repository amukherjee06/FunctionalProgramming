package com.arnab.programming;

import java.util.List;
import java.util.stream.Collectors;

public class FP02FunctionalExercise {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");
		//int sum=squareAndAddListStructured(numbers);
		/*int sum=sumOfOddNumbersListStructured(numbers);
		List<Integer> listOfEvenNumbers=evenNumbersListStructured(numbers);
		System.out.println(listOfEvenNumbers);*/
		
		List<Integer> lengthOfCourses=lengthOfCourses(courses);
		System.out.println(lengthOfCourses);
	}
	
	private static List<Integer> lengthOfCourses(List<String> courses) {

		return courses.stream()
				.map(x->x.length())
				.collect(Collectors.toList());
	}

	private static List<Integer> evenNumbersListStructured(List<Integer> numbers) {
		return numbers.stream()
				.filter(x->x%2==0)
				.collect(Collectors.toList());
	}

	private static int squareAndAddListStructured(List<Integer> numbers) {

	//functional approach
		//a stream of numbers to be converted to sum(one value)
		return numbers.stream()
				.map(x->x*x)
				.reduce(0, Integer::sum);
		
	}
	
	private static int cubeAndAddListStructured(List<Integer> numbers) {

	//functional approach
		//a stream of numbers to be converted to sum(one value)
		return numbers.stream()
				.map(x->x*x*x)
				.reduce(0, Integer::sum);
		
	}
	
	private static int sumOfOddNumbersListStructured(List<Integer> numbers) {

	//functional approach
		//a stream of numbers to be converted to sum(one value)
		return numbers.stream()
				.filter(x->x%2==1)
				.reduce(0, Integer::sum);
		
	}

}
