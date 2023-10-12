class Outer{

	Object m1(){

		System.out.println("In m1 Outer");

		class Inner{

			void m1(){

				System.out.println("In m1 Inner");
			}
		}

	 return new Inner();
	}
}

class Client{

	public static void main(String[] args) {
		/*
		Outer obj = new Outer();
		Object obj1 =obj.m1();
		obj1.m1();  //Object class kde m1() navachi method nahiye..
		*/


		Outer obj = new Outer();
		obj.m1().m1();		
	}
}