package com.arnab.programming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Course {

	private String name;
	private String category;
	private int reviewScore;
	private int numberOfStudents;

	public Course(String name, String category, int reviewScore, int numberOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.numberOfStudents = numberOfStudents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", category=" + category + ", reviewScore=" + reviewScore
				+ ", numberOfStudents=" + numberOfStudents + "]";
	}

}

public class FP04CustomClass {

	public static void main(String[] args) {

		List<Course> listOfCourses = List.of(new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
				new Course("Microservices", "Microservices", 96, 25000),
				new Course("Fullstack", "Fullstack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 92, 20000),
				new Course("Kubernetes", "Cloud", 91, 20000));

		// allMatch,anyMatch.noneMatch

	//	System.out.println(listOfCourses.stream().allMatch(course -> course.getReviewScore() > 90));

	//	System.out.println(listOfCourses.stream().noneMatch(course -> course.getReviewScore() < 90));

	//	System.out.println(listOfCourses.stream().anyMatch(course -> course.getReviewScore() > 90));

		// Using comparator
		Comparator<Course> comparingByNumberOfStudents = Comparator
				.comparing(Course::getNumberOfStudents);

		Comparator<Course> comparingByNumberOfStudentsDescending = Comparator
				.comparing(Course::getNumberOfStudents)
				.reversed();
		Comparator<Course> compareByReviewScoreDescending=Comparator
				.comparing(Course::getReviewScore).reversed();
		//Comparing with numberOfStudents and reviewScore
		Comparator<Course> compareByNoOfStudentsAndReviewScore=Comparator
				.comparing(Course::getNumberOfStudents)
				.thenComparing(course->course.getName().length())
				.thenComparing(Course::getReviewScore)
				
				.reversed();
		
		/*System.out.println(
				listOfCourses.stream()
				.sorted(compareByReviewScoreDescending)
				.skip(3)
				.limit(2)
				.collect(Collectors.toList()));*/
/*		System.out.println(
				listOfCourses.stream()
				.takeWhile(course->course.getReviewScore()>=95)
				.collect(Collectors.toList()));*/
/*		System.out.println(
				listOfCourses.stream()
				.dropWhile(course->course.getReviewScore()>=95)
				.collect(Collectors.toList()));*/
/*		System.out.println(
				listOfCourses.stream()
				.filter(course->course.getReviewScore()>99)
				.findAny()
				.orElse(new Course("Kubernetes", "Cloud", 91, 20000))
				);*/
		
/*		System.out.println(
				listOfCourses.stream()
				.filter(course->course.getReviewScore()>95)
				.mapToInt(Course::getNumberOfStudents)
				.min()
				);//OptionalDouble[22000.0]
*/
		
/*		System.out.println(
				listOfCourses.stream()
				.collect(Collectors.groupingBy(Course::getCategory))
				);*/
		
/*		System.out.println(
				listOfCourses.stream()
				.collect(Collectors.groupingBy(Course::getCategory, Collectors.counting()))
				);*/
		
/*		System.out.println(
				listOfCourses.stream()
				.collect(Collectors.groupingBy(Course::getCategory, 
						Collectors.maxBy(Comparator.comparing(Course::getReviewScore))))
				);*/
		
		System.out.println(
				listOfCourses.stream()
				.collect(Collectors.groupingBy(Course::getCategory, 
						Collectors.mapping(Course::getName,Collectors.toList())))
				);
	}

}
