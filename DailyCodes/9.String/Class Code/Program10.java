/*

   "=="        -> Check identityHashCode
   "equals()"  -> Chech Content

 */


class Program10{

	public static void main(String[] args) {
		
		String str1="Pratik";
		String str2=new String("Pratik");
		

		//Checking with "==" operator
		if(str1==str2)
			System.out.println("equal");

		else
			System.out.println("not equal");




		//Checking with equals() method
		if(str1.equals(str2))
			System.out.println("equal");

		else
			System.out.println("not equal");


	}
}