
class Parent5{

	static{

		System.out.println("IN Parent Static Block");
		System.out.println("aaaaaaaaa");
	}

	Parent5(){
		System.out.println("parennnnnnnnt");
	}
}

class Child5 extends Parent5{

	static{

		System.out.println("In Child Static Block");
	}

	Child5(){
		System.out.println("Childddddddddddd");
	}
}

class Client5{

	public static void main(String[] args) {
		
		Child5 obj1 = new Child5();
		//Parent5 obj2 = new Parent5();
		
	}


	
}



