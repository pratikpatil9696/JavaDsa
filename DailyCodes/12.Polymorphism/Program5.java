class Demo5{
	
	

	void fun(Object obj){

		System.out.println("Object Para");
		 
	}

	void fun(String str){

		System.out.println("String Para");
	}

	
}

class Client5{

	public static void main(String[] args) {
		
		Demo5 obj = new Demo5();
		String sr = new String("ppp");
		obj.fun(obj);

	
	}
}