package com.javaoca8.java.workingdatatypes.stringbuilders;

public class StringBuilderMethods {

	public static void main(String[] args) {
		StringBuilder homeroSays = new StringBuilder("Mmmm");
		String exp = "Danuts";
		homeroSays.append(exp);
		System.out.println(homeroSays);//MmmmDanuts
		homeroSays.insert(4, "...");
		System.out.println(homeroSays);//Mmmm...Danuts
		
		StringBuilder numbers = new StringBuilder("0123456789");
		StringBuilder abc 	   = new StringBuilder("abcdefghij");
		
		
	}

}
