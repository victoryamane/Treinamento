package exec03;

/**
 * Cria��o classe Produto e seus m�todos
 * @author vyamane
 * @since 11/02/2020
 * @version 0.1
 */

public class Produto {
	// Declara��o de variaveis
	String nome = "";
	int quantidade = 0;
	double custo = 0;
	int quantidadeVendida = 0;
	double percentualDeLucro = 0;
	double resultado = 0;

	// Cria��o m�todo Exibe Nome
	public void exibirNome() {
		if (nome != null) {
			System.out.println("Nome do produto: " + nome);
		} else {
			System.out.println("O campo nome n�o foi valorizado");
		}
	}

	// Cria��o m�todo Exibe Valor
	public void exibirValor() {
		if (custo > 0) {
			System.out.println("Valor do produto: " + custo);
		} else {
			System.out.println("O campo valor n�o foi valorizado");
		}
	}

	// Cria��o m�todo Exibe Lucro
	public void exibirLucro() {
		if (percentualDeLucro > 0) {
			resultado = (percentualDeLucro / 100) * custo;
			System.out.println("Percentual de lucro: " + resultado);
		} else {
			System.out.println("O campo valor n�o foi valorizado");
		}
	}

	// Cria��o m�todo Exibe Tudo
	public void exibirTudo() {
		exibirNome();
		exibirValor();
		exibirLucro();

	}

}
