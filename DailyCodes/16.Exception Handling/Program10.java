
// try catch
class Demo{

	public static void main(String[] args) {
		
		System.out.println("Start Main");

		try{
			System.out.println(10/0);
		}


		catch(ArithmeticException obj){

			//System.out.println("Exception Occured");
			obj.printStackTrace();
		}


		System.out.println("End Main");
	}
}