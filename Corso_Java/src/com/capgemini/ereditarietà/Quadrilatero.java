package com.capgemini.ereditarietà;

public class Quadrilatero {
	
	private int lato1;
	private int lato2;
	private int lato3;
	private int lato4;
	public Quadrilatero(int lato1, int lato2, int lato3, int lato4) {
		super();
		this.lato1 = lato1;
		this.lato2 = lato2;
		this.lato3 = lato3;
		this.lato4 = lato4;
		
	}
	public int getLato1() {
		return lato1;
	}
	public void setLato1(int lato1) {
		this.lato1 = lato1;
	}
	public int getLato2() {
		return lato2;
	}
	public void setLato2(int lato2) {
		this.lato2 = lato2;
	}
	public int getLato3() {
		return lato3;
	}
	public void setLato3(int lato3) {
		this.lato3 = lato3;
	}
	public int getLato4() {
		return lato4;
	}
	public void setLato4(int lato4) {
		this.lato4 = lato4;
	}
	
	public void perimetro () {
		System.out.println("Perimetro del: "+(lato1+lato2+lato3+lato4)); 
	}

}
