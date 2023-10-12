

//Hashmap Methods


import java.util.*;

class Demo{

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();

		hm.put("Java",".java");
		hm.put("Python",".py");
		hm.put("Dart",".dart");

		System.out.println(hm);

		//get
		System.out.println(hm.get("Python"));

		//keySet
		System.out.println(hm.keySet());

		//values
		System.out.println(hm.values());

		//entrySet
		System.out.println(hm.entrySet());



	}
}