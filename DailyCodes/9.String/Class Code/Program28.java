/*

replace()


*/

class Program28{

	public static void main(String[] args) {
		
		String str1 ="Shashi";

		System.out.println(str1.replace('S','P'));
		System.out.println(str1.replace('S','B'));
	 

		str1=str1.replace('i','z'); 

		str1=str1.replace('S','P'); 
		str1=str1.replace('h','r'); 
		str1=str1.replace('a','a'); 
		str1=str1.replace('s','t'); 
		str1=str1.replace('h','i'); 
		str1=str1.replace('i','k'); //var 'i' chya jagi 'z' replace kelyamule ethe change zala nahi
	
		
		System.out.println(str1);
	}
}

/*
Output:
	
	Phashi
 	Bhashi
	Pratrz

*/