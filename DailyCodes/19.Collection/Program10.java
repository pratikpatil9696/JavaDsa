

//Cursor


import java.util.*;

class Demo{

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();

		al.add("Ashish");
		al.add("Kanha");
		al.add("Rahul");
		al.add("Badhe");


		//Type No 1 Iterator
		System.out.println("Type No 1 Iterator");
		System.out.println();
		Iterator itr = al.iterator();

		while(itr.hasNext()){

			if("Rahul".equals(itr.next())){
				itr.remove();
			}
		}

		System.out.println(al);



		//Type No 2 ListIterator
		System.out.println("Type No 2 ListIterator");
		System.out.println();


		ListIterator itr2 = al.listIterator();

		while(itr2.hasNext()){

			System.out.println(itr2.next());
		}

		while(itr2.hasPrevious()){

			System.out.println(itr2.previous());

		}



		//Type No 3 Enumeration
		System.out.println("Type No 3 Enumeration");
		System.out.println();

		Vector v = new Vector();

		v.add("Ashish");
		v.add("Kanha");
		v.add("Rahul");
		v.add("Badhe");

		System.out.println(v);

		Enumeration itr3 = v.elements();

		while(itr3.hasMoreElements()){

			System.out.println(itr3.nextElement());
		}
	}
}