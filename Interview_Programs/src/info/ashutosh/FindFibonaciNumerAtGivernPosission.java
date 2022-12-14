package info.ashutosh;

public class FindFibonaciNumerAtGivernPosission {
	// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89

	public static void main(String[] args) {
		int fib = FindFibonaciNumerAtGivernPosission.fib(2);
		System.err.println(fib);
	}

	static int fib(int position) {

		if (position < 1) {
			throw new IllegalArgumentException("Position Not Allowed ! " + position);
		}
		if (position == 1) {
			return 0;
		}
		if (position == 2) {
			return 1;
		}
		int firstLeft = 1;
		int secondLeft = 0;
		int current = 0; // 1-

		for (int i = 3; i <= position; i++) {
			current = firstLeft + secondLeft;
			secondLeft = firstLeft;
			firstLeft = current;
		}

		return current;

	}
}
