package com.java8;

public class InvokeLambdaExpressionByFunctionalInterface {
	public static void main(String[] args) {
//		Runnable r = 
		Thread t = new Thread(()->{
			for (int i = 0; i < 5; i++) {
				System.out.println("Child Thread");
			}
		});
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");
		}
	}
}
