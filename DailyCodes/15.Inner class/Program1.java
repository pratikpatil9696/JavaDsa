class Outer{

	class Inner{

		void fun(){

			System.out.println("In fdadaun Inner");
		}
	}


	void gun(){

		System.out.println("In gun Outer");
	}
}

class Client{

	public static void main(String[] args) {
		
		//Outer obj2 = new Outer();
		Outer.Inner obj = new Outer().new Inner();
		obj.fun();
	}
}