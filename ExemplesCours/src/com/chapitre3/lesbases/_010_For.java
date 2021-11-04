package com.chapitre3.lesbases;

public class _010_For {
	public static void main(String[] args) {
		
		
		for (int i = 0; i < 20; i++) {
			System.out.println(i+": Binevenu(e) dans notre boucle.");
		}
		
		// Break
		start: 
		for (int i = 0; i < 20; i++) {
			if (i==6) {
				break start;
			}
			System.out.println(i+": Binevenu(e) dans notre boucle.");
		}
		System.out.println("label");
	}
}
