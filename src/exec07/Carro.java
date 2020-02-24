package exec07;

/**
 * Classe de carro
 * 
 * @author vyamane
 * @since 13/02/2020
 * @version 0.1
 */

public class Carro {
	String modelo;
	String placa;
	int velocidadeMaxima;
	String combustivel;
	double valor;
	String cor;
	boolean vendido = false;
	
	public Carro () {
		
	}

	public Carro(String modelo, String placa, int velocidadeMaxima, String combustivel, double valor, String cor) {
		this.modelo = modelo;
		this.placa = placa;
		this.velocidadeMaxima = velocidadeMaxima;
		this.combustivel = combustivel;
		this.valor = valor;
		this.cor = cor;
	}
	
	public void exibeResultado() {
		System.out.println("Modelo: " + modelo);
		System.out.println("Placa: " + placa);
		System.out.println("Velocidade Maxima: " + velocidadeMaxima + " KM/H");
		System.out.println("Tipo de combustivel: " + combustivel);
		System.out.println("Valor: R$" + valor);
		System.out.println("Cor: " + cor);
	}
}
