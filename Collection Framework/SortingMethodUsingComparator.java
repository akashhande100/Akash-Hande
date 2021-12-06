package collectionFramework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingMethodUsingComparator{
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(96);
		list.add(98);
		list.add(20);
		list.add(63);
		System.out.println(list);
		
		list.sort(new Comparator<Integer>() {	//By using sorting method you have to get collection in asending order

		public int compare(Integer o1, Integer o2) {
				
				return o1.compareTo(o2);
			}
			
		});
		
		System.out.println("After Sorting = " + list);
	}

}
