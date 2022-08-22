package org.constructor;

public class Sample6 {
	
	public Sample6() {
		this(30);
		System.out.println("non-parameterized constructor");
	}
	Sample6(int a){
		this(231546l);
		System.out.println("parameterized constructor");
		System.out.println(a);
		
	}
	Sample6(long a){
		System.out.println("long parameterized constructor");
		System.out.println(a);
	}
	public static void main(String[] args) {
		Sample6 s = new Sample6();
	}

}
