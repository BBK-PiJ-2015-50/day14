/**
 * Class for MergeSort algorithm
 */
import java.util.*;

public class MergeSort {
	private List<Integer> myList;
	
	public static void main (String[] args){
		MergeSort mySort = new MergeSort();
		mySort.launch();
	}
	
	public void launch() {
		MergeSort myMerge = new MergeSort();
		myList = new ArrayList<Integer>();
		for (int i=0;i<10;i++) {
			int j = (int) (Math.random() * 100);
			myList.add(j);
			System.out.println(j);
		}
		
		
		myList = myMerge.mergeSort(myList);
		for (int i=0;i<myList.size();i++) {
			System.out.println("- " + myList.get(i));
		}
		
	}
	
	public List<Integer> mergeSort(List<Integer> list) {
		int size = list.size();
		if(size <= 1) {
			return list;
		} else {
			
			
			List<Integer> subList1 = new ArrayList<Integer>();
			Object[] array1 = mergeSort(list.subList(0, size/2)).toArray();
			for (int i = 0; i<array1.length; i++) {
				
				subList1.add((Integer) array1[i]);
			}
			
			List<Integer> subList2 = new ArrayList<Integer>();
			
			Object[] array2 = mergeSort(list.subList((size/2), size)).toArray();
			for (int i = 0; i<array2.length; i++) {
				subList2.add((Integer) array2[i]);
			}
			
			
			// now we have two sorted lists
			// let's merge them
			List<Integer> result = new ArrayList<Integer>();
			int size1 = subList1.size();
			int size2 = subList2.size();
			while ((size1 > 0) && (size2 > 0)) {

				if (subList1.get(0) <= subList2.get(0)) {
					result.add(subList1.remove(0));
					size1--;
				} else {
					result.add(subList2.remove(0));
					size2--;
				} 
			} 
			
			if ((size1 == 0) && (size2 == 0)) {
				System.out.println("Both zero");
			} 
			else 
			{
				if ((size2 > 0)) {
					result.addAll(subList2);
					for (Integer number:subList2) {
						result.add(number);
					}
					
				} 
				
				if ((size1 > 0)){
					
					for (Integer number:subList1) {
						result.add(number);
					}

				}
			}
			
			
			return result;

		}
	}
	

}