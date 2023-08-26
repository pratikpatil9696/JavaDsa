class User11{
	static int sta=5000;
	private int aa=400;
	int a=10;
	String name="Pratik";

	void Demo(){
		System.out.println(a);
		System.out.println(name);
	}


	void staDemo(){
		System.out.println(sta);
		System.out.println(aa);
	}


}


class Program11{

	public static void main(String[] args) {
			
			User11 obj1 = new User11();
			User11 obj2 = new User11();
			
	
			obj1.Demo();
			obj2.Demo();
		

			obj2.a=20;
			obj2.name="Ashu";

			System.out.println("*****After Change in Instance variable*****");

			
			obj1.Demo();
			obj2.Demo();
			System.out.println("****************************");



			System.out.println("Static Variable");

			obj1.staDemo();
			obj2.staDemo();

			obj2.sta=7000;
			System.out.println("*****After Change in Static  variable*****");
			
			obj1.staDemo();
			obj2.staDemo();


			





	}
}