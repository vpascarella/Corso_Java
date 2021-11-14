package com.capgemini.corso;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Classe3 {
	
	public static void main(String[] args) {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			System.out.println("Scrivi il tuo nome: ");
			String nome = input.readLine();
			System.out.println("eta");
			Integer eta =Integer.parseInt(input.readLine()) ;
			System.out.println("Il tuo nome e': " + nome+" eta: "+eta);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Errore!");
		}
		
	}

}
