package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		//LinkedList<String> ll=new LinkedList<String>();
		System.out.println("After adding element:");
		ll.add("One");
		ll.add(2);
		ll.add(null);
		ll.add("Four");
		ll.add(3, "Three");
		System.out.println(ll);
		System.out.println("After addFirst method");
		ll.addFirst("Zero");
		System.out.println(ll);
		System.out.println("After addLast method");
		ll.addLast("Five");
		System.out.println(ll);
		
		System.out.println("After adding collection in list");
		ArrayList al=new ArrayList();
		al.add("Six");
		al.add(7);
		al.add("Eight");
		ll.addAll(al);
		System.out.println(ll);
		
		System.out.println("After adding Vector");
		Vector v=new Vector();
		v.add(7.5);
		v.add(7.9);
		v.add("Ten");
		ll.addAll(v);
		System.out.println(ll);
		
		System.out.println("After removing first element");
		ll.removeFirst();
		System.out.println(ll);
		
		System.out.println("After removing last element");
		ll.removeLast();
		System.out.println(ll);
		
		System.out.println("After removing specific indexed element");
		ll.remove(2);
		System.out.println(ll);
		
		System.out.println("Getting element");
		System.out.println(ll.get(5));
		
		System.out.println("");
		System.out.println("Iteration using for loop");
		for(int i=0;i<ll.size();i++)
		{
			System.out.print(ll.get(i)+" ");
		}
		
		System.out.println("");
		System.out.println("Iteration using Iterator");
		Iterator itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		System.out.println("");
		System.out.println("Iteration using List Iterator");
		ListIterator litr=(ListIterator) ll.iterator();
		while(litr.hasNext())
		{
			Object obj=litr.next();
			System.out.print(obj+" ");
		}
		
		System.out.println(" ");
		System.out.println("Stack");
		Stack<Integer> s=new Stack<Integer>();
		s.push(2);
		s.push(3);
		s.push(5);
		s.push(6);
		System.out.println(s);
		System.out.println("After pop");
		s.pop();
		System.out.println(s);
		
	}

}
