class MyThreaad extends Thread{

		public void run() {

			System.out.println(Thread.currentThread().getName());

		}

		
}


class ThreadDemo{

	public static void main(String[] args) throws InterruptedException{
		
		System.out.println(Thread.currentThread().getName());
		MyThreaad obj = new MyThreaad();
		obj.start();


		System.out.println(Thread.currentThread().getName());
		MyThreaad obj1 = new MyThreaad();
		obj1.start();



		System.out.println(Thread.currentThread().getName());
		MyThreaad obj2 = new MyThreaad();
		obj2.start();



		
	}
}