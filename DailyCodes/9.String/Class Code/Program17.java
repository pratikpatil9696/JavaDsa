/*
  compareToIgnoreCase()   it is Case insensitive
  
  public int compareToIgnoreCase(String str)
 
  Description :-

  	-it compares the str1 and str2 (Case insensitive), if both the string are equal it returns 0(zero) otherwise the returns the comparison
		-if both string equal return 0(zero)
		-if bith string not equal return differnece between ASCII value 


parameters : String (second String)
returntype : Integer
*/



class Program17{

	public static void main(String[] args) {
		
		String str1="pratik";
		String str2="PRATIK";

		System.out.println(str1.compareToIgnoreCase(str2));


		String str3="pratik";
		String str4="pratikpatil";

		System.out.println(str3.compareToIgnoreCase(str4));


   }
}


/*

Output :
	
	0
  -5

*/