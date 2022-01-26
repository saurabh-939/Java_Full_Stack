package com.first.as;

public class TestSpecifier {
	public static void main(String args[]) {
	
		DefAccessSpecifier def=new DefAccessSpecifier();
		def.defaults();
		
		//unable to access private access specifier inside same package
		//PrivateAccessSpecifier obj=new PrivateAccessSpecifier();
		//System.out.println("Private Access Specifier access Inside same package" +obj.a);
		
		 //Private access specifier inside same package
		ProtectedAccessSpecifier obj=new ProtectedAccessSpecifier();
		System.out.println("Protected Access Specifier access Inside same package : " +obj.b);
		
		ProtectedAccessSpecifier p=new ProtectedAccessSpecifier();
		p.test();
		
		 AccessSpecifier a=new  AccessSpecifier();
		 a.test();//Protected
		 a.test1();//Public
//		 a.test2();//Private can not be access
		 a.test3();//Default
		
	}
}
