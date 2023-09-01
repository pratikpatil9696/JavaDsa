class ICC{

		ICC(){

		System.out.println("ICC");

	}
}

class BCCI extends ICC{

	BCCI(){
	System.out.println("BCCI");
	}
}

class IPL extends BCCI{

	IPL(){
	System.out.println("IPL");
	}
}


class Program2{

	public static void main(String[] args) {
		
		IPL obj = new IPL();
	}
}