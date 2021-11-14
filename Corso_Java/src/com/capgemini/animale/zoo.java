package com.capgemini.animale;

public class zoo {

	public static void main(String[] args) {
		new zoo().start();
	}
	
	void start() {
		Animale a = new Gatto ();
		System.out.println(a.nome+" "+a.verso());
	}

}
