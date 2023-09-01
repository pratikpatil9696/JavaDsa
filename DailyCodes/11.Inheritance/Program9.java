class Parent9{

	int x=10;
	static int y=20;

	static {

		System.out.println("Parent static ");
	}

	Parent9(){

		System.out.println("Parent Constructorrrrrrrrrrrrrrrrrrrrr");
	}	

	void methodOne(){

		System.out.println(x);
		System.out.println(y);
	}

	static void methodTwo(){

       System.out.println(y);
	}
}	

class Child9 extends Parent9{

	Child9(){

		System.out.println("Child Constructor");
	}

	static{

		System.out.println("In child static block");
	}

	


}	


class Client9{

		public static void main(String[] args) {
			
			Child9 obj = new Child9();

			obj.methodOne();
			obj.methodTwo();
		}
}			