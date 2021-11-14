package com.capgemini.formeGeometriche;

public class Quadrato {

	public Quadrato() {
		
	}
	
	public static void stampaQuadrato (int n) {
		System.out.println("\nStampa Quadrato:");
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}
