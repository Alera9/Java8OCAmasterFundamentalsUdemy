package com.javaoca8.java.basics.scope;

public class Scope {
	static int count; //class 
	int x; //instance
	public static void main(String[] args) {
		int a = 1;
		a = 2;
		{
			a=3;
			int b=0;
			b++;
			{
				b++;
				a++;
			}
			System.out.println("b: " +b);
		}
		System.out.println("a: " + a);
		
	}
	
	

}
