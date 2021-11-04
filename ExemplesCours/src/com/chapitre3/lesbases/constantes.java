package com.chapitre3.lesbases;

public class constantes {

	public static void main(String[] args) {
		final int N = 5;
		final int T;
		
		T = 8; // Premiere Affectation : C'est possible
		System.out.println(T);
		System.out.println(N);
		
		// Deuxieme Affectaion : Erreur, N est declaree final
		
		// N = 10;
		
	}

}
