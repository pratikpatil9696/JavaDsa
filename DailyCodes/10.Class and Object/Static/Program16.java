

class User16{

	private static void Display1(){

		System.out.println("Display1");
	}


	 static void Display2(){

		System.out.println("Display2");

		Display1();
	}
}




class Program16 {

	public static void main(String[] args) {


		User16 obj = new User16();

		obj.Display2();

	 
		 
	}
}