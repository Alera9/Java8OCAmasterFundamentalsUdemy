package com.javaoca8.java.workingdatatypes.primitives;

public class UnaryOperators {
	public static void main(String[] args) {
//		int x = 3, y = 4;
//		x++;
//		--y;
//		System.out.println(x +" "+y);
//		System.out.println(x++ +" "+--y);
//		System.out.println(x +" "+y);
		
//		int x = +6;
//		int y = -x;
//		
//		System.out.println(x +" "+y);
//		
//		int z =  (int)3.45;
//		System.out.println(z);
//		
//		boolean b = true;
//		System.out.println(!b);
		
		int x = 10, y = 3;
		int div = x/y;
		int mod = x%y;
		System.out.println(div+" "+ mod);
		System.out.println(0%3);
		
		/*
		 * Arithmetic Operators preedence*
		 * 
		 * */
			int res =  3 +2 *4; 
			System.out.println(res);//11
			res = (3+2) *4;
			System.out.println(res);//24
			res = 6+4-2;
			System.out.println(res);//8
			res =10 /4 *6;
			System.out.println(res);//12
			
			//Any maths operation involving int-types or smalller, result in an int
			
			byte b1 = 2, b2 = 3;
			//byte b3 = 128;
			
			//byte b4 = b1+b2;
			byte b5 = (byte) (b1+b2);
			System.out.println(b5);
			short s1 =3, s2 = 4;
			short ssum= (short) (s1 +s2);
			System.out.println(ssum);
			char c = 'a', c1 ='b';
			char csum= (char) (c+c1);
			System.out.println(csum);
			
			int xx = 2;
			xx *= 2+5;//14
			System.out.println(xx);	
			
			/*
			 * Compound Assigment Operators -careful
			 * 
			 * */
			
			int k = 1;
		//  k += (4)  * (4+2);
		//  k = 1 + ((k = 4) * (k +2));
		//  k += 4 * 6;
		//  k += 24;
		//  k = 1 +24;
		//  k = 1 +24;
			k += (k = 4) * (k +2);
		// Como va de izquierda a derecha le asigno el valor de 4 a k y para la operacion (k+2) ya tenía ese valor
			System.out.println(k);
			k =1;
	
			k = 1 + ((k = 4) * (k +2));
			System.out.println(k);
	}

}
