

// ThreadGroup with Runnable interface
class MyThread extends Thread{


	public void run(){

		System.out.println(Thread.currentThread());

		try{
			Thread.sleep(5000);

		}catch(InterruptedException ie){

			System.out.print(ie.toString());
		}
	}
}


class ThreadDemo{

	public static void main(String[] args)throws InterruptedException {
		
		ThreadGroup pThreadGP = new ThreadGroup("India");

		MyThread obj1 = new MyThread();
		MyThread obj2 = new MyThread();
		
		Thread t1 = new Thread(pThreadGP , obj1 , "Maha");
		Thread t2 = new Thread(pThreadGP , obj2 , "Goa");
		
		t1.start();
		t2.start();	
		
		
	}
}