class Demo{
	
	void m2()throws ArithmeticException  {

		System.out.println("Start m2");
		System.out.println(10/0);
		System.out.println("End m2");
	}

	void m1(){

		System.out.println("Start m1");
		m2();
		System.out.println("End m1");
	}

	

	public static void main(String[] args){
		
		System.out.println("Start111111 Main");
		Demo obj = new Demo();
		obj.m1();

		System.out.println("End Main");
	}
}