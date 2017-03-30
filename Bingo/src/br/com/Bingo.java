package br.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bingo {
	private Cartela[] cartelas;
	private Globo globo;
	private List<Integer> numerosSorteados;
	private List<Cartela> cartelasGanhadoras;
	private int quantidadeCartelas;
	private boolean isFim = false;

	public Bingo(int quantidadeCartelas) {
		this.quantidadeCartelas = quantidadeCartelas;
		numerosSorteados = new ArrayList<>();
		cartelasGanhadoras = new ArrayList<>();
		cartelas = new Cartela[quantidadeCartelas];
		for (int i = 1; i <= 98; i++) {
			numerosSorteados.add(i);
		}
		Collections.shuffle(numerosSorteados);
	}

	public int sortearNumero(int posicao){
		return numerosSorteados.get(posicao);
	}
	
	public void criarCartelas(){
		for (int i = 0; i < quantidadeCartelas; i++) {
			cartelas[i] = new Cartela();
		}
	}
	
	public void verificarSeExisteNumeroSorteado(int numeroSorteado){
		for (int i = 0; i < cartelas.length; i++) {
			int[] numeros = cartelas[i].getNumeros();
			for (int j = 0; j < numeros.length; j++) {
				if(numeros[j] == numeroSorteado){
					cartelas[i].setQuantidadeCertos();
					break;
				}
			}
		}
	}
	
	public boolean verificarSeExisteGanhadores(){
		boolean existeVendedores = false;
		for (int i = 0; i < cartelas.length; i++) {
			if(cartelas[i].getQuantidadeCertos()==15){
				cartelasGanhadoras.add(cartelas[i]);
				existeVendedores = true;
			}
		}
		return existeVendedores;
	}
	
	public void exibirGanhadores(){
		for (int i = 0; i < cartelasGanhadoras.size(); i++) {
			System.out.println("Cartela ganhadora id" +cartelasGanhadoras.get(i).getId());
			cartelasGanhadoras.get(i).mostrarNumeros();
		}
	}
	
	public Cartela[] getCartelas() {
		return cartelas;
	}

	public void setCartelas(Cartela[] cartelas) {
		this.cartelas = cartelas;
	}

	public Globo getGlobo() {
		return globo;
	}

	public void setGlobo(Globo globo) {
		this.globo = globo;
	}

	public List<Cartela> getCartelasGanhadoras() {
		return cartelasGanhadoras;
	}

	public void setCartelasGanhadoras(List<Cartela> cartelasGanhadoras) {
		this.cartelasGanhadoras = cartelasGanhadoras;
	}

	public boolean isFim() {
		return isFim;
	}

	public void setFim(boolean isFim) {
		this.isFim = isFim;
	}

	public List<Integer> getNumerosSorteados() {
		return numerosSorteados;
	}

	public void setNumerosSorteados(List<Integer> numerosSorteados) {
		this.numerosSorteados = numerosSorteados;
	}

}
