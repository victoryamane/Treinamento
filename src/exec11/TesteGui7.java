package exec11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 * Classe responsavel por demonstrar utilização do Menu
 * 
 * @author vyamane
 * @since 18/02/2020
 * @version 0.1
 */

public class TesteGui7 {

	private JFrame janela;
	private JMenuBar barraMenu;
	private JMenu menu01;
	private JMenu menu02;
	private JMenuItem itemMenu1;
	private JMenuItem itemMenu2;
	private JPanel painelDaJanela;

	public void iniciaGui() {
		// criar instacias
		janela = new JFrame("Exemplo de menu");
		barraMenu = new JMenuBar();
		menu01 = new JMenu("Menu 1");
		menu02 = new JMenu("Menu 2");
		itemMenu1 = new JMenuItem("Item 1");
		itemMenu2 = new JMenuItem("Item 2");
		painelDaJanela = (JPanel) janela.getContentPane();

		// Acrescentar menus na barra de menu
		barraMenu.add(menu01);
		barraMenu.add(menu02);

		// Acrescerntar itens de menu nos menus
		menu01.add(itemMenu1);
		menu02.add(itemMenu2);

		// Configurando ação do item de menu 1
		itemMenu1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				new TesteGui4().iniciaGui();

			}
		});

		// Configurando ação do item de menu 2
		itemMenu2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				new TesteGui5().iniciaGui();

			}
		});

		// Configurações do painel da tela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(barraMenu);

		// Configurações da tela
		janela.setJMenuBar(barraMenu);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(300, 300);
		janela.setVisible(true);

	} // fim metodo

	public static void main(String[] args) {
		new TesteGui7().iniciaGui();
	}

} // fim classe
