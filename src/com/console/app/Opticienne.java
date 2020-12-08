package com.console.app;

public class Opticienne extends Personne{
	public Opticienne (String nom, int age) {
		 super(nom, age);
	}
	
	public String afficher() {
		return super.afficher()+"Opticienne";
	}
}
