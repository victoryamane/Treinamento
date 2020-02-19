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

	// Declaração de variaveis
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

		// Configurações da label escolha
		lblEscolha.setForeground(Color.RED);
		lblEscolha.setText("Escolha a forma de pagamento");
		lblEscolha.setBounds(42, 15, 208, 18);

		// Configurações da label resposta
		lblResposta.setForeground(Color.BLUE);
		lblResposta.setText("Resposta");
		lblResposta.setBounds(42, 230, 300, 18);

		// Configurações do check box Cartão de Credito
		cbCC.setText("Cartão de Credito");
		cbCC.setSelected(false);
		cbCC.setBounds(42, 124, 145, 24);

		// Configurações do check box Deposito Bancario
		cbDB.setText("Deposito Bancário");
		cbDB.setSelected(false);
		cbDB.setBounds(42, 98, 154, 24);

		// Configurações do check box Boleto Bancario
		cbBB.setText("Boleto Bancário");
		cbBB.setSelected(false);
		cbBB.setBounds(42, 70, 157, 24);

		// Configuração do botão
		btnReposta.setText("Resposta");
		btnReposta.setBounds(146, 196, 100, 28);

		// Ações do botão de resposta
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

		// Configurações da tela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setSize(390, 300);
		janela.setVisible(true);

	} // fim do metodo iniciaGui

	public static void main(String[] args) {
		new TesteGui5().iniciaGui();

	}

}// fim da classe
