package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveMethod {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(50);
		list.add("akash");
		list.add(true);
		list.add('a');
		list.add(63.25f);
		list.add(null);
		list.add(50);
		
		list.remove(0);
		System.out.println(list);
		
		Integer o = new Integer(50);
		list.remove(o);
		System.out.println(list);
	
	}

}
