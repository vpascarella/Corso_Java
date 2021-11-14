package com.capgemini.automobile;

public class Automobile {
	
	private Integer cilindrata;
	private String marca;
	private String colore;
	private Boolean accensione;
	
	public Automobile(Integer cilindrata, String marca, String colore, Boolean accensione) {
		super();
		this.cilindrata = cilindrata;
		this.marca = marca;
		this.colore = colore;
		this.accensione = accensione;
	}
	
	

	public Automobile(Integer cilindrata, String marca, String colore) {
		super();
		accensione= false;
		this.cilindrata = cilindrata;
		this.marca = marca;
		this.colore = colore;
	}



	public Integer getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(Integer cilindrata) {
		this.cilindrata = cilindrata;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public Boolean getAccensione() {
		return accensione;
	}

	public void setAccensione(Boolean accensione) {
		this.accensione = accensione;
	}
	
	
	public void movimento (Automobile a) {
		if (a.accensione==true) {
			System.out.println("La macchina "+ a.getMarca()+" si muove");
		}
		else {
			System.out.println("La macchina "+ a.getMarca()+" e' ferma");
		}
		
	}
	

	@Override
	public String toString() {
		return "Automobile [cilindrata=" + cilindrata + ", marca=" + marca + ", colore=" + colore + ", accensione="
				+ accensione + "]";
	}
	
	

}
