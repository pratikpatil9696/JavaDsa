
//ThreadGroup

class MyThread extends Thread{

	MyThread(ThreadGroup tg,String str){

		super(tg,str);
	}

	public void run(){

		System.out.println(Thread.currentThread());
	}
}


class ThreadDemo{

	public static void main(String[] args) {
	
		ThreadGroup GP = new ThreadGroup("Core2Web");

		MyThread obj1 = new MyThread(GP,"CPP");
		MyThread obj2 = new MyThread(GP,"Java");
		MyThread obj3 = new MyThread(GP,"Python");
		
		obj1.start();
		obj2.start();
		obj3.start();
		
	}
}

