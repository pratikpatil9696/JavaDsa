class Parent{

	void fun(int x){

				System.out.println("In Parent Fun2222");
	}

}

class Child extends Parent{

	
	static void fun(int x){

		System.out.println("In Child Fun");
	}

}


class Client4{

	public static void main(String[] args) {
		
		Child obj1 = new Child();
		obj1.fun(10);
		
		


		
	}
}