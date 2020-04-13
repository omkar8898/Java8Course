package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String[] args) {
		IntPredicate intPredicate = number->number>10;
		System.out.println("Integer");
		System.out.println(intPredicate.test(5));
		System.out.println(intPredicate.test(20));
		
		System.out.println("String");
		Predicate<String> stringPredicate = string->string.equals("hi");
		System.out.println(stringPredicate.test("hi"));
		System.out.println(stringPredicate.test("hey"));
		
		System.out.println("Collection");
		Predicate<List> collectionPredicate = list->list.isEmpty();
		List<String> list = new ArrayList<>();
		System.out.println(collectionPredicate.test(list));
		list.add("hi");
		System.out.println(collectionPredicate.test(list));
	}
}
