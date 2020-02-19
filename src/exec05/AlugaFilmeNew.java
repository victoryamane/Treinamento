package exec05;

import java.util.Scanner;

/**
 * Classe AlugaFilme verifica disponibilidade e valor
 * 
 * @author vyamane
 * @since 12/02/2020
 * @version 0.2
 */

public class AlugaFilmeNew {

	// Declaração das variaveis
	double valorAluguelDiario = 6.00;
	double valorPago;
	int qtdeDias;
	String filmeAlugado;
	boolean filmeInceptionDisponivel = true;
	boolean filmeStolenDisponivel = true;
	Scanner sc = new Scanner(System.in);

	// Metodo de Disponibilidade Filme Inception
	public boolean verificaDiponibilidadeFilme(String filmeAlugado) {
		System.out.println("Informe o filme desejado (Inception ou Stolen): ");
		filmeAlugado = sc.nextLine();

		if (filmeAlugado.equals("Inception")) {
			System.out.println("Filme disponivel");
			return true;
		} else if (filmeAlugado.equals("Stolen")) {
			System.out.println("Filme disponivel");
			return true;
		} else {
			System.out.println("Filme não disponivel");
			return false;
		}
	}
	// Metodo Verifica Valor
	public void verificaValor(double valorPago) {
		System.out.println("Informe a quandidade de dias desejados: ");
		qtdeDias = sc.nextInt();
		double valorTotal = qtdeDias * valorAluguelDiario;
		System.out.println("Valor total a ser pago R$" + valorTotal);
		System.out.println("Informe o valor a ser pago: ");
		valorPago = sc.nextDouble();

		// Condição para valor
		if (valorPago > valorTotal) {
			double valorTroco = valorPago - valorTotal;
			System.out.println("Seu troco: R$" + valorTroco);
			System.out.println("Alugado com sucesso");
		} else if (valorPago == valorTotal) {
			System.out.println("Alugado com sucesso");
		} else {
			System.out.println("Valor insuficiente");
		}
	}

	// Metodo Exibir
	public void exbibirAlugarFilmeNew() {
		verificaDiponibilidadeFilme(filmeAlugado);
		 verificaValor(valorPago);

		// Condição para filmes diferentes
		//if (verificaDiponibilidadeFilme(filmeAlugado) == true) {
			//verificaValor(valorPago);
		//} else {
			//System.out.println("Filme indisponivel");
		//}
	}

	// Executa os metodos
	public static void main(String[] args) {
		AlugaFilmeNew filme = new AlugaFilmeNew();
		filme.exbibirAlugarFilmeNew();
	}
}
