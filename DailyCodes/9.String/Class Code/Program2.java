

//Three Ways of declaraing string

class Program2{

	public static void main(String[] args) {
		

		String str1="Pratik";

		String str2=new String("Pratik");

		char[] arr={'P','r','a','t','i','k'};
		String str3=new String(arr);


		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}