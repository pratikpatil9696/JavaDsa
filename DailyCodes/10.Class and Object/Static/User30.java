class Program30{

	Program30(){

		System.out.println("Program30 Constructor");
	}

	static{

		System.out.println("Program30 Static");
	}


}

Class User30{

	static{
		System.out.println("user Static 1");
	}

	public static void main(String[] args) {
		
		System.out.println("User main 30");

		Program30 obj = new Program30();

		System.out.println("End");


	}

	static{
		System.out.println("User Static 2");
	}

}