package com.javaoca8.java.workingdatatypes.stringbuilders;

public class StringBuilderAllMethods {

	public static void main(String[] args) {
		/*
		 * Constructors
			Constructor and Description
			StringBuilder()
			StringBuilder(CharSequence seq)
			StringBuilder(int capacity)
			StringBuilder(String str)
		 * 
		 * */
		StringBuilder conConstructorNull = new StringBuilder();// Capacity: 16
		StringBuilder conConstructorChar = new StringBuilder('a');
		StringBuilder conConstructorCapacity = new StringBuilder(11);
		StringBuilder conConstructorString = new StringBuilder("Mmmm");
		System.out.println( "conConstructorCapacity: " + conConstructorCapacity.capacity() );
		conConstructorCapacity.append('a');
		conConstructorCapacity.append('b');
		conConstructorCapacity.append(3);
		conConstructorCapacity.append(4);
		conConstructorCapacity.append(5);
		conConstructorCapacity.append(6);
		conConstructorCapacity.append(7);
		conConstructorCapacity.append(8);
		conConstructorCapacity.append(9);
		conConstructorCapacity.append(0);
		System.out.println( "conConstructorCapacity: " + conConstructorCapacity.capacity() );
		conConstructorCapacity.append(10);//Si revasa la capacidad aumenta 12
		System.out.println( "conConstructorCapacity 10: " + conConstructorCapacity.capacity() );
		System.out.println( "conConstructorCapacity: " + conConstructorCapacity );
		System.out.println( "*******************************************************"  );
		System.out.println( "conConstructorString : " + conConstructorString.capacity() );
		conConstructorString.append(conConstructorCapacity.insert(0,"..."));
		System.out.println( "conConstructorString : " + conConstructorString );
		conConstructorString.reverse();
		System.out.println( "conConstructorString despues reverse: " + conConstructorString );
		conConstructorString.reverse();
		System.out.println( "conConstructorString regreso: " + conConstructorString );
		conConstructorString.delete(7,8);
		System.out.println( "conConstructorString  delete: " + conConstructorString );
		System.out.println( "conConstructorString : " + conConstructorString.length() );
		System.out.println( "*******************************************************"  );
		System.out.println( "conConstructorNull : " + conConstructorNull.capacity() );
		
		StringBuilder numbers = new StringBuilder("0123456789");
		StringBuilder abc 	   = new StringBuilder("abcdefghij");
		
		
	}

}
