class Parent7{

	int x = 10;
	static int y = 20;
}


class Child7 extends Parent7{



	 void Demo(){

		x=100;
		y=200;

		System.out.println(x);
		System.out.println(y);
	}

	 void Demo2(){


		System.out.println(x);
		System.out.println(y);
	}
}

class Client7{

	public static void main(String[] args) {
		
		Child7 obj1 = new Child7();
		obj1.Demo();
		Child7 obj2 = new Child7();
		obj2.Demo2();
	}
}