package exec5;

/**
 * Classe AlugaFilme verifica disponibilidade e valor
 * @author vyamane
 * @since 12/02/2020
 * @version 0.1
 */

public class AlugaFilme {

	// Declaração das variaveis
	double valorAluguelDiario = 6.99;
	double valorPago = 8.99;
	int qtdeDias = 1;
	String filmeAlugado =  "Inception";
	boolean filmeInceptionDisponivel = false;
	boolean filmeStolenDisponivel = false;
		
		// Metodo de Disponibilidade Filme Inception 
		public boolean verificaDiponibilidadeFilme1 (String filmeAlugado){
			if (filmeAlugado == "Inception") {
				System.out.println("Filme disponivel");			
				return true;
				} else {
					System.out.println("Filme não disponivel");
					return false;
				}
		}
		// Metodo de Disponibilidade Filme Stolen 
		public boolean verificaDiponibilidadeFilme2 (String filmeAlugado){
			if (filmeAlugado == "Stolen") {
				System.out.println("Filme disponivel");
				return true;
			} else {
				System.out.println("Filme não disponivel");
				return false;
				}
		}				
		// Metodo Verifica Valor Menor 
		public void verificaValorMenor (double valorPago){
			if (valorPago < valorAluguelDiario) {
				System.out.println("Valor insuficiente");			
			} else {
				System.out.println("Alugado com sucesso");
				}
		}
		// Metodo Verifica Valor Maior 
		public void verificaValorMaior (double valorPago){
			if (valorPago > valorAluguelDiario) {
				double valorTroco = valorPago - valorAluguelDiario;
				System.out.println("Seu troco: R$" + valorTroco);
				System.out.println("Alugado com sucesso");			
			} 
		}
		
		// Metodo Exibir
		public void exbibirAlugarFilme(){			
			verificaDiponibilidadeFilme1(filmeAlugado);
			verificaDiponibilidadeFilme2(filmeAlugado);
			verificaValorMaior(valorPago);
			verificaValorMenor (valorPago);
		}		
		
		
		public static void main(String[] args) {
			AlugaFilme filme = new AlugaFilme ();
			filme.exbibirAlugarFilme();			
		}
	}

