package com.javaoca8.java.workingdatatypes.strings;

public class Strings {
	public static void main(String[] args) {
		
		/*
		 * String Equality
		 * */
		String name1 = "Sean";
		String name2 = "Sean";
		System.out.println(name1 == name2);
		
		String name3 = new String("Sean");
		System.out.println(name1 == name3);
		System.out.println(name1.equals(name3));
		System.out.println(name1 == new String("Sean").intern());
		
	}
}
