

interface Demo{

	 void gg();
}


class aaa implements Demo{



	public void gg(){
		System.out.println("aaaaaaaaa");
	}
}

class Demo1 {

	public static void main(String[] args) {
		
		aaa obj = new aaa();

		obj.gg();

	}
}