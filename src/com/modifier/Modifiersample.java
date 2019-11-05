package com.modifier;

public class Modifiersample {
static protected void m1()
 {
	 System.out.println("public class m1 ");
 
}
 public static void main(String[] args) {
		System.out.println("im in class");
		m1();
		B b=new B();
		b.m2();
		System.out.println("my git");
 
 
}
 
}
class B  
{
	
	 protected void m2() {
		System.out.println("im in m2");
	}

}

