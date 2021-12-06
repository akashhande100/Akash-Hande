package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGetIndexOfMethod {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(50);
		list.add("akash");
		list.add(true);
		list.add('a');
		list.add(63.25f);
		list.add(null);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	/*	int i = 0;
		while (i < list.size()) {
			System.out.println(list.get(i));
			i++;
		}	*/

	}

}
