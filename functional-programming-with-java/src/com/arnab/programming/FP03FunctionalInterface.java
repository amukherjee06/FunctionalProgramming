package com.arnab.programming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03FunctionalInterface {
	
	public static void main(String [] args) {
		
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
			
		Predicate<Integer> isEvenPredicate = a->a%2==1;
		
		//Internally what happens
		Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {

			@Override
			public boolean test(Integer a) {
				return a%2==1;
			}
			
			
		};
		
				
		Function<Integer,Integer> squareFunction = a->a*a;
		//What internally happens
		Function<Integer,Integer> squareFunction2 = new Function<Integer,Integer>(){

			@Override
			public Integer apply(Integer a) {
				return a*a;
			}
			
			
		};
		
		
		Consumer<Integer> printConsumer = System.out::println;
		
		Consumer<Integer> printConsumer2 = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
			
			
		};
		
		numbers.stream()
		.filter(isEvenPredicate2)
		.map(squareFunction2)
		.forEach(printConsumer2);
		
	}

}
