package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListForEachMethod {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(50);
		list.add("akash");
		list.add(true);
		list.add('a');
		list.add(63.25f);
		list.add(null);

		list.forEach(element -> System.out.println(element));
	}

}
