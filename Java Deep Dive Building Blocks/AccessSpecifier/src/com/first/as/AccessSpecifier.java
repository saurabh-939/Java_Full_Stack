package com.first.as;

public class AccessSpecifier {
	protected void test() {
		System.out.println("Protected Method called ");
	} 
	
	public void test1() {
		System.out.println("Public Method called ");	
	}
	
	private void test2(){
		System.out.println("Private Method called ");	
	}
	
	 void test3() {
		System.out.println("Default Method called ");	
	}
	 
	public static void main(String args[]) {
		 AccessSpecifier m=new  AccessSpecifier();
		 m.test();
		 m.test1();
		 m.test2();
		 m.test3();
		
	}

}
