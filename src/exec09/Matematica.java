package exec09;

/**
 * Classe teste matematica
 * @author vyamane
 *@since 17/02/2020
 *@version 0.1
 */


public class Matematica {
	public static void main(String[] args) {
		double x = 10, y = 20.3, z = -30;
		// Valor absoluto
		double abs = Math.abs(z);
		System.out.println("Numero absoluto: " + abs);
		// Retorna menor valor inteiro
		double ceil = Math.ceil(y);
		System.out.println("Valor arredondado: " + ceil);
		double floor = Math.floor(y);
		System.out.println("Valor arredondado: " + floor);
		// Calcula logaritimo
		double log = Math.log(x);
		System.out.println("Valor do logaritimo: " + log);
		// Retorna o maior numero entre os dois
		double max = Math.max(x, y);
		System.out.println("O maior numero: " + max);
		// Retorna o menor numero entre os dois
		double min = Math.min(x, y);
		System.out.println("O maior numero: " + min);
		// Retorna a potencia
		double pow = Math.pow(x, 2);
		System.out.println("Potencia: " + pow);
		// Retorna a raiz quadrada
		double sqrt = Math.sqrt(x);
		System.out.println("Raiz quadrada: " + sqrt);
		// Retorna coseno
		double cos = Math.cos(x);
		System.out.println("Coseno: " + cos);
		// Retorna seno
		double sin = Math.sin(x);
		System.out.println("Seno: " + sin);
		// Retorna tangente
		double tan = Math.tan(x);
		System.out.println("Tangente: " + tan);
	}

}