package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {

		/*
		 * Esse código Java demonstra o uso de um conceito conhecido como
		 * "covariância de wildcards" em Java, especificamente no contexto de listas
		 * genéricas. Vamos examinar o que está acontecendo em detalhes:
		 * 
		 * Definição das Classes:
		 * 
		 * Existem três classes principais: Program, Shape, Rectangle, e Circle. Shape é
		 * uma interface que contém um método area() para calcular a área da forma
		 * geométrica. Rectangle e Circle são classes que implementam a interface Shape
		 * e fornecem implementações específicas do método area() para calcular a área
		 * de um retângulo e de um círculo, respectivamente. No método main:
		 * 
		 * Duas listas são criadas: myShapes e myCircles. myShapes é uma lista de formas
		 * (Shape), que pode conter instâncias de qualquer classe que implemente a
		 * interface Shape, como Rectangle ou Circle. myCircles é uma lista específica
		 * de círculos (Circle), ou seja, ela só pode conter instâncias da classe
		 * Circle. O método totalArea:
		 * 
		 * Este método aceita uma lista de qualquer subtipo de Shape, ou seja, uma lista
		 * que pode conter instâncias de Shape ou de qualquer subclasse de Shape, como
		 * Rectangle ou Circle. Isso é especificado usando um wildcard delimitado (?
		 * extends Shape), que permite que a lista contenha instâncias de qualquer
		 * subtipo de Shape. Dentro do método, um loop é usado para iterar sobre os
		 * elementos da lista. Para cada elemento s na lista, o método area() é chamado
		 * para calcular a área da forma geométrica correspondente. A área de cada forma
		 * é somada à variável sum, que acumula a área total de todas as formas na
		 * lista. O método retorna o valor total da área somada. Essa abordagem permite
		 * que o método totalArea seja aplicado não apenas a listas de formas (Shape),
		 * mas também a listas de qualquer subtipo de Shape, como retângulos ou
		 * círculos. Isso torna o código mais flexível e reutilizável, pois o método
		 * pode ser usado com diferentes tipos de dados que compartilham uma relação de
		 * herança com a interface Shape.
		 */

		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));

		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));

		System.out.println("Total area: " + totalArea(myCircles));
	}

	// essa minha lista pode ser de Shape ou de qualquer sub tipo de Shape
	// obs: não conseguiremos add elementos na lista com tipo coringa delimitado
	public static double totalArea(List<? extends Shape> list) { // estamos implementando list da interface Shape
		double sum = 0.0; // inicializando a variavel e vai acumular após percorrer a área de cada lista
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}
