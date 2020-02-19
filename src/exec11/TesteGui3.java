package exec11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TesteGui3 {
	// Declarar os componentes da tela
	private JFrame janela;
	private JButton botao1;
	private JButton botao2;
	private JTextField campo;
	private JTextArea area;

	public TesteGui3() {
		iniciaGui();
	}

	public void iniciaGui() {
		// Cria a janela
		janela = new JFrame();
		// Cria a a area
		area = new JTextArea();
		// Cria o botão 1
		botao1 = new JButton("Clique aqui");
		// Adicionar o metodo desenvolvido na classe Texto
		botao1.addActionListener(new TextoListener());

		// Cria o botão 2
		botao2 = new JButton("Troca a cor");
		botao2.addActionListener(new CorListener());

		// Cria um campo para digitar texto
		campo = new JTextField();
		// Adicionar o metodo desenvolvido na classe Texto
		campo.addActionListener(new TextoListener());
		// Adicionar o botão 1 ao painel da janela
		janela.getContentPane().add(BorderLayout.EAST, botao2);
		// Adicionar o botão 2 ao painel da janela
		janela.getContentPane().add(BorderLayout.SOUTH, botao1);
		// Adicionar a area ao painel da jenela
		janela.getContentPane().add(BorderLayout.CENTER, area);
		// Adicionar o JTextField ao painel da janela
		janela.getContentPane().add(BorderLayout.NORTH, campo);
		// Configurar o tamanho
		janela.setSize(300, 300);
		// Configurar a visibilidade da tela
		janela.setVisible(true);

	}

	public class TextoListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// append serve para concatenar o texto
			area.append(campo.getText() + "\n");
			campo.setText("");
		}
	}

	public class CorListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// Se o fundo da JTextArea for neutro troca para preto
			if (area.getBackground().equals(Color.BLACK)) {
				area.setBackground(Color.WHITE); // Troca o fundo
				area.setForeground(Color.BLACK); // Troca a letra
			} else {
				area.setBackground(Color.BLACK);
				area.setForeground(Color.WHITE);
			}
		}
	}

	public static void main(String[] args) {
		new TesteGui3();
	}

}
