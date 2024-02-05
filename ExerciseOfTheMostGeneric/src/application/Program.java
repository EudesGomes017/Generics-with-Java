package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	/*
	 * Vamos fazer um método que copia os elementos de uma lista para uma outra
	 * lista que pode ser mais genérica que a primeira
	 */

	/*
	 * Esse código em Java demonstra o uso de conceitos de covariância e
	 * contravariância com generics, junto com o uso de wildcards (?) para tornar o
	 * código mais genérico e flexível.
	 * 
	 * Aqui está uma explicação passo a passo do que está acontecendo:
	 * 
	 * No método main:
	 * 
	 * São criadas duas listas, myInts contendo números inteiros e myDoubles
	 * contendo números de ponto flutuante (Double). É criada uma lista myObjs que
	 * pode conter objetos de qualquer tipo. O método copy:
	 * 
	 * Este método aceita duas listas como parâmetros. A primeira lista (source) é
	 * do tipo List<? extends Number>, o que significa que pode ser uma lista de
	 * qualquer tipo que estenda Number (ou seja, Integer, Double, etc.). A segunda
	 * lista (destiny) é do tipo List<? super Number>, o que significa que pode ser
	 * uma lista de qualquer tipo que seja uma superclasse de Number (incluindo
	 * Number e Object). Dentro do método, um loop é usado para iterar sobre os
	 * elementos da lista source, que podem ser números de qualquer tipo (inteiros,
	 * ponto flutuante, etc.). Cada elemento é então adicionado à lista destiny, que
	 * pode conter objetos de qualquer tipo que seja uma superclasse de Number. Isso
	 * é possível porque a lista destiny é do tipo List<? super Number>, o que
	 * significa que pode aceitar elementos de qualquer tipo que seja uma
	 * superclasse de Number. O método printList:
	 * 
	 * Este método aceita uma lista list de qualquer tipo (List<?>), ou seja, uma
	 * lista de tipo desconhecido. Um loop é usado para iterar sobre os elementos da
	 * lista e imprimir cada elemento na saída padrão. Ao utilizar covariância (?
	 * extends Number) e contravariância (? super Number) com wildcards (?), o
	 * código se torna mais genérico e flexível. Isso permite que métodos como copy
	 * aceitem listas de tipos específicos, bem como de tipos que são subtipos ou
	 * supertipos desses tipos específicos, facilitando a reutilização de código e
	 * garantindo segurança de tipos em tempo de compilação.
	 */

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);
	}

	// List<? extends Number> source, é um exemplo de covariancia, estamos
	// trabalhadno com o sub-tipo, com isso podemos acessar
	// List<? super Number> destiny) contra-variancia estamos trabalhando com o tipo
	// mais generico da classe number chamando super classe Object, com isso podemos
	// add
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number number : source) {
			destiny.add(number);

		}
	}

	// percorrendo uma lista qualquer
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}

}
