class Demo{
	
	void marry(){

		System.out.println("kirti");
	}
}


class Client{

	public static void main(String[] args) {
		
		Demo obj = new Demo(){

			void marry(){

				System.out.println("kattt");
				//fun();
			}

			void  fun(){

				System.out.println("funn");
			}

			return
		}.fun();

		obj.marry();

	}
}