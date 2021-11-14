package com.capgemini.formeGeometriche;

public class FormeGeometriche {

	public static void main(String[] args) {	
		
		stringaAsterischi (5);		
		Rettangolo.stampaRettangolo(5, 8);		
		Quadrato.stampaQuadrato(5);
		Rombo.stampaRombo(5);
		
		
	}
	
	public static void stringaAsterischi (int n) {
		System.out.println("Stampa Asterischi:");
		for (int i=0; i<n; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}
