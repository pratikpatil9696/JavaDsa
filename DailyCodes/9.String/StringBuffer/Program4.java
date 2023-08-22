class Program4{
	
	public static void main(String[] args) {
		
		String str1 = "Pratik";

		String str2= new String("Patil");



		
		StringBuffer str3 = new StringBuffer("Pratik");
		StringBuffer str4 = new StringBuffer("Patil");

		String str8=str1.concat(str2);
		str3.append(str4);
		str1.concat(str2);

		
		System.out.println(str3);
		System.out.println(str4);
		//System.out.println(str5);
		System.out.println("***********");
		System.out.println(str1);
		System.out.println(str2);
		// 	System.out.println(str6);


	}
}