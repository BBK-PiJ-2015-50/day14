import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FibonacciUsingMap {
    private static Map<Long, Long> fibonacciMap = new ConcurrentHashMap<>();

	public static long FibonacciCalc(long n) {
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
	}
}