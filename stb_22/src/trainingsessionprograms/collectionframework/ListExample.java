package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ListExample {

	public static void main(String[] args) {
		//List<data_type> list=new ArrayList<data_type>();
		List<String> list1=new ArrayList<String>();
		list1.add("m");//boolean
		list1.add("n");
		list1.add(1,"o");//void
		List<String> list=new ArrayList<String>();
		list.add("a");//boolean
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add(3,"e");//void
		list.addAll(list1);
		
		//list.removeAll(list1);
		System.out.println(list.contains("n"));
		System.out.println(list.containsAll(list1));
		
		System.out.println(list.indexOf("n"));
//		System.out.println(list.get(10));
		System.out.println(list);
		
		int size=list.size();
		System.out.println("Simple for");
		for(int i=0;i<size;i++)
		{
			System.out.print(list.get(i)+" ");
		}
		System.out.println("");
		System.out.println("Advanced for ");
		for(String mylist: list)
		{
			System.out.print(mylist+" ");
		}
		System.out.println("");
		System.out.println("Using While loop ");
		int x=0;
		while(size>x)
		{
			System.out.print(list.get(x)+" ");
			x++;
		}
		System.out.println("");
		System.out.println("Using Iterator ");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			//String element=itr.next();
			System.out.print(itr.next()+" ");
		}
	}

}
