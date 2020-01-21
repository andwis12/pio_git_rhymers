package edu.kis.vh.nursery;

public class IntArrayStack implements StackInterface {
	private static final int SIZE = 12;
	private static final int INT = -1;
	private int total = INT;

	private int[] NUMBERS = new int[SIZE];

	@Override
	public void push(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	@Override
	public boolean isEmpty() {

		return total == INT;
	}

	@Override
	public boolean isFull() {
		return total == 11;
	}

	@Override
	public int top() {
		if (isEmpty())
			return INT;
		return NUMBERS[total];
	}

	@Override
	public int pop() {
		if (isEmpty())
			return INT;
		return NUMBERS[total--];
	}

	@Override
	public int getTotal() {
		return total;
	}

}
