package com.capgemini.ereditarietà;

public class Test {

	public static void main(String[] args) {
		Quadrilatero q1 = new Quadrilatero(4, 5, 5, 6);
		q1.perimetro();
		Quadrilatero q2 = new Rettangolo(3, 4);
		q2.perimetro();
		Quadrilatero q3 = new Quadrato(5);
		q3.perimetro();
	}

}
