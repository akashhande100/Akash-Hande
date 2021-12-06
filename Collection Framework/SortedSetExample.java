package collectionFramework;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
	
	public static void main(String[] args) {
		
		SortedSet set = new TreeSet();
		set.add("Prasad");
		set.add("Rahul");
		set.add("Neha");
		set.add("Savita");
		set.add("Tushar");
		set.add("Sonali");
		
		System.out.println(set);
		System.out.println("First = " +set.first());
		System.out.println("Last = " +set.last());
		
		SortedSet set1 = set.headSet("Savita");
		System.out.println("Head Set = " +set1);
		
		set1 = set.subSet("Neha", "Sonali");
		System.out.println("Sub Set = " + set1);
		
		set1 = set.tailSet("Sonali");
		System.out.println("Tail Set = "+ set1);
		
	}

}
