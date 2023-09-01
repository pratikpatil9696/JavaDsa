class aaa{
int x=1;
	aaa(){
		System.out.println("aaaaaaaaaaaaaaaa");	
	}

	{
		System.out.println("Insataaaaaa");
	}
}


class bbb extends aaa{
int x=2;
	

	static{
		System.out.println("staticcccccccccccc");
	}
}

class ccc extends bbb{
int x=3;
	ccc(){
	
	System.out.println(x);
	
	}
}

class Demo11{

	public static void main(String[] args) {
		
		ccc obj = new ccc();
	}
}