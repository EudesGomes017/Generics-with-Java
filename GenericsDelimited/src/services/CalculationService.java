package services;

import java.util.List;

public class CalculationService {
	/*
	 * Implementa a interface Comparable<T> extends Comparable<T>: Isso restringe o
	 * tipo T a ser comparável consigo mesmo, garantindo que os elementos da lista
	 * possam ser comparados.
	 */
	public static <T extends Comparable<? super T>> T max(List<T> list) { // max encontr o maior elemento da lista
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) {// se cada item dessa lista é maior que o max
				max = item;
			}
		}
		return max;
	}

}
