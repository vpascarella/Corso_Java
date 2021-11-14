package com.capgemini.corso;

public class Persona {
	
	private String nome;
	private String email;
	
	public Persona (String nome, String email) {
		this.nome=nome;
		this.email=email;
	}
	
	public static void main(String[] args) {
		
		Persona p = new Persona("alex","@gmail.com");
		p.verticalPrint(p.getNome().length());
		
	}
	
	private void verticalPrint(int length) {
		String nome = "Gianni";
		length = nome.length();
		for(int i=0; i<length;i++) {
			System.out.println(nome.charAt(i));
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
}
