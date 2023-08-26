class Program17{
	


	int b=20;

	void disp(){
		System.out.println(b);
	}
	
	static int a=10;

	public static void main(String[] args) {
		
		System.out.println("Main   ");


		Program17 obj = new Program17();
		obj.disp();
	}

	static {

		System.out.println("Static Block");
	}



}