class Program31{

	Program31(){

		System.out.println(this);
	}

	Program31(Program31 xyz){
		this();

		System.out.println(xyz);
	}

	
	public static void main(String[] args) {
		
		Program31 obj1 = new Program31();

		Program31 obj2 = new Program31(obj1);
		System.out.println(obj1);	 	 	
	}
}