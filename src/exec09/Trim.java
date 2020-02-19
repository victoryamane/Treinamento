package exec09;

/**
 * Classe teste trim
 * @author vyamane
 *@since 17/02/2020
 *@version 0.1
 */

public class Trim {
	public static void main(String[] args) {
		String um = "Ola ";
		String dois = "Mundo ";
		
		// Imprime sem espaço
		System.out.println("Antes do Trim:" + um + dois);
		 um = um.trim();
		 dois = dois.trim();
		// Imprime sem espaço
		 System.out.println("Depois do trim:" + um + dois);
	}

}
