package exec12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {

	public static void main(String[] args) {

		// cria um objeto ArrayList
		List<String> arrayList = new ArrayList<String>();

		// adicionar elementos ao final da lista, usamos o metodo add
		arrayList.add("Elemento n�1");
		arrayList.add("Elemento n�2");
		arrayList.add("Elemento n�3");

		System.out.println("Posi��o 1 contem: " + arrayList.get(0));
		System.out.println("Posi��o 2 contem: " + arrayList.get(1));
		System.out.println("Posi��o 3 contem: " + arrayList.get(2));

		for (String s : arrayList) {
			System.out.println(s);
		}

		// tambem podemos adicionar um elemento nume posi��o qualquer
		arrayList.add(1, "Elemento n�1,5");
		System.out.println("\n Apos adicionar o elemento 1,5:\n");

		for (String s : arrayList) {
			System.out.println(s);
		}

		// obter o tamanho da lista
		System.out.println("\nO tamanho da lista �: " + arrayList.size() + "\n");

		// podemos ver um determinado valor na lista
		if (arrayList.contains("Elemento n�1,5")) {
			System.out.println("Elemento 1,5 existe");
		} else {
			System.out.println("Elemento 1,5  n�o existe");
		}

		int indice = arrayList.indexOf("Elemento n�1,5");
		System.out.println("\nO indice do elemento 1,5 �: " + indice);

		// remover um elemento da lista
		System.out.println("\nRemovendo Elemento 1,5\n");
		arrayList.remove("Elemento n�1,5");
		System.out.println("Lista atulizada");
		for (String s : arrayList) {
			System.out.println(s);
		}

		// remover com base no indice - remover o ultimo registro
		System.out.println("\nRemovendo o ultimo Elemento\n");
		arrayList.remove(arrayList.size() - 1);
		System.out.println("Lista atulizada");
		for (String s : arrayList) {
			System.out.println(s);
		}

		// adicionando elementos da lista
		System.out.println("\nAdcionando elemento da lista");
		arrayList.add("Elemento n�5");
		arrayList.add("Elemento n�9");
		arrayList.add("Elemento n�4");
		arrayList.add("Elemento n�0");
		arrayList.add("Elemento n�8");
		System.out.println("\nLista com elementos adicionado");
		for (String s : arrayList) {
			System.out.println(s);
		}

		// ordenando Array List
		Collections.sort(arrayList);
		System.out.println("\nLista ordenada");
		for (String s : arrayList) {
			System.out.println(s);
		}

		// criando uma �ista de objetos -Filme
		List<Filme> arrayListFilme = new ArrayList<Filme>();

		// criando 3 filmes
		Filme filme1 = new Filme();
		filme1.setCodigo(1);
		filme1.setNome("Codigo de conduta");

		Filme filme2 = new Filme();
		filme2.setCodigo(2);
		filme2.setNome("Era do gelo");

		Filme filme3 = new Filme();
		filme3.setCodigo(3);
		filme3.setNome("Matrix");

		// compare os filmes instaciados
		if (filme1.equals(filme2)) {
			System.out.println("\nFilmes iguais/n");

		} else {
			System.out.println("\nFilmes diferentes/n");
		}

		// adiciona na lista de filmes instaciados
		arrayListFilme.add(filme1);
		arrayListFilme.add(filme2);
		arrayListFilme.add(filme3);

		// exbindo a lista de filme
		for (Filme f : arrayListFilme) {
			System.out.println(f);

		}

//		// ordernar uma lista
//		System.out.println("Lista ordenada");
//		
//		for (Filme f : arrayListFilme) {
//			System.out.println(f);
//			
//		}

		
		
		
		
		
	} // fim do main

} // fim da classe
