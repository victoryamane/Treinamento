
package exec10;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Teste02 {
	public static void main(String[] args) {
		PrintStream gravador;
		try {
			gravador = new PrintStream("saida.txt");
			gravador.println("Victor");
			gravador.println("Andr�");
			gravador.println("Isabela");
			gravador.println("Jo�o");
			gravador.println("Lucas");
			gravador.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
