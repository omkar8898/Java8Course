package com.java8;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class TwoArgumentInterfaces {

	public static void main(String[] args) {
		biPredicate();
		biFunction();
		biConsumer();
	}

	public static void biPredicate() {
		System.out.println("BiPredicate");
		BiPredicate<Integer, Integer> biPredicate =(num1,num2)->(num1+num2)%2==0;
		System.out.println(biPredicate.test(10, 20));
		System.out.println(biPredicate.test(22, 27));
	}

	public static void biFunction() {
		System.out.println("BinaryOperator");
		BinaryOperator<Integer> biFunction=(num1,num2)->num1*num2;
		System.out.println(biFunction.apply(10, 20));
		System.out.println(biFunction.apply(100, 20));
	}

	public static void biConsumer() {
		System.out.println("BiConsumer");
		BiConsumer<String,String> biConsumer = (s1,s2)->System.out.println(s1+s2);
		biConsumer.accept("100", "Bars");
	}
}
