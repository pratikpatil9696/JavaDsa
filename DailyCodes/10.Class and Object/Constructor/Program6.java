class Program6{


	Program6(){

		System.out.println("Constructor111");
	}


	Program6(int x){

		System.out.println("Constructor222");
	}

	Program6(Program6 xyz){

		System.out.println("Constructor333");
	}


	public static void main(String[] args) {
		
		Program6 obj1 = new Program6();
		Program6 obj2 = new Program6(10);
		Program6 obj3 = new Program6(obj1);
	}
}