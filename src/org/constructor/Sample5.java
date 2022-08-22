package org.constructor;

public class Sample5 {

	
public Sample5() {
	System.out.println("non-parameterized constructor");
	new Sample5(30);
}

Sample5(int a){
	
	System.out.println("parameterized constructor");
	System.out.println(a);
}

public static void main(String[] args) {
	Sample5 s = new Sample5();
}
}
