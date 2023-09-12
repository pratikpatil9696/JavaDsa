class Program1{

	int x =10;

	Program1(){

		System.out.println(x);
		System.out.println(this.x);
	}

	Program1(int x){

		this.x = x;
		System.out.println(this.x);
	}

	public static void main(String[] args) {
		
		Program1 obj1 = new Program1();
		Program1 obj2 = new Program1(100);
	}
}