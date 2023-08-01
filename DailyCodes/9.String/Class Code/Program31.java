/*

Difference Between String and StringBuffer


*/

class Program31{

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


			System.out.println("*******************");
		StringBuffer st = new StringBuffer("");
		System.out.println(st.capacity());
		st.append("Shashi");
		System.out.println(st.capacity());

		st.append("Bagal");
		System.out.println(st.capacity());
		System.out.println(st);


		st.append("Core2Wweb");
		System.out.println(st.capacity());
		System.out.println(st);


		
	}
}

/*
Output:
	
	Web Tech
	Cor

*/