package com.javaoca8.java.basics;

public class ClassStructure {
	// class and instance variables go here
	/*
	 * Class variables are static
	 * Instance variables are not static
	 * 
	 * However, all of those instances will share the one copy of the class variable count.
	 * */
	static int count; //class 
	static int countTest = 5;
	static StringBuilder stringTest = new StringBuilder("stringTest");
	int x; //instance
	int xTest = 10; //instance
	//Initialization blocks
	static {}// static block, happens once, when the class is loaded for the very first time.
	{}		// instance block, happens every new instance
	ClassStructure(){}

	public static void main(String[] args) {
	}
	
	public static void m1() { System.out.println("metodo de clase");}
	public void m2() { System.out.println("Metodo de instancia");}

}
