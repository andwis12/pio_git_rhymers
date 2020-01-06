package edu.kis.vh.nursery;

public final class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	public int reportRejected() {

		return totalRejected;
	}
	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}

//WIERSZE 5 12 14 15
// alt + ← oraz alt + → powzwala przełączać się pomiędzy otwartymi klasami