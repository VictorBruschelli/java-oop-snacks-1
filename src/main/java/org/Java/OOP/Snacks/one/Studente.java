package org.Java.OOP.Snacks.one;

public class Studente {
	
	private String nome;
	private String cognome;
	private int eta;
	
	public Studente( String nome, String cognome, int eta){
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	
	// con get
	public String getInfoStudente() {
		return this.nome + " " + this.cognome + ", " + this.eta + " anni";
	}
	
	/*
		public void info() {
			System.out.print(nome +" ");
			System.out.print(cognome +", ");
			System.out.print(eta + " anni");
		}
	*/

	public static void main(String[] args) {
		Studente studentessa = new Studente("Ester", "ferrara", 23);
		System.out.print(studentessa.getInfoStudente());
	}
		
	/*	Studente studente = new Studente();
		studente.optionStudent("Ester", "ferrara", 23);
		studente.info();

	}*/

}
/*
Scrivi una classe Studente con i seguenti attributi: nome, cognome, età.
 Implementa un costruttore che accetta tre parametri per inizializzare questi attributi. 
 Aggiungi un metodo che restituisca una stringa concatenata dei valori (es. Anselmo Bitta, 24 anni).*/
