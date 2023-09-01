class Parent6{

	static int x=10;
	int y=28;

	static{

		System.out.println("parent static");
	}

	static void access(){

			System.out.println("In Parent static method ");
	}

	Parent6(){
		System.out.println("Parent constructor");
	}
	
}

class Child6 extends Parent6{


	Child6(){
	System.out.println(y);
	}
	
	static{

			System.out.println("child Static Block ");
			System.out.println(x);
			access();
	}

	
}

class Client6{

	public static void main(String[] args) {
		
		Child6 obj1=new Child6();
		//Parent6 obj2 = new Parent6();
		//Parent6 obj3 =new Child6();

	}

}