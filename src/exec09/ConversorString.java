package exec09;

/**
 * Classe teste conversor de String
 * @author vyamane
 *@since 17/02/2020
 *@version 0.1
 */

public class ConversorString {
	public static void main(String[] args) {
		String lista[] = new String[5];
		lista[0] = "Java";
		// Original
		String str = lista[0];
		// Maiscula
		String maiuscula = str.toUpperCase();
		// Minuscula
		String minuscula = str.toLowerCase();

		// Impressão dos resultados
		System.out.println("Original: " + str);
		System.out.println("Maiuscula: " + maiuscula);
		System.out.println("Minuscula: " + minuscula);
	}
}
