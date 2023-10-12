
// ThreadPool


import java.util.concurrent.*;

class MyThread implements Runnable{

	int num;
	
	MyThread(int num){

		this.num=num;
	}

	public void run(){

		System.out.println(Thread.currentThread() + "Start Thread :" + num);
		dailytask();

		System.out.println(Thread.currentThread() + "End Thread : " + num);
	}


	void dailytask(){

		try{

			Thread.sleep(1000);
		}

		catch(InterruptedException ie){}
	}

}


class ThreadDemo{

	public static void main(String[] args) {
		
		// = Executors.newFixedThreadPool(5); //yachi stack frame push hote teva Thread chya constructor la call karun 5 Thread cha pool banvto ani he ready to run madhe yevun vat bgt bastat task yenyachi
	
	//	 ExecutorService ser = Executors.newFixedThreadPool(3);
		 ExecutorService ser = Executors.newCachedThreadPool();

		
			for(int i=1;i<=6;i++){

				MyThread obj = new MyThread(i);
				ser.execute(obj);
			}

			ser.shutdown();

	}
}