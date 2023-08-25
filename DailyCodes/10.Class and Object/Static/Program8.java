
class User8{

	private User8(){

		System.out.println("Its is Constructor");
	}
}

class Program8{
	public static void main(String[] args) {
	

		User8 obj = new User8();
	}
}


/*

Output :
Program8.java:14: error: User8() has private access in User8
                User8 obj = new User8();
                            ^
1 error

*/