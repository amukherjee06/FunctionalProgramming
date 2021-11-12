package com.arnab.programming;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FP03FunctionalInterfaces2 {

	public static void main(String[] args) {

		
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		
		Predicate<Integer> isEven= x->x%2==0;
		Function<Integer, Integer> squareFunction= x->x*x;
		Function<Integer, String> stringFunction= x->x + " ";
		Consumer<Integer> sysOut=x->System.out.println(x);
		BinaryOperator<Integer> sumBinaryOperator = (x,y)->x+y;
		
		Supplier<Integer> randomSupplier=()->{
			
			Random random=new Random();
			return random.nextInt(10000);
		};
		
		System.out.println(randomSupplier.get());
		
		UnaryOperator<Integer> unaryOperator=(x)->x*3;
		System.out.println(unaryOperator.apply(10));
		
		BiFunction<Integer, Integer, Integer> biFunction=(x,y)->x*y;
		System.out.println(biFunction.apply(5, 10));
		
		BiConsumer<Integer, Integer> printConsumer=(x,y)-> System.out.println(x+" "+y);
		printConsumer.accept(10, 20);
		
		BiPredicate<Integer, Integer> biPredicate=(x,y)->{
			
			return x%2==0 || y%2!=0;
		};
		
		System.out.println(biPredicate.test(2, 4));
	}

}
