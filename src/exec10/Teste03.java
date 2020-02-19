package exec10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Teste03 {
	public static void main(String[] args) {
		File arquivo = new File("saida.txt");
		try {
			FileOutputStream arquivoOutput = new FileOutputStream(arquivo, true);
			PrintStream gravador = new PrintStream(arquivoOutput);
			gravador.println("Victor");
			gravador.println("Yamane");
			gravador.println("de");
			gravador.println("Oliveira");
			gravador.println("Aulicino");
			gravador.close();
			arquivoOutput.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
