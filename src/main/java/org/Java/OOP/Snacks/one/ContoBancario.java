package org.Java.OOP.Snacks.one;

public class ContoBancario {
	private int numeroConto;
	private double saldo;
	
	public ContoBancario(int numeroConto) {
		this.numeroConto = numeroConto;
		this.saldo = 0.0D;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void deposita(int numeroDepositato) {
		this.saldo += numeroDepositato;
	}
	
	public void preleva(double numeroPrelevato) {
		double saldoEventuale = this.saldo - numeroPrelevato;
		if(saldoEventuale > 0 && numeroPrelevato > 0) {
			this.saldo = saldoEventuale;
			System.out.println("hai prelevato: " + numeroPrelevato + " il tuo saldo attuale e di: " + saldoEventuale);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContoBancario mioConto = new ContoBancario(40028922);
		System.out.println(mioConto.numeroConto);
		System.out.println(mioConto.getSaldo());
		mioConto.deposita(4500);
		System.out.println(mioConto.getSaldo());
		mioConto.preleva(400);
		
		
	
	}

}

//Crea una classe ContoBancario con attributi per numero di conto e saldo.
//Implementa un costruttore che accetta il numero di conto e inizializza il saldo a zero. 
//Aggiungi metodi pubblici per depositare denaro sul conto,
//prelevare denaro dal conto e ottenere il saldo corrente

