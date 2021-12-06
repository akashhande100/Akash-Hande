package collectionFramework;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		set.add("Prasad");
		set.add("Rahul");
		set.add("Neha");
		set.add("Savita");
		set.add("Tushar");
		set.add("Sonali");
		
		System.out.println(set);
		System.out.println("Ceiling = " + set.ceiling("So"));
		System.out.println("Ceiling = " + set.ceiling("O"));
		System.out.println("Floor = " + set.floor("S"));
		
		Iterator itr = set.descendingIterator();
		System.out.print("Descending order set = ");
		while (itr.hasNext()) {
			System.out.print(itr.next()+", ");
		}
	}

}
