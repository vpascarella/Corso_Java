package com.capgemini.corso;

import java.util.Scanner;

public class Classe4 {
public static void main(String[] args) {
	
	String s="";
	Scanner sc= new Scanner (System.in);
	
	do {
	
		System.out.print("Inserisci un carattere (carattere 'x' per uscire): ");
		s=sc.nextLine();
		
		
	}while(s==null || !s.equalsIgnoreCase("x"));
	
}
	
	
}
