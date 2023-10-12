interface A{

	 int x = 10;

	
}

interface B{

	int x = 20;
}


class Child implements A,B{

	 int x=30;

	public void fun(){

		
		System.out.println(.x);
		//System.out.println(Demo.x);
		//System.out.println(x);
		//System.out.println(System.identityHashCode(x));
	}
}

class Client{

	public static void main(String[] args) {
		
		Child obj = new Child();
		obj.fun();
	}
}