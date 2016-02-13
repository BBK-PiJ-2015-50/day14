import java.util.*;
public class Hailstone {
	
	public Hailstone() {
	}

	public static void main (String [] args) {
		Hailstone stone = new Hailstone();
		System.out.print("\nHailstone sequence. Enter n: ");
		int n = Integer.parseInt(System.console().readLine());
		List<Integer> numbers = HailstoneSequence(n, new ArrayList<Integer>());
		for(Integer number:numbers){
			System.out.println("- " + number);
		}
	}
	
	public static List<Integer> HailstoneSequence(int n,List<Integer> list) {
		list.add(n);
		if (n<=1) {
			return list;
		}
		return HailstoneSequence((n%2==0) ? (n/2) : (3*n+1), list);
	}
}