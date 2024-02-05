package application;

public class Program {

	public static void main(String[] args) {

		/*
		 * Em Java, os métodos equals() e hashCode() são métodos fundamentais para
		 * trabalhar com objetos, especialmente ao lidar com coleções como HashMap,
		 * HashSet, etc. Aqui está uma explicação detalhada de ambos:
		 * 
		 * equals(): O método equals() é usado para verificar se dois objetos são
		 * iguais. Na classe String, por exemplo, o equals() compara o conteúdo das
		 * strings, não apenas as referências de memória. Retorna true se os objetos
		 * forem iguais, ou seja, se tiverem o mesmo conteúdo ou referenciarem o mesmo
		 * objeto na memória, e false caso contrário. A saída será false porque "Maria"
		 * é diferente de "Alex".
		 */
		String a = "Maria";
		String b = "Alex";
		System.out.println(a.equals(b));

		/*
		 * hashCode(): O método hashCode() retorna um valor numérico que representa o
		 * objeto. Este valor é frequentemente usado em algoritmos de estruturas de
		 * dados, como tabelas de hash, para identificar de forma rápida e eficiente
		 * objetos semelhantes. Se dois objetos são iguais de acordo com o método
		 * equals(), então seus códigos de hash também devem ser iguais. No entanto,
		 * dois objetos com códigos de hash iguais não precisam ser iguais de acordo com
		 * equals(), pois pode ocorrer uma colisão de hash. Os códigos hash são valores
		 * numéricos gerados internamente pelo Java para representar cada objeto. Eles
		 * podem ser usados para identificar objetos de maneira rápida e eficiente em
		 * várias estruturas de dados.
		 * 
		 * Esses métodos são frequentemente sobrescritos em classes personalizadas para
		 * fornecer uma lógica de comparação personalizada (no caso de equals()) e
		 * garantir que objetos semelhantes sejam mapeados para o mesmo bucket em uma
		 * tabela de hash (no caso de hashCode()). Isso é especialmente importante ao
		 * usar classes personalizadas em coleções, garantindo o comportamento correto
		 * de métodos como contains(), remove(), entre outros.
		 */

		System.out.println();
		String a1 = "Maria";
		String b1 = "Alex";
		System.out.println(a1.hashCode());
		System.out.println(b1.hashCode());

	}

}
