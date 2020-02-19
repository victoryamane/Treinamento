package exec11;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TesteGui1 {

	// Declara as variaveis de referencia
	private static JFrame janela;
	private static JButton botao;

	public static void main(String[] args) {

		// Cria uma nova tela (instacia)
		janela = new JFrame("Minha primeira tela");
		// Cria um novo botao (instacia)
		botao = new JButton("Clique aqui!");
		// Adicionar o botão no painel da janela
		janela.getContentPane().add(botao);

		// Configurar o tamanho da tela
		janela.setSize(300, 300);
		// Configurar a visibilidade da tela (true/false)
		janela.setVisible(true);
		// Informar que a tela não tem layoit pré-definido
		janela.getContentPane().setLayout(null);
	}

}
