
class User10{

	int x= 10;
	private int y=20;

	static int a=10;

	void fun(){


	}

	static void fun2(){}


}

class Program10{
	public static void main(String[] args) {
	

		User10 obj = new User10();

		obj.fun();

		System.out.println(obj.x);
		System.out.println(obj.y);

		System.out.println(x);
		System.out.println(y);
	}
}


/*

Output :
Program8.java:14: error: User8() has private access in User8
                User8 obj = new User8();
                            ^
1 error

*/