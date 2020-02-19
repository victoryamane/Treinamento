package exec06;

import javax.swing.JOptionPane;

/**
 * Classe Aluno cria calcula idade do aluno
 * @author vyamane
 * @since 12/02/2020
 * @version 0.3
 */

import org.joda.time.DateTime;
import org.joda.time.Days;

public class TestaAluno {	
	
	public static void main(String[] args) {		
			String dataCompleta = JOptionPane.showInputDialog("Informe a data de Nascimento: ");
			String data [] = dataCompleta.split("/");
			int ano = Integer.parseInt(data[2]);
			int mes = Integer.parseInt(data[1]);
			int dia = Integer.parseInt(data[0]);
					
			String anoAtual =(new java.text.SimpleDateFormat("yyyy").format(new java.util.Date(System.currentTimeMillis())));
			String mesAtual =(new java.text.SimpleDateFormat("MM").format(new java.util.Date(System.currentTimeMillis())));
			String diaAtual =(new java.text.SimpleDateFormat("dd").format(new java.util.Date(System.currentTimeMillis())));
			int anoAt = Integer.parseInt(anoAtual);
			int mesAt = Integer.parseInt(mesAtual);
			int diaAt = Integer.parseInt(diaAtual);			
		
		
		    DateTime dataInicial = new DateTime(ano, mes, dia, 0, 0);
			DateTime dataFinal = new DateTime(anoAt, mesAt, diaAt, 0, 0);
			
			int dias = Days.daysBetween (dataInicial, dataFinal).getDays();
			System.out.println(dias);
			
			//Aluno aluno = new Aluno("Victor", 1991, "22/09/1991", "ADS", "São Paulo");
			//aluno.exibeTudo ();
		}			
	}

