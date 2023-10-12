
// finally block



class Demo{

	void m1(){}
	void m2(){}

	public static void main(String[] args){
		
		Demo obj = new Demo();
		obj.m1();

		obj = null;


		try{
		obj.m2();
		}

		catch(NullPointerException e){

			System.out.println("I am Here");
		}

		finally{
			System.out.println("Connection Closed");
		}

		System.out.println("End main");
	}
}