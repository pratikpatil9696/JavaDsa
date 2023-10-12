
//

import java.util.*;

class Demo{

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();

		hm.put(10,"Kanha");
		hm.put(10,"Rahul");
		hm.put(10,"Badhe");

		System.out.println(hm);

		hm.put(new Integer(10),"Kanha");
		hm.put(new Integer(10),"Rahul");
		hm.put(new Integer(10),"Badhe");

		System.out.println(hm);


		System.out.println("***********");

		IdentityHashMap ihm = new IdentityHashMap();

		

		ihm.put(new Integer(10),"Kanha");
		ihm.put(new Integer(10),"Rahul");
		ihm.put(new Integer(10),"Badhe");

		System.out.println(ihm);

	}
}