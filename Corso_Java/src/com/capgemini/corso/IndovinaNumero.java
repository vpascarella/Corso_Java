package com.capgemini.corso;

public class IndovinaNumero {

	public static void main(String[] args) {
		
		int n = 5;
		n=n*2;
		int totale = n+12;
		totale = totale - (totale/2);
		System.out.println("risultato: " + totale);
		n++;
		System.out.println(n);
	}
	
}
