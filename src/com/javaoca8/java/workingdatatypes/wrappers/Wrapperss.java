package com.javaoca8.java.workingdatatypes.wrappers;

public class Wrapperss {
	
	public static void main(String[] args) {
		int iw = Integer.parseInt("33");
		double d = Double.parseDouble("9.5");
		float f = Float.parseFloat("8.9");
		
		Integer iw1  = Integer.valueOf(2);
		Integer iw2  = Integer.valueOf("33");
		Integer iw3  = Integer.valueOf("F",18);
		System.out.println(iw3);
		
		Short k = new Short((short) 9);
		
		
		
		//BOXING/UNBOXING
		Integer x = 3; //Auto-boxing
		int i = Integer.valueOf(3); 
		
		
	}

}
