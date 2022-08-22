package org.constructor;

public class Sample4 {
	
	public Sample4() {
		this(20);
		System.out.println("non - parameterized constructor");
		
	}
	Sample4(int a){
		System.out.println("parameterized constructor");
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		Sample4 s = new Sample4();
	}

}
