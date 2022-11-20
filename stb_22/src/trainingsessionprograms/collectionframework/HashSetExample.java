package collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("First");
		hs.add("Second");
		hs.add("Third");
		hs.add("Fourth");
		hs.add("Fifth");
		System.out.println(hs);
		System.out.println("After adding duplicate elements");
		hs.add("First");
		hs.add("Third");
		System.out.println(hs);
		System.out.println("After adding null elements");
		hs.add(null);
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		HashSet<String> hs1=new HashSet<String>();
		hs1.add("Sixth");
		hs1.add("Seventh");
		hs1.add("Eightenth");
		hs.addAll(hs1);
		System.out.println("After adding another hashset");
		System.out.println(hs);
		hs.remove("Eightenth");
		System.out.println("After removing element");
		System.out.println(hs);
//		System.out.println("After clear");
//		hs.clear();
//		System.out.println(hs);
		if(hs.contains("First"))
		{
			System.out.println("First is available");
		}
		else
		{
			System.out.println("First is not available");
		}
		
		System.out.println(hs.isEmpty());
		
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	}

}
