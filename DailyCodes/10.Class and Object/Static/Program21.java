class Program21{
	in x=20;
	static int a=10;
	static{
		System.out.println("Block 1");
	}


	public static void main(String[] args) {
		
		System.out.println("Main");

		Program21 obj new Program21();
	}


	static{

		System.out.println("Block 2");
		System.out.println(a);
	}
}