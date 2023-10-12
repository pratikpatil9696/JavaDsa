
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

			Thread.sleep(10000);
		}

		catch(InterruptedException ie){}
	}

}


class ThreadDemo{

	public static void main(String[] args) {
		
		
		//	ExecutorService ser = Executors.newFixedThreadPool(3);
					
		ThreadPoolExecutor tpe1	= (ThreadPoolExecutor)Executors.newFixedThreadPool(2);
		
		ThreadPoolExecutor tpe2 = (ThreadPoolExecutor)Executors.newFixedThreadPool(2);


			for(int i=1;i<=4;i++){

				MyThread obj = new MyThread(i);
				tpe1.execute(obj);
			}

			



			for(int i=1;i<=4;i++){

				MyThread obj = new MyThread(i);
				tpe2.execute(obj);
			}

			tpe1.shutdown();
			tpe2.shutdown();

	}
}