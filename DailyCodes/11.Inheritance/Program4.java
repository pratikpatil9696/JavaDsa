class Parent4{

	int x=10;

	Parent4(){

		System.out.println("Parent Cnstructor");
	}

	void access(){

		System.out.println("Parent instance");
	}
}

class Child4 extends Parent4{

	int y=20;

	Child4(){

		System.out.println("Child Constructor");
		System.out.println(x);
		System.out.println(y);
		access();
	}
}

class Client4{

	public static void main(String[] args) {
		
		Child4 obj=new Child4();
		//obj.access();
	}
}