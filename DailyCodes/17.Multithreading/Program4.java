
//Aapan start() nahi lihu Shakat


class MyThreaad extends Thread{

		public void run(){

			System.out.println("Run");
			System.out.println(Thread.currentThread().getName());

		}

		public void start(){

			System.out.println("start");
			run();
		}

		
}


class ThreadDemo{

	public static void main(String[] args){
		
		
		MyThreaad obj = new MyThreaad();

		obj.start();

		System.out.println(Thread.currentThread().getName());
	
	}
}