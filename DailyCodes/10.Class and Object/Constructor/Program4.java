class Program4{
	int x =10;


	Program4(int a) 	{

		System.out.println("Constructorrr");
	}

	void	fun(){

		System.out.print(x);
		System.out.println(this.x);
	}


	public static void main(String[] args) {
		
		Program4 obj = new Program4();
				
				
	}
}
