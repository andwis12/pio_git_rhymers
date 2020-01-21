package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
	private IntArrayStack arrayStack;


	public DefaultCountingOutRhymer() {
		arrayStack = new IntArrayStack();
	}

	public void countIn(int in) {
		arrayStack.push(in);
	}

	public boolean callCheck() {
		return arrayStack.isEmpty();
	}

	public boolean isFull() {
		return arrayStack.isFull();
	}

	public int peekaboo() {
		return arrayStack.top();
	}

	public int countOut() {
		return arrayStack.pop();
	}

	public int getTotal() {
		return arrayStack.getTotal();
	}



}
