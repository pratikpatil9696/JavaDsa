abstract class Parent{

	void carrer(){

		System.out.println("Doctor");
	}

	  void marry();
}

 class Child extends Parent{

	void marry(){

		System.out.println("Deepika");
	}
}


class Client{

	public static void main(String[] args) {
		
		Parent obj = new Child();
		obj.carrer();
		obj.marry();

		//Parent obj = new Parent();
	}
}