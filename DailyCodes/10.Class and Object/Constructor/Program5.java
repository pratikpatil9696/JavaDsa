class Program5{
	int x =10;


	Program5() 	{

		System.out.println("Constructorrr");
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(this);

	}

	
	void fun(){

		System.out.println("funnn");
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(this);
	}


	public static void main(String[] args) {
		
		Program5 obj = new Program5();
		System.out.println(obj);

		obj.fun();
				
	}
}
