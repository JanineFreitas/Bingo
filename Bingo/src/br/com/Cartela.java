package br.com;
import java.util.Random;

public class Cartela {
	private int id;
	private int numeros[];
	private int quantidadeCertos;
	
	public Cartela(int id){
		this.id = id;
		numeros = new int[15];
		quantidadeCertos = 0;
		popularNumeros();
	}
	
	public void popularNumeros(){
		Random gerador = new Random();
		for (int i = 0; i < numeros.length; i++) {
			int j = gerador.nextInt(99);
			numeros[i] = j == 0 ? gerador.nextInt(98) : j;
		}
	}
	
	public void mostrarNumeros(){
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " - ");
		}
		System.out.println();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int[] getNumeros() {
		return numeros;
	}

	public void setNumeros(int[] numeros) {
		this.numeros = numeros;
	}

	public int getQuantidadeCertos() {
		return quantidadeCertos;
	}

	public void setQuantidadeCertos() {
		this.quantidadeCertos++;
	}
}
