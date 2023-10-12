
import java.util.concurrent.*;
import java.util.*;

class Demo{

	public static void main(String[] args)throws InterruptedException {
		
		BlockingQueue bque = new PriorityBlockingQueue();


		bque.offer("Kanha");
		bque.offer("Ashish");
		bque.offer("Rahul");
		bque.offer("Badhe");


		System.out.println(bque);

	
	}
}