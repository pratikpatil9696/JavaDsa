class User12{
	
	int x=10;
	private int y=20;
	static int z=30;
	

	void Disp(){
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}


class Program12{

	public static void main(String[] args) {
		
		User12 obj1 = new User12();
		User12 obj2 = new User12();

		obj1.Disp();

		obj1.x=100;
		obj2.z=300;

		obj1.Disp();
		obj2.Disp();
	}
}