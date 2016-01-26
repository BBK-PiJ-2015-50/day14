public class McC {

	McC() {
	}

	public static int mcCarthy91(int n) {
		if (n > 100) {
			System.out.println("n= " + n + "\treturn n-10 = " + (n-10));
			return n - 10;
		} else {
			System.out.println("n= " + n + "\treturn mcCarthy91(mcCarthy91(n+11))...(n+11 = " + (n+11) + ")");
			return mcCarthy91(mcCarthy91(n+11));
		}
	}
}


