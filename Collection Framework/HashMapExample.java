package collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	
	public static void main(String[] args) {
		
		Map map = new HashMap();
		map.put("Selenium", 1);
		map.put(2, "Java");
		map.put("Data", 3);
		map.put(4.1, "Eclipse");
		map.put(null, null);
		
		System.out.println(map);
		
		System.out.println("Contains Key Method = "+ map.containsKey(2));
		System.out.println("Contains Value Method ="+ map.containsValue("Eclipse"));
		
	/*	Set set = map.keySet();
		System.out.println("Set of keys =" + set);
		
		for(Object obj : set) {
			System.out.println(obj+" > "+map.get(obj));
		}
		*/
		
		Set set2 = map.entrySet();
		
		Iterator itr = set2.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Entry) itr.next();
			
			System.out.println(entry.getValue());
			}
		
		map.remove(4.1);
		System.out.println(map);
		
		
		
		
		
		
		
		
		}

}
