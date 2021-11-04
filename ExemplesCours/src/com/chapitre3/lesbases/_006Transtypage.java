package com.chapitre3.lesbases;

public class _006Transtypage {

	public static void main(String[] args) {
		/* La conversion implicite (Automatique)
		 * se fait d'un type plus petit vers un autre
		 * plus grand.
		 * byte -> short -> char -> int 
		 * int -> long -> float -> double
		 */
		int n; 
		float f;
		n = 3;
		
		System.out.println("n= "+n);
		f = n; // Conversion implicite int -> float
		System.out.println("f= "+f);
		
		/* La conversion explicite (Force)
		 * se fait d'un type plus petit vers un autre
		 * plus grand.
		 */
		f = 3.0f;
		//n = f; // Erreur
		n = (int)f;
		System.out.println("f= "+f);
		System.out.println("n= "+n);
		
		// Dans des expressions
		
		/* La conversion d'ajustemetde type
		 * est une conversion implicite au 
		 * sein des expresions.
		 */
		long p=4;
		float x = 2;
		System.out.println("x= "+x);
		System.out.println("n * p + x= "+ (n * p + x)); // float
		
		/* La conversion systematique
		 * ou promotion numerique
		 * est une conversion de type byte 
		 * qui ne supporte pas lles operations
		 * vers des types plus grand.
		 */
		byte by = 1;
		System.out.println("by= "+by);
		System.out.println("n * by + x= "+ (n * by + x)); // float

		
	}

}
