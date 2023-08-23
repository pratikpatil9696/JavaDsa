class Program3{
	int x=10;

	Program3(){

	System.out.println(x);
	}

	void Demo(){

			System.out.println(x);

	}

	public static void main(String[] args) {

		Program3 obj2 = new Program3();
		//obj2.Program3();
		
		Program3 obj1 = new Program3();
		obj1.x=20;
		obj1.Demo();
		
		


	}
}