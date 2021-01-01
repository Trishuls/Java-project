package learn;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Trishul");
		ll.add("Hanuman");
		ll.add(0, "God"); //add element at specified index
		
		LinkedList<String> ll1 = new LinkedList<String>();
		ll1.add("Apple");
		ll1.add("Mango");
		
		ll.addAll(ll1); // add all elements of ll1 to ll
		
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("Banana");
		ll2.add("Pinaple");
		ll2.add("Apple");
		
		ll.addAll(1, ll2);// add linked list to specified index of other linked list using addAll()
		
		ll.addFirst("First"); // add element at first position
		ll.addLast("Last"); // add element at last position
		
		ll.remove("Vijay"); // remove specified element
		ll.remove(0); // remove element based on position
		
		System.out.println("Before invoking remove");
		
		Iterator<String> itr = ll.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		ll.removeAll(ll1); // remove list of elements from linked list
		ll.removeFirst(); // remove last element from linked list
		ll.removeLast(); //remove last element from linked list
		
		System.out.println("After remove");
		
		Iterator<String> itr1 = ll.iterator();
		while(itr1.hasNext())
			System.out.println(itr1.next());
		
		System.out.println();
		System.out.println("after invoking foreach");
		ll.forEach(n -> System.out.println(n));
	}

}
