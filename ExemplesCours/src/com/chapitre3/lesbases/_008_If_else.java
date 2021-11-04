package com.chapitre3.lesbases;

import java.util.Scanner;

public class _008_If_else {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Saisir n << ");
		short n = in.nextShort();
		
		if (n % 2 == 0) {
			System.out.println(n+" est pair.");
		} else {
			System.out.println(n+" est impair.");
		}
		
		// Condition Ternaire
		System.out.println( n +" "+ ((n % 2 == 0) ? "est pair." : " est impair.") );
		
		in.close();
	}

}
