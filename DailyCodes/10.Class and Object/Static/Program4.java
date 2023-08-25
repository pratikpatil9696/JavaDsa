class Program4{

	static int x =10;
	void fun(){
		System.out.println("IN fun method");
	}
	public static void main(String[] args) {
		
		Program4  obj=new Program4();
		obj.fun();

		System.out.println(x);
	}
}