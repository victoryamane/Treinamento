package exec03;

/**
 * Classe que herda metodos de Produto
 * @author vyamane
 * @since 11/02/2020
 * @version 0.1
 */
public class Caneta extends Produto {
	// Declaração das variaveis
	String cor = "azul";
	String formato = "Padrão";
	String marca = "Bic";

	// Metodo Exibe Caneca
	public void exibirCaneta() {
		// Validação cor
		if (cor != null) {
			System.out.println("Cor: " + cor);
		} else {
			System.out.println("Valor de cor esta vazio");
		}
		// Validação formato
		if (formato != null) {
			System.out.println("Formato: " + formato);
		} else {
			System.out.println("Valor de formato esta vazio");
		}		
		// Validação medida
		if (marca != null) {
			System.out.println("Marca: " + marca);
		} else {
			System.out.println("Valor de marca esta vazio");
		}
	}
}