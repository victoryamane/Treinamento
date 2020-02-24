package exec02;

/**
 * Classe criada para realizar operações (adiçao, subtração, multiplicação, divisão e modulo) 
 * @author vyamane
 * @since 11/02/2020
 * @version 0.1
 */

public class Operacoes {

	public static void main(String[] args) {
		// Exemplo de adição
		int adicao = 5 + 2;
		// Exemplo de subtração
		int subtracao = 5 - 2;
		// Exemplo de multiplicação
		int multiplicacao = 5 * 2;
		// Exemplo de divisão
		int divisao = 10 / 2;
		// Exemplo de modulo 
		// Equivale a 10 dividido por 3 que dá 3 com resto 1
		// O modulo devolve o valor do resto
		int modulo = 10 % 3;
		
		// Impressão dos resultados 
		System.out.println("Resultado da adição: " + adicao);
		System.out.println("Resultado da subtração: " + subtracao);
		System.out.println("Resultado da multiplicação: " + multiplicacao);
		System.out.println("Resultado da divisão: " + divisao);
		System.out.println("Resultado do modulo: " + modulo);

	}

}
