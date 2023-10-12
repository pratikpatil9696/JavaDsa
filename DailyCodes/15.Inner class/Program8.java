class Outer{

	int x =10;
	class Inner{


		
		void fun2(){

		
			System.out.println("In fun Inner");
			System.out.println(x);
			fun1();
		}


	}


	void fun1(){

		System.out.println("In fun Outer");


	}


}

class Client{

	public static void main(String[] args) {
		
	/*	Outer obj2 = new Outer();
		System.out.println(obj2);
		System.out.println("**");
		Outer.Inner obj = obj2.new Inner();
		System.out.println(obj);
		obj2.fun1();
		obj.fun2(); */

		Outer obj = new Outer();

		Outer.Inner obj1 = obj.new Inner();

		obj1.fun2();
	}
}