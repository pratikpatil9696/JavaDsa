class User14{
	
	int x=10;
	static int y=10;
	static int aaa=10;
	

	
	void Disp(){

		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
	}

	static void dip(){

	    //System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
	}
}


class Program14{

	public static void main(String[] args) {
		
		User14 obj1 = new User14();
		
		obj1.Disp();
		obj1.dip();
	}
}