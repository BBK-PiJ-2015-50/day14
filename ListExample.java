import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {

	// Create new ArrayList
	ArrayList<Integer> exampleList = new ArrayList<>();

	// Add 5 elements
	exampleList.add(11);
	exampleList.add(22);
	exampleList.add(33);
	exampleList.add(44);
	exampleList.add(55);

	// Get size & print
	int listSize = exampleList.size();
	System.out.println("Size of list: " + listSize);

	// Print elements
	for (int i = 0; i < exampleList.size(); i++) {
	    int value = exampleList.get(i);
	    System.out.println("Element: " + value);
	}
    }
}
