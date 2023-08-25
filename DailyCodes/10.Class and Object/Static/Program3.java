class Program3{

	Program3(){
		System.out.println("In Constructor");
	}

	//System.out.println("In Constructor");
	public static void main(String[] args) {
		
		Program3 obj = new Program3();

		//static int a=10;

		Program3 obj1 =new Program3(); 
		System.out.println(obj1);
		System.out.println(obj);
	}
}