package com.capgemini.ereditarietà;

public class Rettangolo extends Quadrilatero{

	
	public Rettangolo(int lato1, int lato2) {
		super(lato1, lato2,lato1,lato2);
	}
	
	public void perimetro () {
		System.out.println("Perimetro del Rettangolo: "+(getLato1()+getLato2()+getLato3()+getLato4())); 
	}
	
}
