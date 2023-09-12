class Parent6{

	
	Object fun(){

		System.out.println("Parent fun");
		return new Object(obj);
	}
}

class Child6 extends Parent6{

	String  fun(){

		
		System.out.println("Child Fun");
		return "ad";
	}
}

class Client6{

	public static void main(String[] args) {
		
		Parent6 obj = new Child6();
		obj.fun();
	}
}