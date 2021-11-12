package com.arnab.programming;

import java.util.List;
import java.util.stream.Collectors;

public class FP01FunctionalExercise {

	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker","Kubernetes");
		
		//printCoursesContainingSpring(courses);
		List<String>capitalList= printCapitals(courses);
		System.out.println(capitalList);
	}

	
	
	private static void printCoursesContainingSpring(List<String> courses) {
		
		courses.stream().filter(course->course.length()>=4).forEach(System.out::println);
		
	}
	
	private static void printNumberOfCharactersInCourses(List<String> courses) {
		
		courses.stream().map(str->str+" "+str.length()).forEach(System.out::println);
		
	}
	
	private static List<String> printCapitals(List<String> courses) {
		
		return courses.stream().map(String::toUpperCase).collect(Collectors.toList());
		
	}
	
	
	
	

}
