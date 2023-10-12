

//methods of queue

import java.util.*;

class Demo{

	public static void main(String[] args) {
		
		Queue que = new LinkedList();

		que.offer(10);
		que.offer(20);
		que.offer(50);
		que.offer(30);
		que.offer(40);

		System.out.println(que);


		//poll() return nothing if element is not there
		System.out.println(que.poll());
		System.out.println(que);
		
		//remove() return exception  if element is not there
		System.out.println(que.remove());
		System.out.println(que);


		//peek() return null if element is not there
		System.out.println(que.peek());
		System.out.println(que);


		//element() return exception if element is not there
		System.out.println(que.element());
		System.out.println(que);

	}
}