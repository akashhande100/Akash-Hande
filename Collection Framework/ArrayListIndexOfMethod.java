package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIndexOfMethod {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(50);
		list.add("akash");
		list.add(true);
		list.add('a');
		list.add(63.25f);
		list.add(null);
		list.add(50);
		
		System.out.println(list.indexOf(50));
		System.out.println(list.isEmpty());
		System.out.println(list.lastIndexOf(50));	
	}

}
