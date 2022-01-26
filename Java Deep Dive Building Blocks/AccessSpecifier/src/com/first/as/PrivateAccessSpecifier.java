package com.first.as;

public class PrivateAccessSpecifier {
	private int a=25;
	protected int b=20;
	public static void main(String args[]) {
		PrivateAccessSpecifier obj=new PrivateAccessSpecifier();
		System.out.println("Private access specifier Inside class :" +obj.a);
	}

}
