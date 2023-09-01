class Parent10{

	int x = 10;
	static int y = 20;

	Parent10(){

		System.out.println("Parent constructor");


	}

}

class Child10 extends Parent10 {

	int x =100;
	static int y= 200;

	Child10(){

	
		System.out.println("ee2222222222222222222e");
		System.out.println(y);
		System.out.println("e2222222222222222ee");


	}


	void acces (){

		System.out.println(x);
		System.out.println(y);
		System.out.println(super.x);
		System.out.println(super.y);
	
	}
}


class Client10{

	

	public static void main(String[] args) {
		
		Child10 obj = new Child10();
		obj.acces();

		
	}
}