interface Demo{

	void fun();
	void gun();
}

abstract class Child1 implements Demo{

	public void gun(){
	System.out.println("In gun");
	}

	

} 

class Child2 extends Child1{

	
public void fun(){

		System.out.println("In Fun");
	}

	
	
}

class Client {

	public static void main(String[] args) {
		Child1 obj = new Child2();
		//	obj.fun();
		obj.gun();
		//obj.run();
	}
}