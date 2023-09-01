class Program3{
	
	private int jerNo = 0;
	private String name = null;

	
	Program3(int jerNo,String name){

		this.jerNo=jerNo;
		this.name=name;

		System.out.println(System.identityHashCode(name));

		
	}
		
	 void info(){

		System.out.println(jerNo+"  " +name );

		
	}

		public static void main(String[] args) {

			Program3 obj1=new Program3(45,"rohit");

			obj1.info();

			Program3 obj2=new Program3(7,"msd");
			obj2.info();

			Program3 obj3=new Program3(18,"virat");
			obj3.info();


			
			String str1 = "rohit";
			String str2 = "rohit";

			System.out.println(System.identityHashCode(str1));
			System.out.println(System.identityHashCode(str2));


		}

}