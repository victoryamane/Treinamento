package exec03;

/**
 * Criação classe Produto e seus métodos
 * @author vyamane
 * @since 11/02/2020
 * @version 0.1
 */

public class Produto {
	// Declaração de variaveis
	String nome = "";
	int quantidade = 0;
	double custo = 0;
	int quantidadeVendida = 0;
	double percentualDeLucro = 0;
	double resultado = 0;

	// Criação método Exibe Nome
	public void exibirNome() {
		if (nome != null) {
			System.out.println("Nome do produto: " + nome);
		} else {
			System.out.println("O campo nome não foi valorizado");
		}
	}

	// Criação método Exibe Valor
	public void exibirValor() {
		if (custo > 0) {
			System.out.println("Valor do produto: " + custo);
		} else {
			System.out.println("O campo valor não foi valorizado");
		}
	}

	// Criação método Exibe Lucro
	public void exibirLucro() {
		if (percentualDeLucro > 0) {
			resultado = (percentualDeLucro / 100) * custo;
			System.out.println("Percentual de lucro: " + resultado);
		} else {
			System.out.println("O campo valor não foi valorizado");
		}
	}

	// Criação método Exibe Tudo
	public void exibirTudo() {
		exibirNome();
		exibirValor();
		exibirLucro();

	}

}
