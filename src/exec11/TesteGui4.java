package exec11;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Classe de exemplo de radio button
 * @author vyamane
 *@since 18/02/2020
 *@version 0.1
 */

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class TesteGui4 {

	// Declaração das variaveis
	private JFrame janela;
	private JLabel lblEscolha;
	private JRadioButton rbtSolteiro;
	private JRadioButton rbtCasado;
	private JRadioButton rbtViuvo;
	private JRadioButton rbtDivorciado;
	private JButton btnVerificar;
	private JPanel painelDaJanela;
	private ButtonGroup grpRadio;

	public void verificaSelecionado() {
		// Verificar qual radio button foi selecionado
		String resposta = "";
		if (rbtSolteiro.isSelected()) {
			resposta += rbtSolteiro.getText();
		}
		if (rbtCasado.isSelected()) {
			resposta += rbtCasado.getText();
		}
		if (rbtViuvo.isSelected()) {
			resposta += rbtViuvo.getText();
		}
		if (rbtDivorciado.isSelected()) {
			resposta += rbtDivorciado.getText();
		}
		if (!resposta.equals("")) {
			// troca a cor da fonte para vermelho
			lblEscolha.setForeground(Color.RED);
			lblEscolha.setText(resposta);
		}
		resposta = "";
	}

	public void iniciaGui() {
		// Criar as instacias
		janela = new JFrame("Exemplo de Radio Button");
		lblEscolha = new JLabel();
		rbtSolteiro = new JRadioButton();
		rbtCasado = new JRadioButton();
		rbtViuvo = new JRadioButton();
		rbtDivorciado = new JRadioButton();
		btnVerificar = new JButton();
		painelDaJanela = (JPanel) janela.getContentPane();

		// Cria o bejeto de grupo de botoões
		grpRadio = new ButtonGroup();

		// Adiciona os botões ao grupo
		grpRadio.add(rbtSolteiro);
		grpRadio.add(rbtCasado);
		grpRadio.add(rbtViuvo);
		grpRadio.add(rbtDivorciado);

		// Configurações da label escolha
		lblEscolha.setHorizontalTextPosition(SwingConstants.CENTER);
		lblEscolha.setText("Selecione o estado civil");
		lblEscolha.setBounds(82, 18, 230, 18);

		// Configuração do botão solteiro
		rbtSolteiro.setText("Solteiro");
		rbtSolteiro.setBounds(80, 50, 100, 24);

		// Configuração do botão casado
		rbtCasado.setText("Casado");
		rbtCasado.setBounds(80, 75, 100, 24);

		// Configuração do botão viuvo
		rbtViuvo.setText("Viuvo");
		rbtViuvo.setBounds(80, 100, 100, 24);

		// Configuração do botão Divorciado
		rbtDivorciado.setText("Divorciado");
		rbtDivorciado.setBounds(80, 125, 150, 24);

		// Configurações do botão
		btnVerificar.setText("Verificar");
		btnVerificar.setBounds(126, 176, 83, 28);

		// Adicionar ação do botoão
		btnVerificar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				verificaSelecionado();
			}
		});

		// Configurações do painel da tela
		painelDaJanela.setLayout(null);
		painelDaJanela.setBorder(BorderFactory.createLoweredBevelBorder());
		painelDaJanela.add(lblEscolha);
		painelDaJanela.add(rbtSolteiro);
		painelDaJanela.add(rbtCasado);
		painelDaJanela.add(rbtViuvo);
		painelDaJanela.add(rbtDivorciado);
		painelDaJanela.add(btnVerificar);

		// Configurações da janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(340, 273);
		janela.setVisible(true);

	} // fim do metodo

	public static void main(String[] args) {
		new TesteGui4().iniciaGui();
	}

} // fim da classe
