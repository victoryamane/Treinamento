package exec02;

/**
 * Classe criada para realizar opera��es (adi�ao, subtra��o, multiplica��o, divis�o e modulo) 
 * @author vyamane
 * @since 11/02/2020
 * @version 0.1
 */

public class Operacoes {

	public static void main(String[] args) {
		// Exemplo de adi��o
		int adicao = 5 + 2;
		// Exemplo de subtra��o
		int subtracao = 5 - 2;
		// Exemplo de multiplica��o
		int multiplicacao = 5 * 2;
		// Exemplo de divis�o
		int divisao = 10 / 2;
		// Exemplo de modulo 
		// Equivale a 10 dividido por 3 que d� 3 com resto 1
		// O modulo devolve o valor do resto
		int modulo = 10 % 3;
		
		// Impress�o dos resultados 
		System.out.println("Resultado da adi��o: " + adicao);
		System.out.println("Resultado da subtra��o: " + subtracao);
		System.out.println("Resultado da multiplica��o: " + multiplicacao);
		System.out.println("Resultado da divis�o: " + divisao);
		System.out.println("Resultado do modulo: " + modulo);

	}

}
