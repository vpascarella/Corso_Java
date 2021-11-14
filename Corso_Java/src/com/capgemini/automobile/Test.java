package com.capgemini.automobile;

public class Test {

	public static void main(String[] args) {
		
		Automobile a = new Automobile(1200, "Fiat", "Bianca", true);
		Automobile a1 = new Automobile(1200, "Ford", "Rossa");
		
		a.movimento(a);
		a1.movimento(a1);
		
		
		
		
	}
}
