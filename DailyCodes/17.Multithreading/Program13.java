
//Change Thread Name

class MyThread extends Thread{

	MyThread(String str){

		super(str);
	}


	public void run(){

		System.out.println(getName());
		
	}
}


class ThreadDemo{

	public static void main(String[] args) {
		
		MyThread obj = new MyThread("xyz");
		obj.start();

		
	}
}

