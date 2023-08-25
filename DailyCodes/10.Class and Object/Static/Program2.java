class Program2{
	
			Program2(){

				System.out.println("Constructor");
			}

			int x=10;

	public static void main(String[] args) {

			System.out.println("main");

			Program2 obj = new 	Program2();

			System.out.println(obj.x);

			System.out.println(obj.y);
	}

	int y=20;
}