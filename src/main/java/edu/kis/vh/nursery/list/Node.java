package edu.kis.vh.nursery.list;

/**
 *  Klasa która jest przechowywana jako element klasy IntLinkedList
 */

public final class Node {

	/**
	 * value - zmienna która przechowuje wartość węzła
	 * prev - zmienna która przechowuje referencję do poprzedniego Node'a
	 * next - zmienna która przechowuje referencję do następnego Node'a
	 */
	int value;
	public Node prev, next;

	/**
	 * Konstruktor klasy Node
	 * @param i - zmienna która zostanie przypisana jako wartość węzła
	 */

	public Node(int i) {
		value = i;
	}
	
}
