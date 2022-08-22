package org.constructor;

public class Sample3 {

	
	//constructor method
	public Sample3() {
		System.out.println("Non-parameterized constructor");
	}
	
	public Sample3(int a) {
		
		System.out.println("Parameterized constructor ");
	 System.out.println(a);
	}
	
	public static void main(String[] args) {
		 Sample3 s = new Sample3();
		 Sample3 s1 = new Sample3(100);
	}
}
