public class FibonacciLong {
	
	private static long[] precalculated = null;
	
	// Memoized version
	// arrays are 0-based, so F(1) is stored at position 0, etc
	public static long fibLong(int n) {
		if (precalculated == null) {
			initPrecalculatedArray(n);
		}
		if (precalculated[n-1] != -1) {
			return precalculated[n-1];
		} else {
			long result = fibLong(n-1) + fibLong(n-2);
			precalculated[n-1] = result;
			return result;
		}
	}

	// Non-memoized version
	public static long fibNonMemoLong(int n) {
		if ((n == 1) || (n == 2)) {
			return 1;
		} else {
			long result = fibNonMemoLong(n-1) + fibNonMemoLong(n-2);
			return (result);
		}
	}

	private static void initPrecalculatedArray(int size) {
		precalculated = new long[size];
		for (int i = 0; i < precalculated.length; i++) {
			precalculated[i] = -1; // to indicate "not calculated yet"
		}
		precalculated[0] = 1; // F(1)
		precalculated[1] = 1; // F(2)
	}
}