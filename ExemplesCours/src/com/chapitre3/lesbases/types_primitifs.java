package com.chapitre3.lesbases;

public class types_primitifs {

	public static void main(String[] args) {
		
		// Entiers
		byte un = 1;
		short deux = 2;
		int quatre = 4;
		long huit = 8;
		
		// Reels
		float fQuatre = 4.0f;
		double fHuit = 8.0; // double by default
		
		// Booleens
		boolean vrai = true;
		boolean faux = false;
		
		// Caracteres
		char unicodeSeize2o = 16;
		char a = 97; // 97 est le code de a
		
		System.out.println("____Les Entiers :");
		System.out.println(un);
		System.out.println(deux);
		System.out.println(quatre);
		System.out.println(huit);
		
		System.out.println("____Les Reels :");
		System.out.println(fQuatre);
		System.out.println(fHuit);
		
		System.out.println("____Les Booleans :");
		System.out.println(vrai);
		System.out.println(faux);
		
		System.out.println("____Les caracteres :");
		System.out.println(unicodeSeize2o);
		System.out.println(a);
		
		
		// PLUS sur lles nombres decimaux
		float pi = 3.14f; // suffixe f ou F est possible
		double x = 3d; // suffixe dou D est possible
		float flot1 = +.1f; // la valeur est 0.1
		float flot2 = 2e6F; // un exposant e pour dire 10^: 2*10^6
		
		System.out.println("____ ++ Les Reels :");
		System.out.println(pi);
		System.out.println(x);
		System.out.println(flot1);
		System.out.println(flot2);
	}

}
