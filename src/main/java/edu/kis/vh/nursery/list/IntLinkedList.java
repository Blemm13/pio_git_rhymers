package edu.kis.vh.nursery.list;

/**
 * Klasa tworząca objekt Linked List
 */
public class IntLinkedList {
	private final int EMPTY = -1;
	Node last;
	int i;

	public int getSizeOfList() {
		return sizeOfList;
	}

	/**
	 * @param i liczba, która zostanie dodana na koniec listy
	 *
	 */
	private int sizeOfList=0;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			sizeOfList++;
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}
	/**
	 * Metoda sprawdzająca czy lista jest pusta
	 * @return true, gdy lista jest pusta
	 *
	 */
	public boolean isEmpty() {
		return last == null;
	}
	/**
	 * Metoda sprawdzająca czy lista jest pełna
	 * @return false, zawsze zwraca tę wartość, gdy istnieje
	 *
	 */
	public boolean isFull() {
		return false;
	}
	// TODO: needs refactoring - always returns same value


	/**
	 * Metoda sprawdzająca wartość ostatniego elementu listy
	 * @return -1, gdy lista jest pusta
	 * @return last.value, gdy element istnieje
	 */
	public int top() {
		if (isEmpty())
			return EMPTY;
		return last.value;
	}
	/**
	 * Metoda usuwająca ostatni element
	 * @return -1, gdy lista jest pusta
	 * @return ret, zwraca usuniętą wartość
	 */
	public int pop() {
		if (isEmpty())
			return EMPTY;
		int ret = last.value;
		last = last.prev;
		sizeOfList--;
		return ret;
	}

}
