

//Sorting List

import java.util.*;

class Demo{

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();

		al.add("Rahul");
		al.add("Badhe");
		al.add("Ashish");
		al.add("Badhe");

		System.out.println(al);

		TreeSet ts = new TreeSet(al);	
		System.out.println(ts);


		Collections.sort(al);
		System.out.println(al);
	}
}