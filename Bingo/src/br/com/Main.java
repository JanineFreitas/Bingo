package br.com;

public class Main {

	public static void main(String[] args) {
		Bingo b1 = new Bingo(10);
		int posicao = 0;
		
		b1.criarCartelas();
		
		while(b1.verificarSeExisteGanhadores()==false){
			int numero = b1.sortearNumero(posicao);
			System.out.println(posicao + "- Número sorteado: "+numero);
			b1.verificarSeExisteNumeroSorteado(numero);
			posicao++;
		}
		
		b1.exibirGanhadores();
		
	}

}
