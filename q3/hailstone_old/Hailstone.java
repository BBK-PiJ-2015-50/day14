import java.util.*;
public class Hailstone {
	
	public Hailstone() {
	}

	public static void main (String [] args) {
		Hailstone stone = new Hailstone();
		System.out.print("\nHailstone sequence. Enter n: ");
		int n = Integer.parseInt(System.console().readLine());
		List<Integer> numbers = stone.HailstoneList(n);
		for(Integer number:numbers){
			System.out.println("- " + number);
		}
	}
	public List<Integer> HailstoneList(int n) {
		Hailstone myStone = new Hailstone();
		List<Integer> output = new ArrayList<Integer>();
		return myStone.HailstoneSequence(n, output);
		
	}
	
	public List<Integer> HailstoneSequence(int n,List<Integer> list) {
		Integer nInteger = n;
		list.add(nInteger);
		//System.out.println("- " + n);
		if (n<=1) {
			return list;
		}
		return HailstoneSequence((n%2==0) ? (n/2) : (3*n+1), list);
	}
}