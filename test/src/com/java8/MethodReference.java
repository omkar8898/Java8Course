package com.java8;

class Sample {
	Sample() {
		System.out.println("Sample class Constructor excecution & object creation");
	}
}

interface SampleInterface {
	public Sample get();
}

public class MethodReference {
	public static void main(String[] args) {
		SampleInterface sampleInterface = Sample::new;
		Sample sample = sampleInterface.get();
		MethodReference methodReference = new MethodReference();
		Thread t = new Thread(methodReference::childThread);
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");
		}
	}
	
	public void childThread() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
		}
	}
	
}


