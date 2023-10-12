class Demo {

	 static void fun(){

		System.out.println("aaa");
	}
}

class DemoChild extends Demo{


}

class Client {

	public static void main(String[] args) {
		
		DemoChild obj = new DemoChild();
		obj.fun();
	}
}