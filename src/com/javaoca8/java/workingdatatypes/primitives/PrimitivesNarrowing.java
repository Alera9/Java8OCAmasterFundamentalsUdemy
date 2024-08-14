package com.javaoca8.java.workingdatatypes.primitives;

public class PrimitivesNarrowing {
	public static void main(String[] args) {
		double d = 9_080_000;
		System.out.println("d: " + d);
		float fl = (float) d;
		System.out.println("fl: " + fl);
		long lo = (long) d;
		System.out.println("lo: " + lo);
		int i= (int) d;
		System.out.println("i: " + i);
		// short s = (short) b;
		short s =  (short) d;
		System.out.println("s: " + s);
		byte b = (byte) d;
		char c2 =  (char) d;
		System.out.println("b: " + b);	
		char c = (char) d;
		System.out.println("c: " + c);
		short s1 =  (short) c;
		System.out.println("s: " + s1);

		
		
	
	}

}
