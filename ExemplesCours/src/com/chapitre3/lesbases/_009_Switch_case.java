package com.chapitre3.lesbases;

import java.util.Scanner;

public class _009_Switch_case {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Saisir n << ");
		
		short n = in.nextShort();
		
		switch (n) {
		case 0:
			System.out.println("Zero.");
			break;
		
		case 1:
			System.out.println("Un.");
			break;
			
		case 2:
			System.out.println("Deux.");
			break;
		default:
			System.out.println("Autre que 0, 1, 2 .");
			break;
		}
	
	
	// Autre
	n = in.nextShort();
	
	switch (n) {
		case 0:
			System.out.println("Zero.");
			break;
		
		case 1: case 2: case 3: case 4:
			System.out.println("Appartient a [1,4]");
			break;
			
		case 5:
			System.out.println("Cinq");
			break;
			
		case 6: case 7: case 8:
			System.out.println("Appartient a [6,8]");
			break;
			
		default:
			System.out.println(" < 0 ou > 8 .");
			break;
		}
	
	in.close();
	}
	
}
