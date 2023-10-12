interface Demo{

	default void fun(){
			System.out.println("Fweunn");
	}
}

class Child implements Demo{

public void fun(){
	System.out.println("aaaaa");
}
}

class Client{

	public static void main(String[] args) {
		
		Demo obj = new Child	();
		obj.fun();
	}
}