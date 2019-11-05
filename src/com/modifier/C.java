package com.modifier;

public class C {
	
	private int m3() {
		System.out.println("im in private m3");
		return 0;
	}//

	public static void main(String[] args) {
		new C().m3();
		new B().m2(); //default modifier
		//new D().md(); private modifier

	}

}
 class D{
	 private void md() {
		 System.out.println("im in md");
		 
	 }
 }