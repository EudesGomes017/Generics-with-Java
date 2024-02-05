package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		/*
		 * Este trecho de código demonstra o conceito de comparação de objetos em Java,
		 * especialmente em relação à utilização dos operadores == e equals(), e como
		 * eles se comportam com diferentes tipos de objetos, como Client e String.
		 * Vamos analisar cada parte:
		 * 
		 * Criação de Objetos:
		 * 
		 * São criados dois objetos Client, c1 e c2, com os mesmos valores de atributos
		 * ("Maria" e "maria@gmail.com"). São criadas quatro strings s1, s2, s3 e s4,
		 * com o conteúdo "Teste" (duas delas usando o literal da string e duas
		 * utilizando a palavra-chave new para criar novos objetos). Hash Codes:
		 * 
		 * Os métodos hashCode() são chamados para os objetos c1 e c2, que devem
		 * imprimir os códigos hash desses objetos. Note que os objetos Client
		 * provavelmente não sobrescreveram o método hashCode(), então eles usarão a
		 * implementação padrão da classe Object, que gera códigos hash diferentes para
		 * objetos diferentes, mesmo que tenham os mesmos valores de atributos.
		 * Comparação de Objetos:
		 * 
		 * É utilizada a comparação c1.equals(c2), que compara o conteúdo dos objetos
		 * Client. A saída desse comando deverá ser true, pois ambos os objetos têm os
		 * mesmos valores de atributos. É utilizada a comparação c1 == c2, que compara
		 * as referências de memória dos objetos Client. A saída desse comando deverá
		 * ser false, pois cada objeto foi instanciado separadamente com o operador new,
		 * resultando em objetos diferentes na memória. Comparação de Strings:
		 * 
		 * As comparações s1 == s2 e s3 == s4 comparam as referências de memória das
		 * strings. Para s1 == s2, a saída será true, pois strings literais com o mesmo
		 * conteúdo são armazenadas na string pool e reutilizadas. Para s3 == s4, a
		 * saída será false, pois o operador new força a criação de novos objetos,
		 * resultando em referências de memória diferentes mesmo com o mesmo conteúdo.
		 * Em resumo, o código demonstra a diferença entre comparar objetos por
		 * igualdade de conteúdo usando equals() e por igualdade de referência usando
		 * ==, e como o comportamento pode variar dependendo de como os objetos são
		 * criados e tratados pelo compilador.
		 */
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");

		String s1 = "Teste"; // ele da true pq o compilador quando digitamos com ex: formato de string ele
		// trata especial ele da tratamentos especiais para literais
		String s2 = "Teste";

		String s3 = new String("teste"); // estamos forçando a criação de um novo objeto da forma comum, dessa forma o
											// compilador não vai da um tratamento especial
		String s4 = new String("teste");

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());

		System.out.println(c1.equals(c2)); // para compara os objetos por igualdade pelo conteudo dos objetos utilizamos
											// o equals

		System.out.println(c1 == c2);// o == obs: exeção de tipo que tem tratamento especial como String) ele vai
										// compara não o conteudo e sim as referencias de memorias , então eles foram
										// alocados no heap posições diferentes

		System.out.println(s1 == s2);

		System.out.println(s3 == s4);
	}

	/*
	 * A String Pool (piscina de strings) é uma área especial da memória onde o Java
	 * armazena literais de strings. Quando você cria uma string literal em Java
	 * (por exemplo, "hello"), o Java verifica se uma string com aquele conteúdo já
	 * existe na String Pool. Se existir, a referência para essa string existente é
	 * retornada. Se não existir, uma nova string é criada na String Pool e a
	 * referência para essa nova string é retornada.
	 */

}
