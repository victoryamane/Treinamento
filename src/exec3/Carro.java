package exec3;

/**
 * Classe que herda metodos de Produto
 * @author vyamane
 * @since 11/02/2020
 * @version 0.1
 */

public class Carro extends Produto {
	// Declara��o das variaveis
	String marca = "Toyota";
	String modelo = "Corolla";
	String ano = "2019";
	String cor = "Preto";
	String motor;

	// Metodo Exibe Carro
	public void exibirCarro() {
		// Valida��o marca
		if (marca != null) {
			System.out.println("Marca: " + marca);
		} else {
			System.out.println("Valor de marca esta vazio");
		}
		// Valida��o modelo
		if (modelo != null) {
			System.out.println("Modelo: " + modelo);
		} else {
			System.out.println("Valor de modelo esta vazio");
		}
		// Valida��o ano
		if (ano != null) {
			System.out.println("Ano: " + ano);
		} else {
			System.out.println("Valor de marca esta vazio");
		}
		// Valida��o cor
		if (cor != null) {
			System.out.println("Cor: " + cor);
		} else {
			System.out.println("Valor de cor esta vazio");
		}
		// Valida��o motor
		if (motor != null) {
			System.out.println("Motor: " + motor);
		} else {
			System.out.println("Valor de motor esta vazio");
		}
	}
}
