package com.console.app;

public class Personne {
		private String nom;
		private int age;
		
		public Personne(String nom, int age) {
			this.nom=nom;
			this.age=age;
		}

		public String getNom() {
			return nom;
		}
		
		public void setNom(String nom) {
			this.nom = nom;
		}
		
		public int getAge() {
			return age;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		public String afficher() {
			return "Je suis " + getNom() + " , j'ai " + getAge() + " ans et je travaille en tant que ";
		}
		
}
