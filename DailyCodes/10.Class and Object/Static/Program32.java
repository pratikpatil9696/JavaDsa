class Program32{

		 int x =500;


	void fun(int x){
	System.out.println(x);
	System.out.println(this.x);
	}


	
	public static void main(String[] args) {

		Program32 obj = new Program32();
		obj.fun(10);

	}
}