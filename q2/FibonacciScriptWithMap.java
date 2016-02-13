public class FibonacciScriptWithMap {

	public static void main(String[] args) {
	 	FibonacciScriptWithMap script = new FibonacciScriptWithMap();
		script.launch();
	}

	public void launch() {
		System.out.println("\nProgram calculates nth element of the Fibonacci sequence.");
		System.out.print("• Enter n: ");
		int n = Integer.parseInt(System.console().readLine());
		System.out.println("• Memoized method:\t\t" + Fibonacci.fib(n));
		System.out.println("• Memoized method:\t\t" + Fibonacci.fib(n));
		System.out.println("• No memoization:\t\t" + Fibonacci.fibNonMemo(n));

		System.out.println("\nTrying <long> in calculation instead of <int>");
		System.out.print("• Enter a number greater than 46: ");
		int biggerNumber = Integer.parseInt(System.console().readLine());
		System.out.println("• Memoized with array:\t" + FibonacciLong.fibLong(biggerNumber));
		System.out.println("• Memoized with map:\t\t" + FibonacciUsingMap.FibonacciCalc(biggerNumber));
		System.out.println("• No memoization:\t\t" + FibonacciLong.fibNonMemoLong(biggerNumber));
	}
}