

// ThreadGroup with Thread class


class MyThread extends Thread{

	MyThread(ThreadGroup tg , String str){

		super(tg , str);
	}

	MyThread(String str){

		super(str);
	}

	MyThread(){

		super();
	}


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

		MyThread t1 = new MyThread(pThreadGP,"Maha");
		MyThread t2 = new MyThread(pThreadGP,"Goa");
		MyThread t8 = new MyThread("UP");

		t1.start();
		t2.start();	
		t8.start();

		ThreadGroup cThreadGP = new ThreadGroup(pThreadGP,"Pakistan");

		MyThread t3 = new MyThread(cThreadGP,"karachi");
		MyThread t4 = new MyThread(cThreadGP,"lahore");

		t3.start();
		t4.start();


		ThreadGroup cThreadGP2 = new ThreadGroup(pThreadGP,"Bangladesh");

		MyThread t5 = new MyThread(cThreadGP2,"Dhaka");
		MyThread t6 = new MyThread(cThreadGP2,"Mirpur");

		t5.start();
		t6.start();
		
		cThreadGP.interrupt();

		System.out.println(pThreadGP.activeCount());

		System.out.println(pThreadGP.activeGroupCount());


		MyThread t9 = new MyThread();

		t9.start();
	}
}