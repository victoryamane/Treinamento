package exec11;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Classe responsavel por demonstrar utilização de JComboBox
 * 
 * @author vyamane
 * @since 18/02/2020
 * @version 0.1
 */

public class TesteGui6 {
	// Declaração de variaveis
	private JFrame janela;
	private JPanel painelDaJanela;
	private JComboBox cbox;
	private String [] equipamentos = {"Monitor", "Teclado", "Mouse", "Scanner", "Modem" };

	public void iniciarGui() {

		// Criar as instacias
		janela = new JFrame("Exemplo de Combo Box");
		painelDaJanela = (JPanel) janela.getContentPane();
		cbox = new JComboBox(equipamentos);

		// Configurações do combo box
		cbox.setSelectedIndex(-1);
		cbox.setBounds(10, 10, 300, 30);
		cbox.setMaximumRowCount(10);

		// Configurações do painel da tela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(cbox);
		
		// Configuração da tela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(400, 300);
		janela.setVisible(true);

	} // fim do metodo
	
	public static void main(String[] args) {
		new TesteGui6().iniciarGui();
	}

} //fim da classe
