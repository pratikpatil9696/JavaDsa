/*

lastIndexOf()


*/

class Program27{

	public static void main(String[] args) {
		
		String str1 ="Shashi";

		
		

		System.out.println(str1.lastIndexOf('h',0)); //-1  "h" bhetla nahi mhnun "-1"
		System.out.println(str1.lastIndexOf('h',1)); //1
		System.out.println(str1.lastIndexOf('h',2)); //1
		System.out.println(str1.lastIndexOf('h',3)); //1
		System.out.println(str1.lastIndexOf('h',4)); //4
		System.out.println(str1.lastIndexOf('h',5)); //4
	}
}

/*
Output:
	-1
	1
	1
	1
	4
	4

*/