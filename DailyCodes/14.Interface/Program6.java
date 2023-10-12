interface Demo1 {

	
	default  void fun(){

		System.out.println("In fun -- Demo1");

	} 
}


class DemoChild implements Demo1 {

	
}
class Client{

	public static void main(String[] args) {

		DemoChild obj = new DemoChild();
		obj.fun();
		
			}
}