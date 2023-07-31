/*
  charAt()
  
  public char charAt(int index)
 
  Description :-

  	-It return the character located specified index with the given string

parameters : integer(index)
returntype : character
*/



class Program15{

	public static void main(String[] args) {
		
		String str1="Pratik";

		System.out.println(str1.charAt(4)); //i
		System.out.println(str1.charAt(0)); //p
		System.out.println(str1.charAt(8)); //StringIndexOutOfBoundsException
   }
}


/*

Output :
	
	i
    P
    Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 8
        at java.lang.String.charAt(Unknown Source)
        at Program15.main(Program15.java:24)

*/