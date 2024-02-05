package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.CalculationService;

/*Uma empresa de consultoria deseja avaliar a performance de produtos,
funcionários, dentre outras coisas. Um dos cálculos que ela precisa é encontrar
o maior dentre um conjunto de elementos. Fazer um programa que leia um
conjunto de produtos a partir de um arquivo, conforme exemplo, e depois
mostre o mais caro deles.*/

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		String path = "C:\\temp\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) { // O bloco try-with-resources é usado para
																				// abrir e automaticamente fechar o
																				// BufferedReader após o uso, garantindo
																				// que os recursos sejam liberados
																				// corretamente, mesmo em caso de
																				// exceção

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");// split recorta cada pedaço entre as strings e após isso guarda no
													// vetor
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));// chamando nome aparti da posição 0 e
																				// preço aparti da posição 1
				line = br.readLine();
			}

			Product x = CalculationService.max(list);
			System.out.println("Most expensive:");
			System.out.println(x);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
