class Program7{


	Program7(){

		System.out.println("Constructor111");
		System.out.println(this);
	}


	Program7(int x){

		System.out.println("Constructor222");
		System.out.println(x);
	}

	Program7(Program7 	xyz){

		System.out.println("Constructor333");
		System.out.println(xyz);
		
	}


	public static void main(String[] args) {
		
		Program7 obj1 = new Program7();
		Program7 obj2 = new Program7(10);
		Program7 obj3 = new Program7(obj1);
		System.out.println(obj1);
	}
}