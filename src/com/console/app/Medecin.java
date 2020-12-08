package com.console.app;

public class Medecin extends Personne{
		public Medecin (String nom, int age) {
			 super(nom, age);
		}
		public String afficher() {
			return super.afficher()+"Medecin";
		}
}
