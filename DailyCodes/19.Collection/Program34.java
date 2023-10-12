

//Iterator on Tree map


import java.util.*;


class Demo{

	public static void main(String[] args) {
		

		SortedMap tm = new TreeMap();

		tm.put("IND","India");
		tm.put("PAK","Pakistan");
		tm.put("SL","SriLanka");
		tm.put("AUS","Australia");
		tm.put("BAN","Banglasdesh");



		Set<Map.Entry> data = tm.entrySet();

		System.out.println(data);


		Iterator <Map.Entry> itr = data.iterator();

		while(itr.hasNext()){

			//System.out.println(itr.next());

			Map.Entry abc =itr.next();

			System.out.println(abc.getKey() + ":" +abc.getValue());
		}
	}
}