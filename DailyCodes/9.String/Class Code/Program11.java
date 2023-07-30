/*


   "+"         -> "+" operator call method for concat string that method is "apppend()" this method from "stringBuilder" class 
   "concat()"  -> simply concat the string

 */


class Program11{

	public static void main(String[] args) {
		
		String str1="Pratik";
		String str2="Patil";
		

		//Concat with "+" operator
		String str3=str1+str2;

		//Concat with "concat()" method
		String str4=str1.concat(str2);


		System.out.println(str3);
		System.out.println(str4);


	}
}