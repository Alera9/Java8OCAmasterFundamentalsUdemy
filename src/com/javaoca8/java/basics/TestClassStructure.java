package com.javaoca8.java.basics;

public class TestClassStructure {

	public static void main(String[] args) {
		ClassStructure cs = new ClassStructure();
		//Comprobando que una instancia pude acceder desde las instancias
		System.out.println("Static from instance: " + cs.countTest);
		/*Comprobando si pueden acceder y modificar el objeto de la clase estatica 
		 * o solo es una copia*/
		 cs.stringTest.append("add from instance");
		System.out.println("String builder from instance: " + cs.stringTest.toString());
		System.out.println("String builder from class: " + ClassStructure.stringTest.toString());
		/*
		 * Comprobamos que al apuntar al mismo objeto desde la instancia podemos acceder y
		 * modificar la variable de clase*/
		System.out.println(cs.xTest);
		cs.m2();
	}

}
