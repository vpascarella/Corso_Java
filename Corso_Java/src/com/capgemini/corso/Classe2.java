package com.capgemini.corso;

public class Classe2 {

	private static String campo1 = "Ciao sono variabile di instanza";
	private static Integer numero = 1;
	
	public Classe2() {	
	}
	
	public static void main(String[] args) {
		
		metodo1();
		
	}
	
	private static void metodo1() {
		String campo1= "Ciao sono una variabile locale" + numero;
		System.out.println(campo1);
	}
	
}
