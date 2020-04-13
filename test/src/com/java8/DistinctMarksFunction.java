package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.java8.entity.Student;

public class DistinctMarksFunction {
	
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		populateList(studentList);
		Function<Student, String> studentFunction = student ->{
			if(student.getMarks()>=80)
				return "A";
			else if(student.getMarks()>=60) 
				return "B";
			else if(student.getMarks()>=50) 
				return "C";
			else if(student.getMarks()>=35) 
				return "D";
			else
				return "E";
		};
		for (Student student : studentList) {
			System.out.println(student+" "+studentFunction.apply(student));
			System.out.println();
		}
	}
	
	public static void populateList(List<Student> studentList) {
		studentList.add(new Student("Omkar", 10));
		studentList.add(new Student("Vishal", 90));
		studentList.add(new Student("Awes", 50));
		studentList.add(new Student("Anil", 65));
	}
	
}
