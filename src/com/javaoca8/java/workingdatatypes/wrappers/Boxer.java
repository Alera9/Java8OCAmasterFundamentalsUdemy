package com.javaoca8.java.workingdatatypes.wrappers;
public class Boxer {
	Integer i;
	int x;
	public Boxer(int y) {
		x = i+y;//java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because "this.i" is null
		System.out.println(x);
	}
	public static void main(String[] args) {
		new Boxer( new Integer(4));
	}
}
