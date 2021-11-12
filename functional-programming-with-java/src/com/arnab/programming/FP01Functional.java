package com.arnab.programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		//printEvenNumbersInListFunctional(numbers);
		//printAllNumbersInListFunctional(numbers);
		//printOddNumbersInListFunctional(numbers);
		printSquareOfOddNumbersInListFunctional(numbers);
	}

	/*private static boolean isEven(int number) {
		return number%2==0;
	}*/
	
	//number->number%2==0;
	
	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		
		
		//convert the list to stream
		//print the number - for each one of them
		numbers.stream().forEach(System.out::println);
		
	}
	
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		
		
		//convert the list to stream
		//print the number - for each even of them
		//numbers.stream().filter(FP01Functional::isEven).forEach(System.out::println);
		
		
		//using lambda
		numbers.stream().filter(number->number%2==0).forEach(System.out::println);
		
	}
	
	private static void printOddNumbersInListFunctional(List<Integer> numbers) {
		
		
		//convert the list to stream
		//print the number - for each odd of them
		//numbers.stream().filter(FP01Functional::isEven).forEach(System.out::println);
		
		
		//using lambda
		numbers.stream().filter(number->number%2!=0).forEach(System.out::println);
		
	}
	
	private static void printSquareOfOddNumbersInListFunctional(List<Integer> numbers) {
		
		
		//convert the list to stream
		//print the number - for each odd of them
		//numbers.stream().filter(FP01Functional::isEven).forEach(System.out::println);
		
		
		//using lambda
		numbers.stream()
		.filter(number -> number % 2 != 0)
		.map(x->x*x*x)
		.forEach(System.out::println);
		
	}

}
