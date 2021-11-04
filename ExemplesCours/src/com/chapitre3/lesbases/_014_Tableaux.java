package com.chapitre3.lesbases;

import java.util.Scanner;

public class _014_Tableaux {
	
	private static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// C like
		// Declaration
		int notes[];
		
		// Dimensionnement
		notes = new int[6];
		
		// Affichage
		printTab(notes);
				
		// Initialisation
		initTab(notes);
		
		// Affichage
		printTab(notes);
		
		// t = tab
		affecte();
		
		// Multidimension
		int notesGL[][];
		notesGL = new int[2][];
		notesGL[0] = new int[6]; // S5
		notesGL[1] = new int[4]; // S6
		
		initTab2D(notesGL);
		printTab2D(notesGL);
		
		
	}
	
	private static void initTab(int[] notes) {
		for (int i = 0; i < notes.length; i++) {
			System.out.println("Saisir la notes "+(i+1)+" :");
			notes[i] = in.nextInt();
		}
	}

	public static void printTab(int tab[]) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " | ");
		}
		System.out.println();
	}
	
	// Affectation entre tableaux
	public static void affecte() {
		int t[] = {1,2};
		int tab[] = {5,6,8};
		
		printTab(t);
		printTab(tab);
		t = tab;
		printTab(t);
 	}

	private static void initTab2D(int[][] tab) {
		
		for (int i = 0; i < tab.length; i++) {
			System.out.println("Les notes S"+(5+i)+" :");
			for (int j = 0; j < tab[i].length; j++) {
				System.out.println("Saisir la notes "+(j+1)+" :");
				tab[i][j] = in.nextInt();
			}
		}
	}

	public static void printTab2D(int tab[][]) {
		
		for (int i = 0; i < tab.length; i++) {
			System.out.print("S"+(5+i)+" : ");
			for (int j = 0; j < tab[i].length; j++) {
				System.out.print(tab[i][j] + " | ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
