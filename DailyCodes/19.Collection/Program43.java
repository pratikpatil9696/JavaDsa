

import java.util.*;

class Demo extends ArrayDeque{

	public static void main(String[] args) {
		
		Deque obj = new ArrayDeque();

		obj.offer(10);
		obj.offer(40);
		obj.offer(20);
		obj.offer(30);

		System.out.println(obj);

		System.out.println(obj.inc(40,20));


	}
} 
