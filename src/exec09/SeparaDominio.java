package exec09;

/**
 * Classe teste Separa o dominio
 * @author vyamane
 *@since 17/02/2020
 *@version 0.1
 */

import javax.swing.JOptionPane;

public class SeparaDominio {
	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog(null, "Informe o email: ", "Validador de emial: ", 3);
		// String email = JOptionPane.showInputDialog("Informe o email: ");
		
		// Verifica a posição do @
		int cont = email.indexOf("@");
		if (cont > 0) {
			// Imprime a posição do @
			System.out.println("Posição do @: " + cont);
			// Verifica e imprime o dominio
			String dominio = email.substring(cont + 1);
			System.out.println("Dominio do email: " + dominio);
			// Verifica e imprime o usuario
			String usuario = email.substring(0, cont);
			System.out.println("Usuario do email: " + usuario);
		}
	}

}
