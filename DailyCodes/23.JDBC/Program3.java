
class Parent{

	@Deprecated
	void m1(){
		System.out.println("In M1");
	}
}

class Client{

	@SuppressWarnings("Hello")
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.m1();
	}
}