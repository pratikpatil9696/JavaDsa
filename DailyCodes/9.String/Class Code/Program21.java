//Difference between String and StringBuffer

class Program21{
	
	public static void main(String[] args) {
		
		String str1="Pratik";

		System.out.println(System.identityHashCode(str1));

		str1=str1.concat("patil");

		System.out.println(System.identityHashCode(str1));



		StringBuffer str2 = new StringBuffer("Pratik");

		System.out.println(str2.capacity());

		str2.append("aaaaaaaaaaaaaaaaa");

		System.out.println(str2.capacity());

	}
}