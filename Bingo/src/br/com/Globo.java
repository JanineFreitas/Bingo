package br.com;

import java.util.Random;

public class Globo {
	private int numeroSorteado;

	public int getNumeroSorteado() {
		Random gerador = new Random();
		int j = gerador.nextInt(99);
		numeroSorteado = j == 0 ? this.getNumeroSorteado() : j;
		return numeroSorteado;
	}

	public void setNumeroSorteado(int numeroSorteado) {
		this.numeroSorteado = numeroSorteado;
	}
}
