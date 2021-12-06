package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddMethod {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(50);
		list.add("akash");
		list.add(true);
		list.add('a');
		list.add(63.25f);
		list.add(null);
		list.add(50);

		System.out.println(list);
		System.out.println("Size of List =" + list.size());

		List list1 = new ArrayList();
		list1.add(100);
		list1.add(false);

		list1.addAll(list);

		list1.add(2, 1000);
		list1.addAll(0, list);

		System.out.println(list1);
	}

}
