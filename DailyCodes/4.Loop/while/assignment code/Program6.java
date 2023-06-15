//print the square of even digit

class Program6{
public static void main(String[]args){
	
	int n=3246865;
	
	while(n!=0){
	 
	  int rem =n%10;
	      n=n/10;

		if(rem % 2 == 0){
 			System.out.println(rem*rem);
		}
	}	
  
}
}
