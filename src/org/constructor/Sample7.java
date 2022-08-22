package org.constructor;

public class Sample7 {
	
	public Sample7() {
		System.out.println("non-parameterized constructor");
	}
public Sample7(int a){
	this();
	System.out.println("int parameterized constructor");
	System.out.println(a);
}

Sample7(long a){
	this(67);
	System.out.println("long parameterized constructor");
	System.out.println(a);
}

public static void main(String[] args) {
	
	Sample7 s = new Sample7(54612345l);
}
}
