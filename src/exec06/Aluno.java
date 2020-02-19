//package exec06;
//
//import java.time.Year;
//
///**
// * Classe Aluno cria calcula idade do aluno
// * @author vyamane
// * @since 12/02/2020
// * @version 0.3
// */
//
//public class Aluno {
//	String nome;
//	int anoNascimento;
//	String dataNascimento;
//	String curso;
//	String cidade;
//	
//	
//		
//	public Aluno () {						
//	}
//
//	public Aluno(String nome, int anoNascimento, String dataNascimento, String curso, String cidade) {
//		super();
//		this.nome = nome;
//		this.anoNascimento = anoNascimento;
//		this.dataNascimento = dataNascimento;
//		this.curso = curso;
//		this.cidade = cidade;
//	}
//
//	public int calculaData ()	{
//		Year y = Year.now ();
//		int ano = y.getValue();
//		int idade = ano - anoNascimento;
//		return idade;
//	}
//	
//	public int calculaIdade ()	{
//		String data =(new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date(System.currentTimeMillis())));
//		String dtConvert[] = dataNascimento.split("/");
//		int dt = Integer.parseInt(data);	
//		String dtNasc= dtConvert[2]+dtConvert[1]+ dtConvert[0];		
//		int d= Integer.parseInt(dtNasc);		
//		int idadeReal = dt - d;	
//		idadeReal = (idadeReal % 1000000 / 10000);
//		return idadeReal;	
//	}
//	
//	public int calculaTempoVida () {
//		String ano =(new java.text.SimpleDateFormat("yyyy").format(new java.util.Date(System.currentTimeMillis())));
//		String mes =(new java.text.SimpleDateFormat("MM").format(new java.util.Date(System.currentTimeMillis())));
//		String dia =(new java.text.SimpleDateFormat("dd").format(new java.util.Date(System.currentTimeMillis())));
//		int anoNascimento = Integer.parseInt(ano);
//		int mesNascimento = Integer.parseInt(mes);
//		int diaNascimento = Integer.parseInt(dia);
//		
//		
//		String dtConverte[] = dataNascimento.split("/");
//		String tempoDias= dtConverte[2]+dtConverte[1]+ dtConverte[0];		
//		int anoAtual= Integer.parseInt(dtConverte[2]);
//		int mesAtual= Integer.parseInt(dtConverte[1]);
//		int diaAtual= Integer.parseInt(dtConverte[0]);
//		int totalDias = ((anoNascimento *365) + (mesNascimento*30) + (diaNascimento) - (anoAtual *365) + (mesAtual*30) + (diaAtual));
//		return totalDias;
//	}
//	
//	
//	
//	public void exibeTudo () {
//		System.out.println("Nome:" + nome);	
//		System.out.println("Ano de nascimento:" + anoNascimento);	
//		System.out.println("Curso:" + curso);	
//		System.out.println("Cidade:" + cidade);	
//		System.out.println("Idade: " + calculaData ());
//		System.out.println("Idade real: " + calculaIdade () + " Anos");
//		System.out.println("Tempo tolal de vida: " + calculaTempoVida () + " dias" );
//	}	
//}
