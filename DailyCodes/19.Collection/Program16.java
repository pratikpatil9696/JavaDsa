

//user defined sorting (TreeSet)


import java.util.*;

class Movies implements Comparable {

	String movieName=null;
	float totalColl=0.0f;


	Movies(String movieName,Float totalColl){

		this.movieName=movieName;
		this.totalColl=totalColl;

	}

	public int compareTo(Object obj){

		 	return movieName.compareTo(((Movies)obj).movieName);
		
	}

	public String toString(){

		return movieName;
	}
}


class Demo{

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();

		ts.add(new Movies("Gadar2",150.00f));
		ts.add(new Movies("Omg2",120.00f));
		ts.add(new Movies("Jailer",250.00f));

		System.out.println(ts);
	}
}