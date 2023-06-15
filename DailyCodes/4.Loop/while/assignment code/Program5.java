//print the odd digit of given no

class Program5{
public static void main(String[]args){
	
	int n= 22448;
	int count=0;
	while(n!=0){
	
	  int rem = n % 10;
	  n=n/10;
		
		if(rem % 2 ==1){
		  count++;
		} 
	}
	System.out.println(count);
}
}
