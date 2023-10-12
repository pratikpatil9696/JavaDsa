

//SortedSet 


import java.util.*;

class  Demo{

	public static void main(String[] args) {
		
		SortedSet ss = new TreeSet();

		ss.add("Kanha");
		ss.add("Rajesh");
		ss.add("Rahul");
		ss.add("Ashish");
		ss.add("Badhe");

		System.out.println(ss);

		System.out.println(ss.headSet("Kanha"));

		System.out.println(ss.tailSet("Kanha"));

		System.out.println(ss.subSet("Ashish","Rahul"));

		System.out.println(ss.first());

		System.out.println(ss.last());

		System.out.println(ss);

	}
}