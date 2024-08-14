package com.javaoca8.java.workingdatatypes.primitives;

public class PrimitivesWidening {

	public static void main(String[] args) {
		/*
		 * WIDENING
		 *  byte > short/char > int > long > float > double
		 *  
		 *   compilation problem: Type mismatch: cannot convert from byte to char necesistamos hacer un cast
		 *   Unresolved compilation problem: Type mismatch: cannot convert from char to byte
		 *   */
		char c = '+';
		System.out.println("c: " + c);
		byte b = (byte) c;
		byte b2 = 34;
		char c2 =  (char) b2;
		System.out.println("b: " + b);
		// short s = (short) b;
		short s =  (short) b;
		System.out.println("s: " + s);
		int i= b;
		System.out.println("i: " + i);
		long lo = b;
		System.out.println("lo: " + lo);
		float fl = b;
		System.out.println("fl: " + fl);
		double d = b;
		System.out.println("d: " + d);
		
		
		

	}

}
