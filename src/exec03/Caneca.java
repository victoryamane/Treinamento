package exec03;

/**
 * Classe que herda metodos de Produto
 * @author vyamane
 * @since 11/02/2020
 * @version 0.1
 */
public class Caneca extends Produto {
	// Declaração das variaveis
	boolean estampa = false;
	String material = "Vidro";
	String medida = "10CM";

	// Metodo Exibe Caneca
	public void exibirCaneca() {
		// Validação estampa
		if (estampa == true) {
			System.out.println("Tem estampa");
		} else {
			System.out.println("Não tem estampa");
		}
		// Validação material
		if (material != null) {
			System.out.println("Material: " + material);
		} else {
			System.out.println("Valor de material esta vazio");
		}		
		// Validação medida
		if (medida != null) {
			System.out.println("Medida: " + material);
		} else {
			System.out.println("Valor de medida esta vazio");
		}
	}
}
