class Outer{
	
	class Inner{

		void m1(){

			System.out.println("In m1");
		}
	}


	void m2(){

		System.out.println("In m2");
	}


	public static void main(String[] args) {
			

		Inner obj = new Outer().new Inner();
		obj.m1();
	}

}

class Client{


	
}