package com.chapitre3.lesbases;

public class _013_Methodes {

	public static void main(String[] args) {
		
		System.out.println(somme(1,2));
		System.out.println(somme(1,2,3));
		System.out.println(somme(1.5f,2f));
		int x = 2, y = 3;
		
		System.out.println("Avant : ");
		System.out.println("x= "+x+" y="+y);
		
		permute(x, y);
		
		System.out.println("Apres : ");
		System.out.println("x= "+x+" y="+y);
	}
	
	 // Passage par valeur seulement
	static int somme(int a, int b) {
		return a + b;
	}
	
	static void permute(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("A l'interieur de permute(): ");
		System.out.println("a= "+a+" b="+b);
	}
	
	// Surcharge
	static int somme(int a, int b, int c) {
		return a+b+c;
	}
	
	static float somme(float a, float b) {
		return a+b;
	}
}
