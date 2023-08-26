class Program18{
	
	int x=10;
	static int y=20;

	static{

		System.out.println("Static Block 1");
	}


	public static void main(String[] args) {
		
		System.out.println("In main");


	}


	static{

			Program18 obj = new Program18();
		System.out.println(obj.x);
		System.out.println(y);

		System.out.println("Static Block 2");
	}
}