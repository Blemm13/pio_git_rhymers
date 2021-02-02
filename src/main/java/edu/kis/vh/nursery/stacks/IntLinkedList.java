package edu.kis.vh.nursery.stacks;

/**
 * Klasa tworząca objekt Linked List
 */
public class IntLinkedList implements ExtractInterface {

	private int size = EMPTY;
	Node last;

	public IntLinkedList() {
	}

	@Override
	public void push(int i) {
		size++;
		if (last == null)
			last = new Node(i);
		else {
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
	@Override
	public boolean isEmpty() {
		return last == null;
	}
	/**
	 * Metoda sprawdzająca czy lista jest pełna
	 * @return false, zawsze zwraca tę wartość, gdy istnieje
	 *
	 */
	@Override
	public boolean isFull() {
		return false;
	}
	// TODO: needs refactoring - always returns same value


	/**
	 * Metoda sprawdzająca wartość ostatniego elementu listy
	 * @return -1, gdy lista jest pusta
	 * @return last.value, gdy element istnieje
	 */
	@Override
	public int top() {
		if (isEmpty())
			return INITIAL;
		return last.value;
	}
	/**
	 * Metoda usuwająca ostatni element
	 * @return -1, gdy lista jest pusta
	 * @return ret, zwraca usuniętą wartość
	 */
	@Override
	public int pop() {
		size--;
		if (isEmpty())
			return INITIAL;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

	@Override
	public int getSize() {
		return size;
	}
}
