
//Producer Consumer Problem

import java.util.concurrent.*;

class Producer implements Runnable{

	BlockingQueue bQueue=null;

	Producer(BlockingQueue bQueue){
		this.bQueue = bQueue;
	}

	public void run(){
		
			for(int i=1;i<=10;i++){

			try{	
			bQueue.put(10);
			System.out.println("Produce" +i);
			}catch(InterruptedException e){}
		}

		try{
			Thread.sleep(3000);
		}catch(InterruptedException e){}

	}
}


class Consumer implements Runnable{

	BlockingQueue bQueue=null;

	Consumer(BlockingQueue bQueue){
		this.bQueue=bQueue;
	}


	public void run(){
		
			for(int i=1;i<=10;i++){

			try{	
			bQueue.take();
			System.out.println("Consume" +i);
			}catch(InterruptedException e){}
		}
	}
}

class ProducerConsumer{

	public static void main(String[] args) {
		
		BlockingQueue bQueue = new ArrayBlockingQueue(3);


		Producer produce = new Producer(bQueue);
		Consumer consume = new Consumer(bQueue);


		Thread producerThread =new Thread(produce);
		Thread consumerThread =new Thread(consume);

		producerThread.start();
		consumerThread.start();

	}
}