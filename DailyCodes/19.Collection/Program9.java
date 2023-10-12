

import java.util.*;

class Demo{

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();

		LinkedList ll = new LinkedList();

		al.add(10);
		al.add(20);
		al.add(50);
		al.add(40);


		for(Object x:al){

			System.out.println(x);
		}

		System.out.println("**************************");

		Iterator itr = al.iterator();

		Iterator itr2 =ll.iterantor();

		System.out.println(itr.next());

		System.out.println(itr.getClass().getName());
		System.out.println(itr2.getClass().getName());

	}
}