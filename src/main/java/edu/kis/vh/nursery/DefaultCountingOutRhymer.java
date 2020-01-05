package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int INT = -1;
	private int total = INT;

	private int[] NUMBERS = new int[12];

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {

		return total == INT;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return INT;
		return NUMBERS[total];
	}

	public int countOut() {
		if (callCheck())
			return INT;
		return NUMBERS[total--];
	}

	public int getTotal() {
		return total;
	}
}
