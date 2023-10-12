class Outer{

	void m1(){

		System.out.println("In Outer m1");
		
		class Inner{

			void m1(){

				System.out.println("in Inner m1");
			}

		}

		Inner obj = new Inner();
		obj.m1();

	}

	void m2(){

		System.out.println("In m2 Outer");
	}

	public static void main(String[] args) {
		
		Outer obj = new Outer();
		obj.m1();
		obj.m2();
	}
}