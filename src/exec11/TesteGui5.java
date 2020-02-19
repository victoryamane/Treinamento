package exec11;

/**
 * Classe de exemplo de check box
 * 
 * @author vyamane
 * @since 18/02/2020
 * @version 0.1
 */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class TesteGui5 {

	// Declara��o de variaveis
	private JFrame janela;
	private JLabel lblEscolha;
	private JLabel lblResposta;
	private JCheckBox cbCC;
	private JCheckBox cbDB;
	private JCheckBox cbBB;
	private JButton btnReposta;
	private JPanel painelDaJanela;

	// Verificar qual radio button foi selecionado

	public void verificaSelecionado() {
		String resposta = "";
		if (cbCC.isSelected()) {
			resposta += cbCC.getText();
		}
		if (cbDB.isSelected()) {
			resposta += cbDB.getText();
		}
		if (cbBB.isSelected()) {
			resposta += cbBB.getText();
		}

		if (!resposta.equals("")) {

			lblResposta.setText(resposta);
		}
		resposta = "";
	}

	public void iniciaGui() {
		// Criar as instacias
		janela = new JFrame("Exemplo de Check box");
		lblEscolha = new JLabel();
		lblResposta = new JLabel();
		cbCC = new JCheckBox();
		cbDB = new JCheckBox();
		cbBB = new JCheckBox();
		btnReposta = new JButton();
		painelDaJanela = (JPanel) janela.getContentPane();

		// Configura��es da label escolha
		lblEscolha.setForeground(Color.RED);
		lblEscolha.setText("Escolha a forma de pagamento");
		lblEscolha.setBounds(42, 15, 208, 18);

		// Configura��es da label resposta
		lblResposta.setForeground(Color.BLUE);
		lblResposta.setText("Resposta");
		lblResposta.setBounds(42, 230, 300, 18);

		// Configura��es do check box Cart�o de Credito
		cbCC.setText("Cart�o de Credito");
		cbCC.setSelected(false);
		cbCC.setBounds(42, 124, 145, 24);

		// Configura��es do check box Deposito Bancario
		cbDB.setText("Deposito Banc�rio");
		cbDB.setSelected(false);
		cbDB.setBounds(42, 98, 154, 24);

		// Configura��es do check box Boleto Bancario
		cbBB.setText("Boleto Banc�rio");
		cbBB.setSelected(false);
		cbBB.setBounds(42, 70, 157, 24);

		// Configura��o do bot�o
		btnReposta.setText("Resposta");
		btnReposta.setBounds(146, 196, 100, 28);

		// A��es do bot�o de resposta
		btnReposta.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				verificaSelecionado();

			}
		});

		// Adicionar componentes no painel da tela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(lblEscolha);
		painelDaJanela.add(cbCC);
		painelDaJanela.add(cbDB);
		painelDaJanela.add(cbBB);
		painelDaJanela.add(btnReposta);
		painelDaJanela.add(lblResposta);

		// Configura��es da tela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setSize(390, 300);
		janela.setVisible(true);

	} // fim do metodo iniciaGui

	public static void main(String[] args) {
		new TesteGui5().iniciaGui();

	}

}// fim da classe
