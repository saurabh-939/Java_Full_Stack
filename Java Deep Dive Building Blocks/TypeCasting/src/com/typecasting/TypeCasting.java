package com.typecasting;


public class TypeCasting {
	public static void main(String args[]) {
		//Implicit TypeCasting
		System.out.println("Implicit TypeCasting");
		char s='S';
		System.out.println("Value of S :" +s);
		
		int a=s;
		System.out.println("Value of Int :"+a);
		
		float b=a;
		System.out.println("Value of Float :"+b);
		
		long c=a;
		System.out.println("Value of Long :"+c);
		
		double d=a;
		System.out.println("Value of double :"+d);
		
		System.out.println("-------------------------");
		System.out.println("Explicit TypeCasting");
		double e=90.80;
		float f=(float)e;
		System.out.println("Value of double :"+e);
		System.out.println("Value of float :"+f);
		long g=(long)f;
		System.out.println("Value of float :"+g);
		int h=(int)g;
		System.out.println("Value of float :"+h);
		
		
		
		
	}

}
