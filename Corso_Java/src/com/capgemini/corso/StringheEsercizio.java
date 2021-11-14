package com.capgemini.corso;

import java.util.Scanner;

public class StringheEsercizio {
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner (System.in);
//		System.out.print("Inserisci la prima stringa: ");
//		String line = sc.nextLine();
//		System.out.print("Inserisci la seconda stringa: ");
//		String substr = sc.nextLine();
//		if(line.indexOf(substr)!= -1)
//			System.out.println("Stringa contenuta");
//		else
//			System.out.println("Stringa diversa");
		String str = "Mario";
		StringBuffer string = new StringBuffer(str);
		string.append(" Rossi");
		System.out.println(string.toString());
		string.insert(0, "dott. " );
		System.out.println(string.toString());
		
		
	}

}
