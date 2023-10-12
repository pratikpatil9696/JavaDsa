
import java.util.*;

class Demo{

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20.5f);
		al.add("Pratik");
		al.add("patil");
		al.add(10);

		System.out.println(al);
		

		//int size
		System.out.println(al.size());

		//boolean contains(obj)
		System.out.println(al.contains("Pratik"));
		System.out.println(al.contains("Ashu"));

		//int indexOf(obj)
		System.out.println(al.indexOf("patil"));
		System.out.println(al.indexOf(10));
		System.out.println(al.indexOf(50));

		//int lastindexOf(obj)
		System.out.println(al.lastIndexOf("patil"));
		System.out.println(al.lastIndexOf(10));
		

		//E get(int)
		
		System.out.println(al.get(3));
		System.out.println(al.get(4));
		//System.out.println(al.get(5));

		//E set(int ,E)
		
		System.out.println(al.set(4,"Core2Web"));
		System.out.println(al.get(4));
		System.out.println(al);

		//void add(int,E)
		al.add(1,"Incubator");
		System.out.println(al);

		//E remove(int)
		System.out.println(al.remove(1));
		System.out.println(al);

		//boolean remove (obj)
		
		System.out.println(al.remove("Incubator"));
		System.out.println(al.remove(20.5f));
		System.out.println(al);

		//void clear()
		al.clear();
		System.out.println(al);


		ArrayList al2 = new ArrayList();

		al2.add("Ashu");
		al2.add("sanskar");
		al2.add("Shubham");

		//boolean addAll(collection)
		
		System.out.println(al);
		System.out.println(al.addAll(al2));
		System.out.println(al);
		System.out.println(al2);

		//boolean addAll(int,collection)
		System.out.println("*******************");
		System.out.println(al.addAll(1,al2));
		System.out.println(al);
		System.out.println(al2);

		//protected void removeRange(int,int)

		System.out.println("_______________________");
		System.out.println(al);
		al.add(10);
		System.out.println(al);
		

	}
}