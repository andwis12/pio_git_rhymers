package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.StackInterface;

public final class IntLinkedList implements StackInterface {

	private Node last;
	private int i;

	@Override
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	@Override
	public boolean isEmpty() {
		return last == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int top() {
		if (isEmpty())
			return -1;
		return last.value;
	}

	@Override
	public int pop() {
		if (isEmpty())
			return -1;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

	@Override
	public int getTotal() {
		return i;
	}
}
