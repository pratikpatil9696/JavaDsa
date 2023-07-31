/*
  compareTo()   it is Case sensitive
  
  public int compareTo(String str2)
 
  Description :-

  	-it compares the str1 and str2 (Case sensitive), if both the string are equal it returns 0(zero) otherwise the returns the comparison
		-if both string equal return 0(zero)
		-if bith string not equal return differnece between ASCII value 


parameters : String (second String)
returntype : Integer
*/



class Program16{

	public static void main(String[] args) {
		
		String str1="Pratik";
		String str2="Patil";

		System.out.println(str1.compareTo(str2));
   }
}


/*

Output :
	
	17

*/