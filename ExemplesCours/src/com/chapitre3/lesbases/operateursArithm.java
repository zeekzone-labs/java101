package com.chapitre3.lesbases;

public class operateursArithm {
	
	public static void main(String[] args) {
		// Arithmetiques
		int c, d, a, b;
		a = 1; 
		b = 2;
		
		c =  a * b - a + b;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("c= a * b - a + b= "+c);
		
		c =  a++;
		d = a++ - a;
		System.out.println("c= a++="+c);
		System.out.println("d= a++ - a= "+d);
		System.out.println("a= "+a);
		
		c = ++a;
		d = ++b - a++;
		System.out.println("c= a++="+c);
		System.out.println("d= ++b - a++= "+d);
		System.out.println("a= "+a);
		System.out.println("b="+b);
		
	} 
}
