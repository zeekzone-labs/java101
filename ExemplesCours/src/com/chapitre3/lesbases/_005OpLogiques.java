package com.chapitre3.lesbases;

public class _005OpLogiques {

	public static void main(String[] args) {
		int x = 4, y = 9, z = 3, t = 7;
		boolean bool;
		
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		System.out.println("z= "+z);
		System.out.println("t= "+t);
		
		bool = x < y;
		System.out.println("x < y ="+bool);
		
		bool = (x < y) && (z == t);
		System.out.println("(x < y) && (z == t) ="+bool);
		
		bool = (x < y) & (z == t);
		System.out.println("(x < y) & (z == t) ="+bool);
		
		bool = (x < y) || (z == t);
		System.out.println("(x < y) || (z == t) ="+bool);
		
		bool = (x < y) | (z == t);
		System.out.println("(x < y) | (z == t) ="+bool);
		
		int i = 10, j = 5;
		
		System.out.println("i= "+i+" j= "+j);
		
		bool = i < 5 && j++ < 10;
		System.out.println("i < 5 && j++ < 10 ="+bool);
		System.out.println("i= "+i+" j= "+j);
		
		bool = i < 15 && j++ < 10;
		System.out.println("i < 15 && j++ < 10 ="+bool);
		System.out.println("i= "+i+" j= "+j);
		
		bool = i < 15 | j++ < 10;
		System.out.println("i < 15 | j++ < 10 ="+bool);
		System.out.println("i= "+i+" j= "+j);
		
		
		
		
		
	}

}
