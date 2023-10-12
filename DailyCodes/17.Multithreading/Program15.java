
//Child ThreadGroup

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
	
		ThreadGroup ParentTg = new ThreadGroup("Core2Web");

		MyThread obj1 = new MyThread(ParentTg,"CPP");
		MyThread obj2 = new MyThread(ParentTg,"Java");
		MyThread obj3 = new MyThread(ParentTg,"Python");
		
		obj1.start();
		obj2.start();
		obj3.start();
		
		ThreadGroup ChildTg = new ThreadGroup(ParentTg,"Incubator");

		MyThread obj4 = new MyThread(ChildTg,"Flutter");
		MyThread obj5 = new MyThread(ChildTg,"ReactJs");
		MyThread obj6 = new MyThread(ChildTg,"SprintBoot");

		obj4.start();
		obj5.start();
		obj6.start();
	}
}

