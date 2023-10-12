
//yield ()


class MyThread extends Thread{

		public void run(){
				System.out.println(Thread.currentThread().getName());

				for(int i=1;i<100;i++){

					System.out.println("THread");
				}
		}
}


class ThreadDemo{

		public static void main(String[] args)throws InterruptedException {
			
			MyThread obj = new MyThread();
			obj.start();

			obj.yield();

				for(int i=1;i<100;i++){

					System.out.println("Main");
				}
				
			//obj.yield();

			System.out.println(Thread.currentThread().getName());
		
		}
}
