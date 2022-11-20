package collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class MapInJava {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();
		Map<Integer, String> map2=new HashMap<Integer, String>();
		map2.put(6, "Abhishek");
		map2.put(7, "Bharat");
		map2.put(8, "Chetan");
		map2.put(4, "Dinesh");
		map2.put(5, "Evon");
		System.out.println(map.isEmpty());
		map.put(1, "Abhishek");
		map.put(2, "Bharat");
		map.put(3, "Chetan");
		map.put(4, "Dinesh");
		map.put(5, "Evon");
		System.out.println(map.isEmpty());
		map.putAll(map2);
		System.out.println(map);
		System.out.println("After removing element");
		map.remove(8, "Chetan");
		System.out.println(map);
		//map.clear();
		System.out.println(map.get(5));
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		Iterator<Entry<Integer,String>> itr=map.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		
	}

}
