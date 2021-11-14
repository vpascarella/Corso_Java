package com.capgemini.formeGeometriche;

public class Rombo {

	public Rombo () {
		
	}
	
	public static void stampaRombo (int n) {
		System.out.println("\nStampa Rombo:");
		for (int i=n;i>0;i--) {
			for (int j=i; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=0; i<n; i++) {
			for (int j=i; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
}
