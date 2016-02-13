import java.util.*;

public class Hailstone {
	
	public static void main (String [] args) {
		Hailstone stone = new Hailstone();
		stone.launch();
	}
	
	private void launch() {
		System.out.print("Hailstone sequence - enter n: ");
		System.out.println(HailstoneSequence(new Scanner(System.in).nextInt(), new ArrayList<Integer>()));
	}	
	
	private List<Integer> HailstoneSequence(int n, List<Integer> list) {
		list.add(n);
		if (n==1) {
			return list;
		}
		return HailstoneSequence((n%2==0) ? (n/2) : (3*n+1), list);
	}
}