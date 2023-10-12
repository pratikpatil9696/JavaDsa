class Program3{

	void ass(){
		System.out.println("aaaaaaaaaa");
	}
	
	static Program3 obj = new Program3();
	private Program3(){

		System.out.println("constructor");
	}


	static Program3 getObject(){

		return obj;
	}
}

class Client{

	public static void main(String[] args) {

		
		
		Program3 obj1 = Program3.getObject();
obj1.ass();
		Program3 obj2 = Program3.getObject();

		Program3 obj3 = Program3.getObject();

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);


	}
}