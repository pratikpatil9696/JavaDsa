

//NavigableSet


import java.util.*;

class Demo{

	public static void main(String[] args) {
		
		NavigableSet ns = new TreeSet();

		ns.add(10);
		ns.add(30);
		ns.add(14);
		ns.add(27);
		ns.add(23);

		System.out.println(ns);

		//lower less than
		System.out.println(ns.lower(23));
		System.out.println(ns.lower(25));


		//floor less than equal to
		System.out.println(ns.floor(23));
		System.out.println(ns.floor(25));


		//ceiling Greater than equal to
		System.out.println(ns.ceiling(23));
		System.out.println(ns.ceiling(25));


		//higher Greater than 
		System.out.println(ns.higher(23));
		System.out.println(ns.higher(25));

		//pollFirst
		ns.pollFirst();
		ns.pollLast();
		System.out.println(ns);
		

		//descendingset
		System.out.println(ns.descendingSet());

		//iterator()
		Iterator itr = ns.iterator();

		while(itr.hasNext()){
			System.out.println(itr.next());
		}


		//descending iterator()
		Iterator itr1 = ns.descendingIterator();

		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}


		//subset()
		System.out.println(ns.subSet(10,true,27,false));

	}
}