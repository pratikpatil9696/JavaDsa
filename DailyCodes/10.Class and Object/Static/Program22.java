class User22{

	int x= 10;
	void fun1(){

		System.out.println(x);

	}

	static{

		System.out.println("useeeee");
	}
}

class Program22{
	
	public static void main(String[] args) {
		
		System.out.println("Main");

		
	}


	static{

		

		System.out.println("Block 2");

		User22 obj = new User22();
		obj.fun1();
	}





	

}