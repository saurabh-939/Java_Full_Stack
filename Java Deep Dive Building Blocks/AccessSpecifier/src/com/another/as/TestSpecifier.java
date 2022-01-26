package com.another.as;

import com.first.as.AccessSpecifier;

public class TestSpecifier extends AccessSpecifier {
	
	public static void main(String args[]) {
		TestSpecifier a=new TestSpecifier();
		 a.test();//Protected
		 a.test1();//Public
		 //	a.test2();//Private can not be access
		 //a.test3();//Default can not be access 
		
	}

}
