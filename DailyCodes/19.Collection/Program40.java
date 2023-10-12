

//priorityqueue

import java.util.*;

class Demo{

	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue();

		pq.offer(20);
		pq.offer(10);
		pq.offer(50);
		pq.offer(30);
		pq.offer(40);

		System.out.println(pq);


		PriorityQueue pq1 = new PriorityQueue();

		pq1.offer("Kanha");
		pq1.offer("Ashish");
		pq1.offer("Rahul");
		pq1.offer("Rajesh");
		pq1.offer("Badhe");

		System.out.println(pq1);

	}
}