package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEqualsMethod {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(50);
		list.add("akash");
		list.add(true);
		list.add('a');
		list.add(63.25f);
		list.add(null);
		list.add(50);

		List a = new ArrayList();
		a.add(50);
		a.add("akash");
		a.add(true);
		a.add('a');
		a.add(63.25f);
		a.add(null);

		boolean result1 = list.equals(a);
		System.out.println(result1);
	}

}
