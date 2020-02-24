package exec08;

import javax.swing.JOptionPane;

/**
 * Classe responsável por demonstrar o fluxo de saque de um caixa eletrônico com
 * notas de 2, 5, 10, 20 e 50
 * 
 * @author vyamane
 * @since 17/02/2020
 * @version 0.2
 */

public class CaixaEletronico {

	// Construtor sem parametro
	public CaixaEletronico() {
		exibirMenu();
	}

	// Metodo exibe menu
	public void exibirMenu() {
		boolean escolha = true;

		// Solicita a escolha desejada 
		while (escolha) {
			try {
				String aux = JOptionPane.showInputDialog("Digite um número para escolher a opção\n1 - Sacar dinheiro\n9 - Sair");

				if (aux == null) {
					aux = "9";
				}

				int opc = Integer.parseInt(aux);

				switch (opc) {
				case 1:
					try {
						String valorSaque = JOptionPane.showInputDialog("Digite o valor que deseja sacar:");
						if (valorSaque != null) {
							calculaSaque(Integer.parseInt(valorSaque));
						}
					} catch (NullPointerException N) {}
					break;
				case 9:
					escolha = false;
					break;
				default:
					JOptionPane.showMessageDialog(null, "ERRO!\n\nDigite uma opção válida");
				}
			} catch (NumberFormatException E) {
				JOptionPane.showMessageDialog(null, "ERRO!\n\nREVEJA COMO VOCÊ DIGITOU.\nDIGITE APENAS NÚMEROS\n\nLEMBRETE:\nNÃO É POSSÍVEL FAZER SAQUES COM MOEDA\nVEJA SE VOCÊ NÃO DIGITOU ESPAÇO NO CAMPO DE DIGITAÇÃO");
				exibirMenu();
			}
		}
	}

	public void calculaSaque(int valorSacado) {
		int notas50 = 0, notas20 = 0, notas10 = 0, notas5 = 0, notas2 = 0, valorTotal = valorSacado;
		boolean possivelSaque = true;

		// Realiza o possivel saque
		while (valorTotal != 0 && possivelSaque) {
			if (valorTotal >= 50 && ((valorTotal - 50 != 3) && (valorTotal - 50 != 1))) {
				valorTotal = valorTotal - 50;
				notas50++;
			} else if (valorTotal >= 20 && ((valorTotal - 20 != 3) && (valorTotal - 20 != 1))) {
				valorTotal = valorTotal - 20;
				notas20++;
			} else if (valorTotal >= 10 && ((valorTotal - 10 != 3) && (valorTotal - 10 != 1))) {
				valorTotal = valorTotal - 10;
				notas10++;
			} else if (valorTotal >= 5 && ((valorTotal - 5 != 3) && (valorTotal - 5 != 1))) {
				valorTotal = valorTotal - 5;
				notas5++;
			} else if (valorTotal >= 2 && (valorTotal - 2 != 1 && valorTotal - 2 != -1)) {
				valorTotal = valorTotal - 2;
				notas2++;
			} else {
				possivelSaque = false;
			}
		}

		if (possivelSaque) {
			JOptionPane.showMessageDialog(null, "SAQUE REALIZADO COM SUCESSO!\n\n" + notas50 + " notas de 50\n" + notas20 + " notas de 20\n" + notas10
					+ " notas de 10\n" + notas5 + " notas de 5\n" + notas2 + " notas de 2");
		} else {
			JOptionPane.showMessageDialog(null, "Não foi possível realizar um saque de " + valorSacado);
		}
	}

	public static void main(String[] args) {

		new CaixaEletronico();

	}
}
