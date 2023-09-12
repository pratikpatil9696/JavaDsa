class Parent{

	 void fun(){

				System.out.println("IN fun");
	}

}

class Child extends Parent{

	void gun(){

		System.out.println("Gunn");
	}

}


class Client3{

	public static void main(String[] args) {
		
		Child obj1 = new Child();
		obj1.fun();
		obj1.gun();


		Parent obj2 = new Child();
		
		obj2.fun();
		obj2.gun();
	}
}