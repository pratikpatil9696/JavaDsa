class User13{
	
	int x=10;
	private int y=20;
	static int z=10;
	

	

	void Disp(){
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

	static void dip(){

	 int as=12;
	 System.out.println(as);
	}
}


class Program13{

	public static void main(String[] args) {
		
		User13 obj1 = new User13();
		User13 obj2 = new User13();

		obj1.Disp();

		obj1.x=100;
		obj2.z=300;

		obj1.Disp();
		obj2.Disp();
		System.out.println("***");
		obj1.dip();
	}
}