package exec07;

import javax.swing.JOptionPane;

/**
 * Classe de locadora - Pesquisa por modelo, velocidade, combustivel e cor,
 * depois efetua a compra e retorna lista sem o carro vendido
 * 
 * @author vyamane
 * @since 13/02/2020
 * @version 0.1
 */

public class Locadora {
	// Criação e atribuição dos vetores
	Carro vetorCarro[] = new Carro[20];
	int posicao = 0;

	// Metodo que adiciona carro
	public boolean adicionaCarro(Carro carro) {
		if (posicao >= vetorCarro.length)
			return false;

		vetorCarro[posicao++] = carro;
		return true;
	}

	// Metodo exibe o adiciona carro

	public void exibeAdicionaCarro() {
		String modelo = JOptionPane.showInputDialog("Informe o modelo: ").toUpperCase();
		String placa = JOptionPane.showInputDialog("Informe a placa: ").toUpperCase();
		int velocidadeMaxima = Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade maxima: "));
		String combustivel = JOptionPane.showInputDialog("Informe o tipo de combustivel: ").toUpperCase();
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor: "));
		String cor = JOptionPane.showInputDialog("Informe a cor: ").toUpperCase();

		Carro carro = new Carro(modelo, placa, velocidadeMaxima, combustivel, valor, cor);
//		boolean adicionou = adicionaCarro(carro);
		if (adicionaCarro(carro)) {
			JOptionPane.showMessageDialog(null, "Carro adicionado com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, "Garagem lotada");
		}
	}

	// Metodo que exibe por modelo
	public void exibeModelo() {
		boolean encontrou = false;
		String message = "";
		String modeloCarro = JOptionPane.showInputDialog("Informe o modelo desejado: ").toUpperCase();
		for (int i = 0; i < posicao; i++) {
			if (vetorCarro[i].modelo.equals(modeloCarro)) {
				message = message + "\n Modelo do carro: " + vetorCarro[i].modelo + "\n" + "\n Placa: "
						+ vetorCarro[i].placa + "\n" + "\n Velocidade maxima: " + vetorCarro[i].velocidadeMaxima + "\n"
						+ "\n Tipo de combustivel: " + vetorCarro[i].combustivel + "\n" + "\n Valor do carro: "
						+ vetorCarro[i].valor + "\n" + "\n Cor: " + vetorCarro[i].cor;
				encontrou = true;
			}
		}
		if (!encontrou) {
			JOptionPane.showMessageDialog(null, "Não encontrou!");
		} else {
			JOptionPane.showMessageDialog(null, message);
		}
	}

	// Metodo que exibe por velocidade maxima
	public void exibeVelocidade() {
		boolean encontrou = false;
		String message = "";
		String velocidadeCarro = JOptionPane.showInputDialog("Informe velocidade maxima desejada: ").toUpperCase();
		int velocidadeMaxima = Integer.parseInt(velocidadeCarro);
		for (int i = 0; i < posicao; i++) {
			if (vetorCarro[i].velocidadeMaxima == velocidadeMaxima) {
				message = message + "\n Modelo do carro: " + vetorCarro[i].modelo + "\n" + "\n Placa: "
						+ vetorCarro[i].placa + "\n" + "\n Velocidade maxima: " + vetorCarro[i].velocidadeMaxima + "\n"
						+ "\n Tipo de combustivel: " + vetorCarro[i].combustivel + "\n" + "\n Valor do carro: "
						+ vetorCarro[i].valor + "\n" + "\n Cor: " + vetorCarro[i].cor;
				encontrou = true;
			}
		}
		if (!encontrou) {
			JOptionPane.showMessageDialog(null, "Não encontrou!");
		} else {
			JOptionPane.showMessageDialog(null, message);
		}
	}

	// Metodo que exibe por tipo de combustivel
	public void exibeCombustivel() {
		boolean encontrou = false;
		String message = "";
		String combustivelCarro = JOptionPane.showInputDialog("Informe o tipo de combustivel desejado: ").toUpperCase();
		for (int i = 0; i < posicao; i++) {
			if (vetorCarro[i].combustivel.equals(combustivelCarro)) {
				message = message + "\n Modelo do carro: " + vetorCarro[i].modelo + "\n" + "\n Placa: "
						+ vetorCarro[i].placa + "\n" + "\n Velocidade maxima: " + vetorCarro[i].velocidadeMaxima + "\n"
						+ "\n Tipo de combustivel: " + vetorCarro[i].combustivel + "\n" + "\n Valor do carro: "
						+ vetorCarro[i].valor + "\n" + "\n Cor: " + vetorCarro[i].cor;
				encontrou = true;
			}
		}
		if (!encontrou) {
			JOptionPane.showMessageDialog(null, "Não encontrou!");
		} else {
			JOptionPane.showMessageDialog(null, message);
		}
	}

	// Metodo que exibe por cor
	public void exibeCor() {
		boolean encontrou = false;
		String message = "";
		String corCarro = JOptionPane.showInputDialog("Informe a cor desejada: ").toUpperCase();
		for (int i = 0; i < posicao; i++) {
			if (vetorCarro[i].cor.equals(corCarro)) {
				message = message + "\n Modelo do carro: " + vetorCarro[i].modelo + "\n" + "\n Placa: "
						+ vetorCarro[i].placa + "\n" + "\n Velocidade maxima: " + vetorCarro[i].velocidadeMaxima + "\n"
						+ "\n Tipo de combustivel: " + vetorCarro[i].combustivel + "\n" + "\n Valor do carro: "
						+ vetorCarro[i].valor + "\n" + "\n Cor: " + vetorCarro[i].cor;
				encontrou = true;
			}
		}
		if (!encontrou) {
			JOptionPane.showMessageDialog(null, "Não encontrou!");
		} else {
			JOptionPane.showMessageDialog(null, message);
		}
	}

	// Metodo que cria a lita maior para o menor
	public void exibeLista() {
		Carro carroOrdemValor;
		for (int i = 0; i < posicao; i++) {
			for (int j = 0; j < posicao; j++) {
				if (vetorCarro[i].valor > vetorCarro[j].valor) {
					carroOrdemValor = vetorCarro[i];
					vetorCarro[i] = vetorCarro[j];
					vetorCarro[j] = carroOrdemValor;
				}
			}
		}
	}

	// Metodo que exibe a lita maior para o menor
	public void exibeMetodoLista() {
		exibeLista();
		String message = "";
		for (int i = 0; i < posicao; i++) {
			message = message + "\n Modelo do carro: " + vetorCarro[i].modelo + "\n" + "\n Placa: "
					+ vetorCarro[i].placa + "\n" + "\n Velocidade maxima: " + vetorCarro[i].velocidadeMaxima + "\n"
					+ "\n Tipo de combustivel: " + vetorCarro[i].combustivel + "\n" + "\n Valor do carro: "
					+ vetorCarro[i].valor + "\n" + "\n Cor: " + vetorCarro[i].cor;
		}
		JOptionPane.showMessageDialog(null, message);
	}

	// Metodo que cria a lita menor para o maior
	public void exibeLista2() {
		Carro carroOrdemValor;
		for (int i = 0; i < posicao; i++) {
			for (int j = 0; j < posicao; j++) {
				if (vetorCarro[i].valor < vetorCarro[j].valor) {
					carroOrdemValor = vetorCarro[i];
					vetorCarro[i] = vetorCarro[j];
					vetorCarro[j] = carroOrdemValor;
				}
			}
		}
	}

	// Metodo que exibe a lita menor para o maior
	public void exibeMetodoLista2() {
		exibeLista2();
		String message = "";
		for (int i = 0; i < posicao; i++) {
		}
	}

	// Metodo exibe tudo
	public void exibeTudo() {
		String message = "";
		for (int i = 0; i < posicao; i++) {
			if (!vetorCarro[i].vendido) {
				message = message + "\n Modelo do carro: " + vetorCarro[i].modelo + "\n" + "\n Placa: "
						+ vetorCarro[i].placa + "\n" + "\n Velocidade maxima: " + vetorCarro[i].velocidadeMaxima + "\n"
						+ "\n Tipo de combustivel: " + vetorCarro[i].combustivel + "\n" + "\n Valor do carro: "
						+ vetorCarro[i].valor + "\n" + "\n Cor: " + vetorCarro[i].cor;
			}
		}
		JOptionPane.showMessageDialog(null, message);
	}

	// Metodo que exibe compra
	public void exibeCompra() {
		Carro[] carroAuxiliar = new Carro[posicao];
		exibeMetodoLista2();
		boolean encontrou = false;
		String message = "";
		int contador = 1;
		String modeloCarro = JOptionPane.showInputDialog("Informe o modelo desejada: ").toUpperCase();
		String corCarro = JOptionPane.showInputDialog("Informe a cor desejada: ").toUpperCase();
		for (int i = 0; i < posicao; i++) {
			if (vetorCarro[i].modelo.equals(modeloCarro) && vetorCarro[i].cor.equals(corCarro)) {
				carroAuxiliar[contador] = vetorCarro[i];
				message = message + "\nCarro numero " + contador++ + "\n" + "Modelo do carro: " + vetorCarro[i].modelo
						+ "\n" + "\n Placa: " + vetorCarro[i].placa + "\n" + "\n Velocidade maxima: "
						+ vetorCarro[i].velocidadeMaxima + "\n" + "\n Tipo de combustivel: " + vetorCarro[i].combustivel
						+ "\n" + "\n Valor do carro: " + vetorCarro[i].valor + "\n" + "\n Cor: " + vetorCarro[i].cor;
				encontrou = true;
			}
		}
		if (!encontrou) {
			JOptionPane.showMessageDialog(null, "Não encontrou!");
		} else {
			JOptionPane.showMessageDialog(null, message);
		}
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Informe o carro desejado: "));

		for (int i = 0; i <= contador; i++) {
			try {
				if (i == escolha) {
					int valor = Integer.parseInt(JOptionPane.showInputDialog(
							"Valor do carro: R$" + carroAuxiliar[i].valor + "\n" + "Informe o valor a ser pago: R$"));
					if (valor == carroAuxiliar[i].valor) {
						JOptionPane.showMessageDialog(null, "Compra efetuada");
						excluirCadastro(carroAuxiliar[i]);
					} else if (valor > carroAuxiliar[i].valor) {
						JOptionPane.showMessageDialog(null,
								"Valor a ser devolvido: R$" + (valor - carroAuxiliar[i].valor));
						excluirCadastro(carroAuxiliar[i]);
					} else {
						JOptionPane.showMessageDialog(null, "Valor insuficiente");
					}
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Favor digitar o valor solicitado corretamente");
			}
		}
	}

	public void excluirCadastro(Carro carro) {
		for (int i = 0; i < posicao; i++) {
			if (carro.placa.equals(vetorCarro[i].placa)) {
				vetorCarro[i].vendido = true;
				break;
			}
		}
		exibeLista();
		exibeTudo();
	}

	// Metodo que define a escolhas
	public void exibeEscolhas() {
		boolean fim = true;
		while (fim) {

			try {
				int escolha = Integer.parseInt(JOptionPane.showInputDialog(
						"1 - Pesquisa por modelo \n 2 - Pesquisa por velocidade maxima \n 3 - Pesquisa  por tipo de combustivel \n 4 - Pesquisa por cor \n 5 - Lista \n 6 - Compra\n 7 - Adicionar carro \n 9 - Terminar"));

				switch (escolha) {
				case 1:
					exibeModelo();
					break;
				case 2:
					exibeVelocidade();
					break;
				case 3:
					exibeCombustivel();
					break;
				case 4:
					exibeCor();
					break;
				case 5:
					exibeMetodoLista();
					break;
				case 6:
					exibeCompra();
					break;
				case 7:
					exibeAdicionaCarro();
					break;
				case 9:
					fim = false;
					break;

				default:
					JOptionPane.showMessageDialog(null, "Opção não encontrada");
					break;
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Favor digitar o valor solicitado corretamente");
			}
		}
	}

	public static void main(String[] args) {

		Carro carro1 = new Carro("CLASSE A", "DJK-8629", 240, "FLEX", 150000, "BRANCO");
		Carro carro2 = new Carro("VIPER", "DCM-8630", 350, "FLEX", 350000, "AZUL");
		Carro carro3 = new Carro("KA", "KDZ-2209", 220, "ALCOOL", 30000, "AZUL");
		Carro carro4 = new Carro("GOLF", "CMD-4560", 220, "GASOLINA", 25000, "VERMELHO");
		Carro carro5 = new Carro("RANGER", "FKD-8629", 240, "DIESEL", 100000, "PRETO");
		Carro carro6 = new Carro("MUSTANG", "JDK-8029", 320, "DIESEL", 380000, "PRETO");
		Carro carro7 = new Carro("PAJERO", "JRE-8901", 240, "DIESEL", 50000, "BRANCO");
		Carro carro8 = new Carro("GOL", "TRS-7465", 220, "GASOLINA", 35000, "PRETO");
		Carro carro9 = new Carro("GOL", "GLB-2122", 230, "ALCOOL", 32000, "PRETO");
		Carro carro10 = new Carro("CAMARO", "FFK-4566", 320, "GASOLINA", 140000, "AMARELO");

		Locadora locadora = new Locadora();

		locadora.adicionaCarro(carro1);
		locadora.adicionaCarro(carro2);
		locadora.adicionaCarro(carro3);
		locadora.adicionaCarro(carro4);
		locadora.adicionaCarro(carro5);
		locadora.adicionaCarro(carro6);
		locadora.adicionaCarro(carro7);
		locadora.adicionaCarro(carro8);
		locadora.adicionaCarro(carro9);
		locadora.adicionaCarro(carro10);

		locadora.exibeEscolhas();
	}
}