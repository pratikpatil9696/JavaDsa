class MyThreaad extends Thread{

		public void run(){

	

		for(int i=0;i<10;i++){

			System.out.println("In run");
			try{
			Thread.sleep(2000);
			}

			catch(InterruptedException obj){

			}
		}
	}
}


class ThreadDemo{

	public static void main(String[] args) throws InterruptedException{
		

		MyThreaad obj = new MyThreaad();
		obj.start();



		for(int i=0;i<10;i++){

			System.out.println("In Main");
			Thread.sleep(2000);
		}
	}
}