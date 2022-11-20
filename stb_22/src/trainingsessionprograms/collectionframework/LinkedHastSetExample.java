package collectionframework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHastSetExample {

	public static void main(String[] args) {
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		System.out.println(set.size());
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(null);
		set.add(null);
		set.add(null);
		System.out.println(set);
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(4);
		hs.add(5);
		hs.add(6);
		hs.add(7);
		hs.add(8);
		set.addAll(hs);
		System.out.println(set);
//		set.removeAll(hs);
		//System.out.println("retainAll:"+set.retainAll(hs));
		Iterator<Integer> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	}

}
