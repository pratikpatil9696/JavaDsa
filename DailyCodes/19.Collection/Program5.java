

//LinkedList

import java.util.*;

class Demo{

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();

		ll.add(20);
		ll.addFirst(10);
		ll.addLast(30);

		System.out.println(ll);
		ll.add(1,"pratik");
		System.out.println(ll);
	}
}