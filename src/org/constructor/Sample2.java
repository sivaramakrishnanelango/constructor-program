package org.constructor;

public class Sample2 {
	
	//normal method
	private void employee() {
		System.out.println("employee name is :srk");

	}
	
	//constructor method
	public Sample2() {
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		
		Sample2 s = new Sample2();
		
		s.employee();
	}
	
	static {
		int a=200;
		System.out.println(a);
	}
}
