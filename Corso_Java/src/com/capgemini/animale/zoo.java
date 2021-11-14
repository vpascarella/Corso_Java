package com.capgemini.animale;

public class zoo {

	public static void main(String[] args) {
		new zoo().start();
		System.out.println("Ciao");
		System.out.println("ciao");
		System.out.println("ciao");
		System.out.println("riprova con eclipse");

	}
	
	void start() {
		Animale a = new Gatto ();
		System.out.println(a.nome+" "+a.verso());
	}

}
