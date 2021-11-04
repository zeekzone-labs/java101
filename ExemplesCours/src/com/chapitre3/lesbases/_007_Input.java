package com.chapitre3.lesbases;

import java.util.Scanner;

public class _007_Input {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		// Lire Les :
		System.out.println("____Les Entiers :");
		
		System.out.println("un << ");
		byte un = in.nextByte();
		System.out.println("out >> "+ un);
		
		System.out.println("deux << ");
		short deux = in.nextShort();
		System.out.println("out >> "+ deux);
		
		System.out.println("quatre << ");
		int quatre = in.nextInt();
		System.out.println("out >> "+ quatre);
		
		System.out.println("huit << ");
		long huit = in.nextLong();
		System.out.println("out >> "+ huit);
		
		System.out.println("____Les Reels :");
		
		System.out.println("fQuatre << ");
		float fQuatre = in.nextFloat();
		System.out.println("out >> "+ fQuatre);
		
		System.out.println("fHuit << ");
		double fHuit = in.nextDouble();
		System.out.println("out >> "+ fHuit);

		System.out.println("____Les Booleans :");
		
		System.out.println("vrai << ");
		boolean vrai = in.nextBoolean();
		System.out.println("out >> "+ vrai);
		
		System.out.println("faux << ");
		boolean faux = in.nextBoolean();
		System.out.println("out >> "+ faux);
		
		System.out.println("unicodeSeize2o << ");
		System.out.println("____Les caracteres :");
		char unicodeSeize2o = in.next().charAt(0);
		System.out.println("out >> "+ unicodeSeize2o);
				
		System.out.println("____FIN___");
		in.close();

	}

}
