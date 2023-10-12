
//Join()  with DeadLock

class MyThread extends Thread{

	static Thread nMain=null;

	public void run(){


		try{

			nMain.join();
		}catch(InterruptedException obj){}

		System.out.println(nMain);

		System.out.println("In Thread-0");
	}
}


class ThreadDemo{

	public static void main(String[] args) throws InterruptedException{
		

		MyThread.nMain=Thread.currentThread();

		MyThread obj = new MyThread();
		obj.start();

		obj.join();


		System.out.println("In  main");
	}
}