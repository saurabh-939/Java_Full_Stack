package com.first.as;

public class ProtectedAccessSpecifier {
	protected int b=56;
	public static void main(String args[]) {
		ProtectedAccessSpecifier obj=new ProtectedAccessSpecifier();
		System.out.println("Protected access specifier access within class :"+obj.b);
				
	}
	
	protected void test() {
		System.out.println("Protected Method called ");
	} 
	


}
