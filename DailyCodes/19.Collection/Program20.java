

//user defined arraylist sorting


import java.util.*;

class Movies{

	String name = null;
	double coll =0;
	int imd =0;

	Movies(String name,double coll,int imd){

		this.name=name;
		this.coll=coll;
		this.imd=imd;
	}

	public String toString(){
		return "{" + name + ":" + coll + ":" +imd+ "}";
	}
}

class SortByName implements Comparator{

	public int compare(Object obj1,Object obj2){

		return ((Movies)obj1).name.compareTo(((Movies)obj2).name);
	}
}


class Demo{

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();

		al.add(new Movies("Subhedar" , 1000 , 10));
		al.add(new Movies("Jawan" , 700 ,8));
		al.add(new Movies("Gadar2" , 900,9));
		al.add(new Movies("Omg2",100,5));
		al.add(new Movies("Ishq",600,7));

		System.out.println(al);


		Collections.sort(al,new SortByName());
		System.out.println(al);

	}
}