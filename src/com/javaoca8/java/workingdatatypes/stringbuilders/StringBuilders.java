package com.javaoca8.java.workingdatatypes.stringbuilders;

public class StringBuilders {

	public static void main(String[] args) {
		StringBuilder homeroSays = new StringBuilder("Mmmm");
		String exp = "Danuts";
		homeroSays.append(exp);
		System.out.println(homeroSays);//MmmmDanuts
		homeroSays.insert(4, "...");
		System.out.println(homeroSays);//Mmmm...Danuts


	}

}
