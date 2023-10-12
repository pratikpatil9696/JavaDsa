
import java.util.concurrent.*;
import java.util.*;

class Demo{

	public static void main(String[] args)throws InterruptedException {
		
		BlockingQueue bque = new ArrayBlockingQueue(3);

		bque.offer(10);
		bque.offer(30);
		bque.offer(20);

		


		System.out.println(bque);

		bque.offer(44,3,TimeUnit.SECONDS);

		System.out.println(bque);

		ArrayList al = new ArrayList();
		System.out.println("ArrayList : "+al);

		bque.drainTo(al,20);

		System.out.println("ArrayList : "+al);
		System.out.println(bque);

		System.out.println("A");


	}
}