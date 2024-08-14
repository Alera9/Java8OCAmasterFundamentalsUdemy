package com.javaoca8.java.workingdatatypes.strings;

public class StringMethods {

	public static void main(String[] args) {
		String exp ="Mmmm";
		String homeroSays = "Danuts";
		String homeroSaysUpper ="DANUTS";
		String numbers = "0123456789";
		String abc 	   = "abcdefghij";
		String exampleTrim = " hell ";
		System.out.println(exp.length());//4
		System.out.println(homeroSays.equalsIgnoreCase(homeroSaysUpper));//true
		System.out.println(homeroSays.replace('a', 'o'));//Donuts
		System.out.println(numbers.substring(5));//56789
		System.out.println(abc.substring(5));//fghij
		System.out.println(numbers.substring(5,7));//56
		System.out.println(abc.substring(5,7));//fg
		
		System.out.println(exampleTrim + "o");// hell o
		System.out.println(exampleTrim.trim() + "o");//hello
		
		
		
		
		

	}

}
