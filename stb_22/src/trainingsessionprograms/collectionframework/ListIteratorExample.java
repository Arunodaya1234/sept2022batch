package collectionframework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Fourth");
		al.add("Fifth");
		System.out.print(al);
		System.out.println(" ");
		ListIterator litr=al.listIterator();
		//Iteration in forword direction
		System.out.println("Iteration in forword direction");
		while(litr.hasNext())
		{
			Object o=litr.next();
			if(o.equals("Third"))
			{
				litr.remove();
			}
			System.out.print((String)o+" ");
		}
		System.out.println((" "));
		System.out.println("Iteration in backword direction");
		while(litr.hasPrevious())
		{
			Object o=litr.previous();
			System.out.print((String)o+" ");
		}
		
	}

}
