package com.capgemini.formeGeometriche;

public class Rettangolo {
	
	public Rettangolo () {
		
	}
	
	public static void stampaRettangolo (int a, int b) {
		System.out.println("\nStampa Rettangolo:");
		for (int i=0; i<a; i++) {
			for (int j=0; j<b; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
