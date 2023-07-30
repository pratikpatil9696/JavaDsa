/*
 concat() mehtod
 
  Description :-

  	-Concatinate String to thid string i.e. another String is concatinated with the first String
	-Implements new array of character whose length is sum of str1.length and str2.length

parameters : String
returntype : String
*/



class Program13{

	public static void main(String[] args) {
		
		String str1="Pratik";
		String str2="Patil";
		
		String str3=str1.concat(str2);

		System.out.println(str3);
   }
}


/*

Output :
	
	-PratikPatil

*/