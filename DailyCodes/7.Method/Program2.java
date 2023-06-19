
protected class Program2{

	int x=10;
	static int y=20;

	void fun(){

	System.out.println("In Fun...");
	System.out.println("In Fun********...");


	}

	static void gun(){

	System.out.println("In gun...");
	}


	public static void main(String []arsg){

		Program2 obj = new Program2();


		System.out.println(obj.x);
		System.out.println(y);

		obj.fun();
		obj.gun();
		}
}