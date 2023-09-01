class Program1{
	
	private int jerNo = 0;
	private String name = null;
	
	Program1(int jerNo,String name){

		this.jerNo=jerNo;
		this.name=name;
		
	}
		
	 void info(){

		System.out.println(jerNo+"  " +name );
	}

		public static void main(String[] args) {

			Program1 obj1=new Program1(45,"rohit");
			obj1.info();

			Program1 obj2=new Program1(7,"msd");
			obj2.info();

			Program1 obj3=new Program1(18,"virat");
			obj3.info();

		}

}