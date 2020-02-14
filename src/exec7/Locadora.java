package exec7;

import javax.swing.JOptionPane;

/**
 * Classe de locadora - Pesquisa por modelo, velocidade e combustivel
 * 
 * @author vyamane
 * @since 13/02/2020
 * @version 0.1
 */

public class Locadora {
	// Criação e atribuição dos vetores
	static Carro vetorCarro[] = new Carro[10];

	// Metodo que exibe por modelo
	public void exibeModelo() {
		boolean encontrou = false;
		String message =""; 
		String modeloCarro = JOptionPane.showInputDialog("Informe o modelo desejado: ").toUpperCase();
		for (int i = 0; i < vetorCarro.length; i++) {
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
		for (int i = 0; i < vetorCarro.length; i++) {
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
		String message ="";
		String combustivelCarro = JOptionPane.showInputDialog("Informe o tipo de combustivel desejado: ").toUpperCase();
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].modelo.equals(combustivelCarro)) {
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
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].modelo.equals(corCarro)) {
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
		for (int i = 0; i < vetorCarro.length; i++) {
			for (int j = 0; j < vetorCarro.length; j++) {
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
		for (int i = 0; i < vetorCarro.length; i++) {
			vetorCarro[i].exibeResultado();
			System.out.println("\n");
		}
	}

	// Metodo que exibe compra
	public void exibeCompra() {
		String auxiliar = "";
		int contador = 0;
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].modelo.equals(auxiliar) && vetorCarro[i].cor.equals(auxiliar)) {
				auxiliar = auxiliar + "/n " + "Carro Numero" + vetorCarro[i].modelo;

			}
		}
	}

	// Metodo que define a escolhas
	public void exibeEscolhas() {
		int cond = 0;
		boolean fim = true;
		while (fim) {

			int escolha = Integer.parseInt(JOptionPane.showInputDialog(
					"1 - Pesquisa por modelo \n 2 - Pesquisa por velocidade maxima \n 3 - Pesquisa  por tipo de combustivel \n 4 - Pesquisa por cor \n 5 - Lista \n 6 - Compra\n 9 - Terminar"));

			/*
			 * if (escolha == 1) { exibeModelo(); } else if (escolha == 2) {
			 * exibeVelocidade();
			 * 
			 * } else if (escolha == 3) { exibeCombustivel(); }
			 */

			switch (escolha) {
			case 1:
				exibeModelo();
				cond = 0;
				break;
			case 2:
				exibeVelocidade();
				cond = 0;
				break;
			case 3:
				exibeCombustivel();
				cond = 0;
				break;
			case 4:
				exibeCor();
				cond = 0;
				break;
			case 5:
				exibeMetodoLista();
				cond = 0;
				break;
			case 6:
				exibeCompra();

				cond = 0;
				break;
			case 9:
				fim = false;
				break;

			default:
				System.out.println("Opção não encontrada");
				break;
			}
		}
	}

	public Locadora() {
		exibeEscolhas();
	}

	public static void main(String[] args) {

		Carro carro1 = new Carro("CLASSE A", "DJK-8629", 240, "FLEX", 5000, "BRANCO");
		Carro carro2 = new Carro("VIPER", "DCM-8630", 350, "FLEX", 6500, "AZUL");
		Carro carro3 = new Carro("KA", "KDZ-2209", 220, "ALCOOL", 2000, "AZUL");
		Carro carro4 = new Carro("GOLF", "CMD-4560", 220, "GASOLINA", 2500, "VERMELHO");
		Carro carro5 = new Carro("RANGER", "FKD-8629", 240, "DIESEL", 4000, "PRETO");
		Carro carro6 = new Carro("MUSTANG", "JDK-8029", 320, "DIESEL", 6000, "PRETO");
		Carro carro7 = new Carro("PAJERO", "JRE-8901", 240, "DIESEL", 3000, "BRANCO");
		Carro carro8 = new Carro("GOL", "TRS-7465", 220, "GASOLINA", 2500, "PRETO");
		Carro carro9 = new Carro("GOL", "GLB-2122", 230, "ALCOOL", 2000, "PRETO");
		Carro carro10 = new Carro("CAMARO", "FFK-4566", 320, "GASOLINA", 6000, "AMARELO");

		vetorCarro[0] = carro1;
		vetorCarro[1] = carro2;
		vetorCarro[2] = carro3;
		vetorCarro[3] = carro4;
		vetorCarro[4] = carro5;
		vetorCarro[5] = carro6;
		vetorCarro[6] = carro7;
		vetorCarro[7] = carro8;
		vetorCarro[8] = carro9;
		vetorCarro[9] = carro10;

		new Locadora();
	}
}
