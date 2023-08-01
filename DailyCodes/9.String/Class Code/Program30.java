/*

Difference Between String and StringBuffer


*/

class Program30{

	public static void main(String[] args) {
		
		String str1 ="Pratik";
		StringBuffer str2 =new StringBuffer("Pratik");


		System.out.println("Checking String");
		System.out.println(System.identityHashCode(str1));
		str1=str1.concat("Patil");
		System.out.println(System.identityHashCode(str1));

		System.out.println("Checking StringBuffer");
		
		System.out.println(System.identityHashCode(str2));
		str2.append("Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatil");
		System.out.println(System.identityHashCode(str2));
		System.out.println(str2.capacity());




		
	}
}

/*
Output:
	
	Web Tech
	Cor

*/