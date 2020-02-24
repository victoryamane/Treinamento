package exec03;

/**
 * Classe que herda métodos de Produto
 * @author vyamane
 * @since 11/02/2020
 * @version 0.1
 */
public class Computador extends Produto {

	// Declaração das variaveis
	String processador = "Intel";
	String memoria = "8GB";
	String tela = "12 pol";
	String hd = "1 TB";
	String placaVideo = "GForce";

	// Metodo Exibe Computador
	public void exbibirComputador(){
		System.out.println("Processador: " + processador);
		System.out.println("Memoria: " + memoria);
		System.out.println("Tela: " + tela);
		System.out.println("HD: " + hd);
		System.out.println("Placa de Video: " + placaVideo);
		exibirTudo();
	}

}
