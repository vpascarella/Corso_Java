package com.capgemini.ereditarietà;

public class Quadrato extends Quadrilatero{

	
	public Quadrato(int lato1) {
		super(lato1, lato1, lato1, lato1);
	}

	public void perimetro () {
		System.out.println("Perimetro del quadrato: "+(getLato1()+getLato2()+getLato3()+getLato4())); 
	}
}
