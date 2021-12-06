package collectionFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		set.add(12);
		set.add(96);
		set.add(98);
		set.add(20);
		set.add(63);
		
		System.out.println(set);
		
		HashSet set1 = new HashSet<>();
		set1.add("a");
		set1.add(45);
		set1.add(96);
		set1.addAll(set);
		set1.add(null);
		
		System.out.println(set1);
		
		
	}

}
