package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.java8.entity.Employee;

public class Comparator {
	
	public static void main(String[] args) {
		emplyeeComparator();
	}
	
	public static void listComparator() {
		List<Integer> rollNumbers = new ArrayList<>();
		rollNumbers.add(1);
		rollNumbers.add(25);
		rollNumbers.add(22);
		rollNumbers.add(0);
		rollNumbers.add(33);
		System.out.println("Before sorting "+rollNumbers);
		Collections.sort(rollNumbers, (number1, number2)->(number1>number2)?-1:(number1<number2)?1:0);
		System.out.println("After sorting "+rollNumbers);
	}
	
	public static void treeSetComparator() {
		Set<Integer> rollNumbers = new TreeSet<>((number1, number2)->(number1>number2)?-1:(number1<number2)?1:0);
		rollNumbers.add(1);
		rollNumbers.add(25);
		rollNumbers.add(22);
		rollNumbers.add(0);
		rollNumbers.add(33);
		System.out.println(" Sorted "+rollNumbers);
	}
	
	public static void treeMapComparator() {
		Map<Integer, String> rollNumbers = new TreeMap<>((number1, number2)->(number1>number2)?-1:(number1<number2)?1:0);
		rollNumbers.put(1, "One");
		rollNumbers.put(25, "Twenty Five");
		rollNumbers.put(22, "Twenty Two");
		rollNumbers.put(0, "Zero");
		rollNumbers.put(33, "Thirty Three");
		System.out.println(" Sorted "+rollNumbers);
	}
	public static void emplyeeComparator() {
		List<Employee> emplyeeList = new ArrayList<>();
		emplyeeList.add(new Employee(1, "Emp1"));
		emplyeeList.add(new Employee(25, "Emp25"));
		emplyeeList.add(new Employee(22, "Emp22"));
		emplyeeList.add(new Employee(0, "Emp0"));
		emplyeeList.add(new Employee(33, "Emp33"));
		System.out.println("Before sorting "+emplyeeList);
		Collections.sort(emplyeeList, (emp1, emp2)->(emp1.getEmpNumber()>emp2.getEmpNumber())?-1:(emp1.getEmpNumber()<emp2.getEmpNumber())?1:0);
		System.out.println("After sorting "+emplyeeList);
	}
}
