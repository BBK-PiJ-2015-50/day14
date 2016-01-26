import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class FibonacciUsingMap {
    private static Map<Long, Long> fibonacciMap = new ConcurrentHashMap<>();

    public static void main (String [] args) {
		FibonacciUsingMap fum = new FibonacciUsingMap();
		fum.launch();
	}

	private void launch() {
		System.out.print("FibonacciUsingMap - ENTER n: ");
		System.out.println(FibonacciCalc(new Scanner(System.in).nextInt()));
		System.out.println(fibonacciMap);
	}

	public static long FibonacciCalc (long n) {
		return FibMapCalc(n, fibonacciMap);
	}

	private static long FibMapCalc(long n, Map<Long, Long> fibMap) {
	long fibResult;
		if ((n == 1) || (n == 2)) {
			return 1;
		}
		if (fibMap.containsKey(n)) {
			return fibMap.get(n);
		}	
		fibResult = FibMapCalc(n-1, fibMap) + FibMapCalc(n-2, fibMap);
		fibMap.put(n, fibResult);
		return (fibResult);
	}

	/*public static long FibonacciCalc(long n) {
	long fibResult;
		if ((n == 1) || (n == 2)) {
			return 1;
		} else if (fibonacciMap.containsKey(n)) {
			return fibonacciMap.get(n);
		} else {	
			fibResult = FibonacciCalc(n-1) + FibonacciCalc(n-2);
			fibonacciMap.put(n, fibResult);
			return (fibResult);
		}
	}*/
}