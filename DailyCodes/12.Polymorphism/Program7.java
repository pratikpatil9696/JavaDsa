class Parent7{

	
	 void fun(){

		System.out.println("Parent fun");
	
	}
}

class Child7 extends Parent7{

	static void  fun(){

		
		System.out.println("Child Fun");
		
	}
}

class Client7{

	public static void main(String[] args) {
		
		Parent7 obj = new Child7();
		obj.fun();
	}
}