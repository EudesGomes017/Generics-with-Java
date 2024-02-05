package entities;

import java.util.Objects;

public class Client {

	private String name;
	private String email;

	public Client(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, name);
	}

	/*
	 * Esse trecho de código é uma implementação do método equals em uma classe
	 * Java. O método equals é usado para comparar se dois objetos são considerados
	 * iguais. Aqui está uma explicação detalhada do que está acontecendo neste
	 * código:
	 * 
	 * public boolean equals(Object obj) {: Este é o cabeçalho do método equals. Ele
	 * substitui o método equals da classe Object para fornecer uma lógica de
	 * comparação personalizada.
	 * 
	 * if (this == obj) return true;: Esta é uma verificação rápida para ver se o
	 * objeto sendo comparado é exatamente o mesmo objeto (this) que está sendo
	 * chamado. Se forem o mesmo objeto, não há necessidade de fazer mais
	 * comparações, então o método retorna true.
	 * 
	 * if (obj == null) return false;: Verifica se o objeto passado como argumento
	 * (obj) é nulo. Se for nulo, significa que não pode ser igual a este objeto,
	 * então o método retorna false.
	 * 
	 * if (getClass() != obj.getClass()) return false;: Compara as classes dos dois
	 * objetos para garantir que sejam da mesma classe. Se os objetos não forem da
	 * mesma classe, eles não podem ser considerados iguais, então o método retorna
	 * false.
	 * 
	 * Client other = (Client) obj;: Nesta linha, o objeto obj é convertido para o
	 * tipo Client, assumindo que o método equals é implementado dentro da classe
	 * Client. Isso é feito porque o parâmetro obj é do tipo Object, então
	 * precisamos convertê-lo para o tipo correto para poder acessar os campos
	 * específicos da classe Client.
	 * 
	 * return Objects.equals(email, other.email) && Objects.equals(name,
	 * other.name);: Esta linha compara os campos relevantes dos objetos this e
	 * other (o objeto passado como argumento). Ele compara os campos email e name
	 * do objeto atual (this) com os campos correspondentes do objeto other. A
	 * comparação é feita usando o método Objects.equals, que é uma maneira segura
	 * de comparar objetos em Java, lidando corretamente com nulos. Se todos os
	 * campos comparados forem iguais, o método retorna true, indicando que os
	 * objetos são considerados iguais. Se algum dos campos for diferente, o método
	 * retorna false.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(email, other.email) && Objects.equals(name, other.name);
	}

}
