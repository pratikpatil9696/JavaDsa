class Parent8{

	static int x = 10;

	static{

		System.out.println("In Parent Static Block");
	}

	static void access(){

		System.out.println(x);
	}
}

class Child8 extends Parent8{

	static{

		System.out.println("In child static block");
		System.out.println(x);
		access();
	}
}

class Client8{
	public static void main(String[] args) {
			
		System.out.println("in main");
		Child8 obj = new Child8();
	}
}