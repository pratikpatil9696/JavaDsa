

//Methods of Tree map


import java.util.*;


class Demo{

	public static void main(String[] args) {
		

		SortedMap tm = new TreeMap();

		tm.put("IND","India");
		tm.put("PAK","Pakistan");
		tm.put("SL","SriLanka");
		tm.put("AUS","Australia");
		tm.put("BAN","Banglasdesh");

		System.out.println(tm);

		//subMap
		System.out.println(tm.subMap("AUS","PAK"));

		//headMap
		System.out.println(tm.headMap("PAK"));
		System.out.println("***");

		//tailMap
		System.out.println(tm.tailMap("PAK"));

		//firstkey
		System.out.println(tm.firstKey());

		//lastKey
		System.out.println(tm.lastKey());

		//keySet
		System.out.println(tm.keySet());

		//values
		System.out.println(tm.values());

		//entrySet
		System.out.println(tm.entrySet());
	}
}